package src.LLD.interview.tictactoe.board;

import src.LLD.interview.tictactoe.piece.PlayingPieceType;
import src.LLD.interview.tictactoe.player.Player;

import java.util.Arrays;
import java.util.Map;

public class TicTacToeBoard {
    private int dimensions;

    private static char[][] board;

    public TicTacToeBoard(int dimensions, Map<PlayingPieceType, Player> playerMap){
        this.dimensions = dimensions;
        board = new char[dimensions][dimensions];
    }

    public int getDimensions() {
        return dimensions;
    }

    public void makeMove(int x, int y, PlayingPieceType playingPiece){
        //make move here.
        if(board[x][y]!='\u0000'){
            throw new IllegalArgumentException("Cell is already occupied");
        }
        board[x][y] = mapPlayingPieceToSymbol(playingPiece);
    }

    public void reset(){
        for(char[] row: board){
            Arrays.fill(row, '\u0000');
        }
    }

    private char mapPlayingPieceToSymbol(PlayingPieceType playingPiece){
        switch (playingPiece){
            case X: return 'X';
            case O: return 'O';
            case STAR: return '*';
            default: return '\u0000';
        }
    }

    public boolean checkWin(int row, int col, PlayingPieceType playingPiece){
        char symbol = mapPlayingPieceToSymbol(playingPiece);
        boolean winRow = true, winCol = true, winDiagonal = true, winReverseDiagonal = true;
        for(int i = 0; i<dimensions; i++){
            if(board[row][i]!=symbol){
                winRow = false;
            }
            if(board[i][col]!=symbol){
                winCol = false;
            }
            if(board[i][i]!=symbol){
                winDiagonal = false;
            }
            if(board[i][dimensions-i-1]!=symbol){
                winReverseDiagonal = false;
            }
        }
        return winRow || winCol || winDiagonal || winReverseDiagonal;
    }

    private boolean checkRow(int row, char symbol){
        for(int i = 0; i<dimensions; i++){
            if(board[row][i]!=symbol){
                return false;
            }
        }
        return true;
    }

    private boolean checkCol(int col, char symbol){
        for(int i=0; i<dimensions; i++){
            if(board[i][col]!=symbol){
                return false;
            }
        }
        return true;
    }

    private boolean checkDiagonal(char symbol){
        boolean leftDiagonal = true;
        boolean rightDiagonal = true;
        for(int i = 0; i<dimensions; i++){
            leftDiagonal&=board[i][i]==symbol;
            rightDiagonal&=board[board.length-i-1][i]==symbol;
            if(!leftDiagonal || !rightDiagonal){
                return false;
            }
        }
        return true;
    }

    public boolean freeCellsAvailable(){
        for(int i = 0; i<dimensions; i++){
            for(int j = 0; j<dimensions; j++){
                if(board[i][j]=='\u0000'){
                    return true;
                }
            }
        }
        return false;
    }

    public boolean isWin(int row, int col, PlayingPieceType playingPiece){
        char symbol = mapPlayingPieceToSymbol(playingPiece);
        if(checkRow(row, symbol) || checkCol(col, symbol) || checkDiagonal(symbol)){
            return true;
        }
        return false;
    }

    public void printboard(){
        for(int i = 0; i<dimensions; i++){
            for(int j = 0; j<dimensions; j++){
                if(board[i][j]=='\u0000'){
                    System.out.print("- ");
                    continue;
                }
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }
}