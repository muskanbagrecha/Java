package src.LLD.interview.tictactoe.player;

import src.LLD.interview.tictactoe.piece.PlayingPiece;
import src.LLD.interview.tictactoe.piece.PlayingPieceType;

import java.util.UUID;

public class Player {
    private UUID id;
    private String name;
    private PlayingPieceType playingPiece;

    public Player(String name, char ch) {
        this.id = UUID.randomUUID();
        this.name = name;
        this.playingPiece = PlayingPieceType.mapCharToPlayingPieceType(ch);
    }

    public UUID getId() {
        return id;
    }

    public PlayingPieceType getPlayingPiece() {
        return playingPiece;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
