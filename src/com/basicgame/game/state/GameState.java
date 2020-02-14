/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.basicgame.game.state;

import com.basicgame.game.Game;
import com.basicgame.game.entity.creature.Player;
import com.basicgame.game.gfx.Assets;
import com.basicgame.game.tiles.Tile;
import java.awt.Graphics;

/**
 *
 * @author MLachaw
 */
public class GameState extends State{

    private Player player;
    public GameState(Game game)
    {
        super(game);
        player = new Player(game, 100 , 100);
    }
    
    
    @Override
    public void tick() 
    {
        player.tick();
    }

    @Override
    public void render(Graphics g) {
        
        //g.drawImage(Assets.rickf1, 0, 0,null);
        
          player.render(g);
          Tile.tiles[2].render(g, 0, 0);
        
        }
    
}
