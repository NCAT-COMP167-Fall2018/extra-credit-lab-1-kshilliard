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
        playGame(gameBoard);
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
        Random rand = new Random();
        int randNumber = rand.nextInt(7);
        int place = 5;
        while (gameBoard[randNumber][place] != 'b') {
            place = place - 1;
        }
        gameBoard[randNumber][place] = currentPlayer;
    }
    
    private static char playGame(char[][] gameBoard) {
        char result = 't';
        int i = 0;
        char turn;
        while (i < 10) {
            turn = 'r';
            takeTurn(turn);
            printBoard();
            System.out.println(" ");
            System.out.println(" ");
            turn = 'y';
            takeTurn(turn);
            printBoard();
        }
        return result;
    }
}
