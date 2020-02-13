/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.basicgame.game;

import com.basicgame.game.display.Display;

/**
 *
 * @author MLachaw
 */
public class Laucher {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Game game = new Game("BasicEngine", 640, 360);
        game.start();
    }
    
}
