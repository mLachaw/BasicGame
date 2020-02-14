/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.basicgame.game.entity.creature;

import com.basicgame.game.Game;
import com.basicgame.game.gfx.Assets;
import java.awt.Graphics;

/**
 *
 * @author MLachaw
 */
public class Player extends Creature{
    
    
    private Game game;
    
    public Player(Game game, float x, float y) {
        super(x, y,DEFAULT_CREATURE_WIDTH,DEFAULT_CREATURE_HEIGHT);
        this.game=game;
    }

    @Override
    public void tick() {
       getInput();
       move();
        
        
    }
    
    private void getInput()
    {
        xMove=0;
        yMove=0;
        
        if(game.getKeyManager().up)
            yMove =-speed;
        if(game.getKeyManager().down)
            yMove =+speed;
        if(game.getKeyManager().left)
            xMove =-speed;
        if(game.getKeyManager().right)
            xMove =+speed;
    }

    @Override
    public void render(Graphics g) {
       g.drawImage(Assets.rickf1,(int) x,(int) y,width,height, null);
    }
    
}
