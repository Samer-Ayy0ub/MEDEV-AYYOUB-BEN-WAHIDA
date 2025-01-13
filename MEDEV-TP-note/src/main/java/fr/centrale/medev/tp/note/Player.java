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
    private String color;
    
    public Player(String aName, String aColor){
        this.name=aName;
        this.color=aColor;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    // methode permettant le joueur de faire une 
    public void play(int x, int y, Board board) {
       board.makeMove(x, y, this);   
    }
}
