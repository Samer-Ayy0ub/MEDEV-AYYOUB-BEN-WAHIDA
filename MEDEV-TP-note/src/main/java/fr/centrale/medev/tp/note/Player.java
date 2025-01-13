/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fr.centrale.medev.tp.note;

/**
 *
 * @author samer
 */
public class Player {
    private String name;
    private char color;
    
    /**
     *
     * @param aName
     * @param aColor
     */
    public Player(String aName, char aColor){
        this.name=aName;
        this.color=aColor;
    }

    Player() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    /**
     *
     * @return
     */
    public String getName() {
        return name;
    }

    /**
     *
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     *
     * @return
     */
    public char getColor() {
        return color;
    }

    /**
     *
     * @param color
     */
    public void setColor(char color) {
        this.color = color;
    }
  

    /**
     *  method that plays out a turn for the player
     * @param x
     * @param y
     * @param board
     */
    public void play(int x, int y, Board board) {
       board.makeMove(x, y, this.color);   
    }
}
