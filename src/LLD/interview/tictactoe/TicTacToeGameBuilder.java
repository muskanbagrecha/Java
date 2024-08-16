package src.LLD.interview.tictactoe;

import src.LLD.interview.tictactoe.board.TicTacToeBoard;
import src.LLD.interview.tictactoe.piece.PlayingPiece;
import src.LLD.interview.tictactoe.piece.PlayingPieceType;
import src.LLD.interview.tictactoe.player.Player;

import java.util.HashMap;
import java.util.List;

public class TicTacToeGameBuilder {
    private int dimensions;
    private HashMap<PlayingPieceType, Player> playersPieces;

    public TicTacToeGameBuilder(){
        playersPieces = new HashMap<>();
    }

    public TicTacToeGameBuilder setDimensions(int dimensions){
        this.dimensions = dimensions;
        return this;
    }

    public TicTacToeGameBuilder addPlayers(List<Player> players){
        for (Player player : players) {
            addPlayer(player);
        }
        return this;
    }

    public TicTacToeGameBuilder addPlayer(Player player){
        if(playersPieces.containsKey(player.getPlayingPiece())){
            throw new RuntimeException(playersPieces.get(player.getPlayingPiece()) + " is taken");
        }
        playersPieces.put(player.getPlayingPiece(), player);
        return this;
    }

    public TicTacToeBoard build(){
        return new TicTacToeBoard(dimensions, playersPieces);
    }


}