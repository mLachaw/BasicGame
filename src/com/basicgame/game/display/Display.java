/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.basicgame.game.display;

import javax.swing.JFrame;
import java.awt.Canvas;
import java.awt.Dimension;

/**
 *
 * @author MLachaw
 */
public class Display {
    
    private JFrame frame;
    private Canvas canvas; //zmienna którą bedziemy wykorzystywali do tworzenia warstwy na której wyświetlane będą tekstury
    
    private String title;
    private int width, height;
    
    /*==========
    Konstruktor
    ==========*/
    public Display(String title,int width, int height )
    {
        this.title = title;
        this.width = width;
        this.height = height;
        
        createDisplay();
    }
    
    /*=================
    Nasza metoda do tworzenia okna, konstruktor 
    Dispaly(String,int,int)
    inicjuje tą metodę podając jej 
    parametry które sam przyjmuje.
    ==================*/
    private void createDisplay()
    {
        frame = new JFrame(title);
        frame.setSize(width, height);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
        
        
        /*====================
        Tworzymy nasze "płutno" tak samo jak ramke, 
        zmieniamy tylko sposob 
        w jaki przyjmuje wysokość 
        =====================*/
        canvas = new Canvas();
        canvas.setPreferredSize(new Dimension(width, height));
        canvas.setMaximumSize(new Dimension(width, height));
        canvas.setMinimumSize(new Dimension(width, height));
        
        frame.add(canvas);
        frame.pack();

    }
    
    public Canvas getCanvas()
    {
        return canvas;
    }
    
}
