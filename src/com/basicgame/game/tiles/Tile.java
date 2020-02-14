/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.basicgame.game.tiles;

import java.awt.Graphics;
import java.awt.image.BufferedImage;

/**
 *
 * @author MLachaw
 */
public class Tile {
    
    //STATICS HERE
    public static Tile[] tiles = new Tile[256];
    public static Tile greenGrassTile = new GreenGrassTile(0);
    public static Tile darkGrassTile = new DarkGrassTile(1);
    public static Tile rockTile = new RockTile(2);
    public static Tile treeTile = new TreeTile(3);
    
    //CLASS
    protected BufferedImage texture;
    protected static final int TILE_WIDTH = 64;
    protected static final int TILE_HEIGHT= 64;
    protected  int id ;
    
    public  Tile(BufferedImage texture,int id)
    {
        this.texture = texture;
        this.id=id;
        tiles[id] = this;
    }
    
    
    
    public void tick()
    {
        
    }
    
    public void render(Graphics g, int x,int y)
    {
        g.drawImage(texture, x, y,TILE_WIDTH,TILE_HEIGHT, null);
    }
    
    public boolean isSolid()
    {
       return false; 
    }
    
    public int getId()
    {
        return id;
    }
    
      
}
