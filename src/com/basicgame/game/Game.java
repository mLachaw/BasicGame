/*===============
Ta klasa ma odpowiadać za działanie naszej gry,
-uruchamianie
-pauza
-logika itp.
================*/
package com.basicgame.game;

import com.basicgame.game.display.Display;
import com.basicgame.game.gfx.Assets;
import com.basicgame.game.gfx.ImageLoader;
import com.basicgame.game.gfx.SpriteSheet;
import com.basicgame.game.state.GameState;
import com.basicgame.game.state.State;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.image.BufferStrategy;
import java.awt.image.BufferedImage;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Game implements Runnable {
    
    
   
    private Display display;
    public int width,height;
    public String title;
    
    private Thread thread;
    private boolean running = false;
    
    private BufferStrategy bs;
    private Graphics g;
    
    //States
    private State gameState;
    
    public Game(String title, int width, int height)
    {
        this.width=width;
        this.height=height;
        this.title=title;
        
    }
    
    private void init() 
    {
       display = new Display(title, width, height);
       Assets.init();
       gameState =new GameState();
       State.setState(gameState);
       
    }
    
    private void tick()
    {
        if(State.getState()!=null)
            State.getState().tick();
       
    }
    
    private void render()
    {
        bs = display.getCanvas().getBufferStrategy();
        if(bs == null)
        {
            display.getCanvas().createBufferStrategy(3);
            return;
        }
        g = bs.getDrawGraphics();
        //Czyscimy obraz
        g.clearRect(0,0, width, height);
        
        //Tutaj rysuje nasze grafiki
        if(State.getState()!=null)
            State.getState().render(g);
            
        //koniec rysowania
        bs.show();
        g.dispose();
    }
    
    public void run()
    {
        init();
        
        int fps = 60;
        double timePerTick = 1000000000/fps;
        double delta =0;
        long now;
        long lastTime = System.nanoTime();
        long timer =0;
        int ticks =0;
        
        while(running)
        {
            now = System.nanoTime();
            delta+=(now-lastTime)/timePerTick;
            timer+=now-lastTime;
            lastTime = now;
            if(delta>=1)
            {
            tick();
            render();
            ticks++;
            delta--;
            }
            
            if(timer>=1000000000)
            {
                System.out.println("Ticks and Frames: "+ticks );
                ticks=0;
                timer=0;
            }
        }
        stop(); //dodajemy metodę stop gdyby nasz watek sie nie zatrzymał z jakiegoś powodu po zmienieniu stanu zmiennej "runnable"
    }
    
    public synchronized void start()
    {
        if(running) //przerywa metode jesli watek już działa
            return;
        running = true;
        thread = new Thread(this);
        thread.start();
        
    }
    
    public synchronized void stop()
    {
        if(!running) //przerywa metode jesli watek już został zatrzymany wcześniej
            return;
        running = false;
        
        /*=============
        zatrymujemy nasz watek,
        thread.join() musi znajdować się w try/catch
        ===============*/
        try {
            thread.join();
        } catch (InterruptedException ex) {
            Logger.getLogger(Game.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    
}
