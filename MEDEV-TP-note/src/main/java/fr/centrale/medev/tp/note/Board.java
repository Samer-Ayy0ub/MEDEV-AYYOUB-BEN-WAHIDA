/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fr.centrale.medev.tp.note;

/**
 *
 * @author Nadhem
 */

import java.util.ArrayList;
import java.util.List;

public class Board {
    private final Cell[][] grid;

    // Dimensions du plateau
    private static final int SIZE = 8;

    // Constructeur
    public Board() {
        grid = new Cell[SIZE][SIZE];
        initializeBoard();
    }
     // Initialisation du plateau
    private void initializeBoard() {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                grid[i][j] = new Cell(i, j); // Chaque cellule connaît ses coordonnées
            }
        }

        // Placement initial des pions au centre du plateau
        grid[3][3].setState('B');
        grid[4][4].setState('B');
        grid[3][4].setState('N');
        grid[4][3].setState('N');
    }

}
