
package com.basicgame.game.state;

import com.basicgame.game.Game;
import java.awt.Graphics;

/**
 *
 * @author MLachaw
 */
public abstract class State {
    
    private static  State currentState =null;
    public static void setState(State state)
    {
        currentState = state;
    }
    
    public static State getState()
    {
        return currentState;
    }
    
    
    //class
    protected Game game;
    public State(Game game)
    {
        this.game = game;
    }
    
    public abstract void tick();
    public abstract void render(Graphics g);
    
}
