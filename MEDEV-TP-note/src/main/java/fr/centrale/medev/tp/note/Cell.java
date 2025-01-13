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
    public Cell(int x, int y) {
        this.x = x;
        this.y = y;
        this.state = ' '; // Par défaut, la cellule est vide
    }
    
    // Getter pour X
    public int getX() {
        return x;
    }

    // Getter pour Y
    public int getY() {
        return y;
    }

    // Getter pour l'état
    public char getState() {
        return state;
    }

    // Setter pour l'état
    public void setState(char state) {
        this.state = state;
    }
    // Représentation en chaîne de caractères (pour affichage)
    @Override
    public String toString() {
        return String.valueOf(state);
    }
}
