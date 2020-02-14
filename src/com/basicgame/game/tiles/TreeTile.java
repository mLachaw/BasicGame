/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.basicgame.game.tiles;

import com.basicgame.game.gfx.Assets;
import java.awt.image.BufferedImage;

/**
 *
 * @author MLachaw
 */
public class TreeTile extends Tile {

    public TreeTile(int id) {
        super(Assets.tree, id);
    }

    
    
    @Override
    public boolean isSolid()
    {
       return true; 
    }
}
