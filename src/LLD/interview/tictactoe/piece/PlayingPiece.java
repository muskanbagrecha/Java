package src.LLD.interview.tictactoe.piece;

public class PlayingPiece {
    private PlayingPieceType playingPiece;

    public PlayingPiece(PlayingPieceType playingPiece){
        this.playingPiece = playingPiece;
    }

    public PlayingPieceType getPieceType(){
        return this.playingPiece;
    }
}
