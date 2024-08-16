package src.LLD.interview.tictactoe;

import src.LLD.interview.tictactoe.board.TicTacToeBoard;
import src.LLD.interview.tictactoe.player.Player;

import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class TicTacToeGame {
    private TicTacToeBoard ticTacToeBoard;
    private Deque<Player> players;

    public TicTacToeGame(int dimensions, List<Player> players) {
        this.ticTacToeBoard = new TicTacToeGameBuilder()
                .setDimensions(dimensions)
                .addPlayers(players)
                .build();
        this.players = new LinkedList<>(players);
    }

    public void startGame(){
        System.out.println("Starting TICTACTOE game!!");
        String result = playGame();
        System.out.println(result);
    }

    public String playGame(){
        while(ticTacToeBoard.freeCellsAvailable()){
            Player currentPlayer = players.removeFirst();
            int[] spot = getInput(currentPlayer);
            int row = spot[0];
            int col = spot[1];
            if(row<=0 || col<=0 || row>ticTacToeBoard.getDimensions() || col>ticTacToeBoard.getDimensions()){
                throw new IllegalArgumentException("Invalid move");
            }
            ticTacToeBoard.makeMove(row, col, currentPlayer.getPlayingPiece());
            ticTacToeBoard.printboard();
            if(ticTacToeBoard.checkWin(row, col, currentPlayer.getPlayingPiece())){
                return currentPlayer.getName() + " has won";
            }
            players.addLast(currentPlayer);
        }
        return "tie";
    }

    private static int[] getInput(Player currentPlayer){
        System.out.printf("It is %s's turn\n", currentPlayer.getName());
        System.out.print("Make a move. Enter row,column:");
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String[] values = input.split(",");
        int[] spot = new int[]{Integer.parseInt(values[0]), Integer.parseInt(values[1])};
        return spot;
    }
}
