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
    
    public Player(String aName, char aColor){
        this.name=aName;
        this.color=aColor;
    }

    Player() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public char getColor() {
        return color;
    }

    public void setColor(char color) {
        this.color = color;
    }
    // methode permettant le joueur de faire une 
    public void play(int x, int y, Board board) {
       board.makeMove(x, y, this.color);   
    }
}
