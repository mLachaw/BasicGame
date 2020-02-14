/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.basicgame.game.entity.creature;

import com.basicgame.game.entity.Entity;

/**
 *
 * @author MLachaw
 */
public abstract class Creature extends Entity{

    
    public static final int DEFAULT_HELTH =10;
    public static final float DEFAULT_SPEED =3.0f;
    public static final int DEFAULT_CREATURE_WIDTH =64;
    public static final int DEFAULT_CREATURE_HEIGHT =64;
    
    protected int health;
    protected float speed;
    protected float xMove;
    protected float yMove;
    
    public Creature(float x, float y,int width,int height) {
        super(x, y, width,height);
        health = DEFAULT_HELTH;
        speed=DEFAULT_SPEED;
        xMove =0;
        yMove =0;
    }
    
    public void move()
    {
        x+=xMove;
        y+=yMove;
    }
    
    //GETTERS AND SETTERS BELOW
     public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public float getSpeed() {
        return speed;
    }

    public void setSpeed(float speed) {
        this.speed = speed;
    }
    
    public float getxMove() {
        return xMove;
    }

    public void setxMove(float xMove) {
        this.xMove = xMove;
    }

    public float getyMove() {
        return yMove;
    }

    public void setyMove(float yMove) {
        this.yMove = yMove;
    }
    
}
