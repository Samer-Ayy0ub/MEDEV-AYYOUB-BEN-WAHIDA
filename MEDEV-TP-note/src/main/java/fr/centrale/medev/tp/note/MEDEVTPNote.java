/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package fr.centrale.medev.tp.note;

/**
 *
 * @author samer
 */
public class MEDEVTPNote {

    /**
     *
     * @param args
     */
    public static void main(String[] args) {

        Game game = new Game();
        game.start();
        while (!game.checkWinner()){          
            game.takeTurn();
            game.switchTurn();           
        }

    }
}
