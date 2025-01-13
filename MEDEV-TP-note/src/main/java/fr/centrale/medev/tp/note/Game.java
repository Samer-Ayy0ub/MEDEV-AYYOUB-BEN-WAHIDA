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
    
    /**
     *
     */
    public Game(){
        
    }
   // methode qui initialize Board et les Joueurs 

    /**
     *
     */
   public void start(){
       Scanner scanner = new Scanner(System.in);
       board.initialize();
       System.out.println("Entrez le nom du premier joueur (pieces noires):");
       String player1Name = scanner.nextLine();
       player1 = new Player(player1Name, 'N');
       System.out.println("Entrez le nom du deuxieme joueur (pieces blanches):");
       String player2Name = scanner.nextLine();
       player2 = new Player(player2Name, 'B');
       currentPlayer = player1;
       
   }

    /**
     * method that plays out a turn for the currentPlayer
     */
   public void takeTurn(){
       board.display();
       System.out.println("C'est le tour de : "+currentPlayer.getName());
       Scanner scanner = new Scanner(System.in);
       int x = -1, y = -1; // Variables for the position
       while (true) {
            System.out.print("Entrez la position desirée (ex: d3): ");
            String input = scanner.nextLine().toLowerCase().trim();

            // Validate input format
            if (input.length() == 2) {
                char letter = input.charAt(0);
                char number = input.charAt(1);

                // Check if the letter is between 'a' and 'h'
                if (letter >= 'a' && letter <= 'h') {
                    // Check if the number is between '1' and '8'
                    if (number >= '1' && number <= '8') {
                        // Convert letter to y (1 to 8) and number to x
                        y = letter - 'a' + 1; // 'a' -> 1, 'b' -> 2, ..., 'h' -> 8
                        x = Character.getNumericValue(number); // '1' -> 1, ..., '8' -> 8
                         
                    }
                }
            }
            
            if (board.isValidMove(x,y)){
                break;
            }
            System.out.println("Position Invalide, entrez une position valide");   
        }
        currentPlayer.play(x, y, board);
        
        
    }
   
    /**
     * method that switches the currentPlayer between player 1 and 2
     */
    public void switchTurn(){      
    if (currentPlayer == player1) {
        currentPlayer = player2;
        } else {
        currentPlayer = player1;
        }
    }
   
    /**
     *  method that checks if the game ended and prints the resulting winner
     * @return
     */
    public boolean checkWinner(){
       int N = board.countPieces('N');
       int B =board.countPieces('B');
       if (N+B == 64){
           if (N > B){
               System.out.println(player1.getName()+" est vainceur!!");
               return true;
           }
           else if (N < B){
               System.out.println(player1.getName()+" est vainceur!!");
               return true;
        }
           else {
               System.out.println("Egalité!!");
               return true;
           }
           
      }
      return false;
       
   }

   }
    
       
   

