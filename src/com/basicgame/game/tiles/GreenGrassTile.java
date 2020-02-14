/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.basicgame.game.tiles;

import com.basicgame.game.gfx.Assets;

/**
 *
 * @author MLachaw
 */
public class GreenGrassTile extends Tile{

    public GreenGrassTile(int id) {
        super(Assets.greenGrass,id);
    }

@Override
    public boolean isSolid()
    {
       return false; 
    }

    
}
