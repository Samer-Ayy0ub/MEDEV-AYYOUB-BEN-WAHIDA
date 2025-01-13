/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fr.centrale.medev.tp.note;

import java.util.Scanner;

/**
 *
 * @author samer
 */
public class Game {
    private Board board;
    private Player player1;
    private Player player2;
    private Player currentPlayer;
    
    public Game(){
        
    }
    
   public void start(){
       Scanner scanner = new Scanner(System.in);
       board.initialize();
       System.out.println("insert Player 1 name (black pieces):");
       String player1Name = scanner.nextLine();
       player1 = new Player(player1Name, "N");
       System.out.println("insert Player 2 name (white pieces):");
       String player2Name = scanner.nextLine();
       player2 = new Player(player2Name, "B");
       
   }
   
}
