package src.LLD.interview.tictactoe;

import src.LLD.interview.tictactoe.player.Player;

import java.util.Arrays;
import java.util.Scanner;

public class TicTacToeDriver {
    public static void main(String[] args){
        System.out.println("Welcome to Tic Tac Toe");
        System.out.println("Enter board dimensions");
        Scanner scanner = new Scanner(System.in);
        int dimensions = scanner.nextInt();
        System.out.println("Enter player 1 name");
        String player1Name = scanner.next();
        System.out.println("Enter player 2 name");
        String player2Name = scanner.next();
        Player player1 = new Player(player1Name, 'X');
        Player player2 = new Player(player2Name, '*');
        TicTacToeGame game1 = new TicTacToeGame(dimensions, Arrays.asList(player1, player2));
        game1.startGame();
    }
}
