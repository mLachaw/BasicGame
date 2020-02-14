/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.basicgame.game.gfx;

import java.awt.Image;
import java.awt.image.BufferedImage;

/**
 *
 * @author MLachaw
 */
public class Assets {
    public static final int width = 126, height = 165;
    public static BufferedImage rickf1,rickf2,rickf3,rickf4,tree,greenGrass,darkGrass,rocks,rickb1,rickb2,rickb3,rickb4;
    //public static Image player;
    public static void init ()
    {
        SpriteSheet sheet = new SpriteSheet(ImageLoader.loadImage("/textures/rick.png"));
       
        rickf1 = sheet.crop(0,0,width,height);
        rickf2 = sheet.crop(width, 0, width, height);
        rickf3 = sheet.crop(width*2, 0, width, height);
        rickf4 = sheet.crop(width*3, 0, width, height);
        
        tree = sheet.crop(0,height,width,height);
        greenGrass = sheet.crop(width, height, width, height);
        darkGrass = sheet.crop(width*2, height, width, height);
        rocks = sheet.crop(width*3, height, width, height);
        
        rickb1 = sheet.crop(0,height*2,width,height);
        rickb2 = sheet.crop(width, height*2, width, height);
        rickb3 = sheet.crop(width*2, height*2, width, height);
        rickb4 = sheet.crop(width*3, height*2, width, height);
    }
    
}
