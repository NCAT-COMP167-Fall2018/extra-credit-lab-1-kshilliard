/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package connectfour;
import java.util.Random;

/**
 *
 * @author bugsb
 */
public class ConnectFour {

    /**
     * @param args the command line arguments
     */
    
    static int seven = 7;
            
    private static char[][] gameBoard = new char [6][7];
    private static char currentPlayer;
    
    public static void main(String[] args) {
        gameBoard = createBoard('b');
        printBoard();
    }
    
    private static char[][] createBoard(char startingCharacter) {
        char [][] board = new char [6][7];
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                board[i][j] = startingCharacter;
            }
        }
        return board;
    }
    
    private static void printBoard() {
        for (int i = 0; i < gameBoard.length; i++) {
            for (int j = 0; j < gameBoard[i].length; j++) {
                System.out.print(gameBoard[i][j] + " ");
            }
            System.out.println(" ");
        }
        
    }
    
    private static void takeTurn(char currentPlayer) {
        
    }
    
    private static void playGame(char[][] gameBoard) {
        
    }
}
