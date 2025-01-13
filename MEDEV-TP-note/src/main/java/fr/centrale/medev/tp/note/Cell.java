/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fr.centrale.medev.tp.note;

/**
 *
 * @author Nadhem
 */
public class Cell {
    private int x; // Position X de la cellule
    private int y; // Position Y de la cellule
    private char state; // 'N' pour Noir, 'B' pour Blanc, ' ' pour vide
    
     // Constructeur

    /**
     *
     * @param x
     * @param y
     */
    public Cell(int x, int y) {
        this.x = x;
        this.y = y;
        this.state = ' '; // Par défaut, la cellule est vide
    }
    
    // Getter pour X

    /**
     *
     * @return
     */
    public int getX() {
        return x;
    }

    // Getter pour Y

    /**
     *
     * @return
     */
    public int getY() {
        return y;
    }

    // Getter pour l'état

    /**
     *
     * @return
     */
    public char getState() {
        return state;
    }

    // Setter pour l'état

    /**
     *
     * @param state
     */
    public void setState(char state) {
        this.state = state;
    }
    // Représentation en chaîne de caractères (pour affichage)

    /**
     *
     * @return
     */
    @Override
    public String toString() {
        return String.valueOf(state);
    }
}
