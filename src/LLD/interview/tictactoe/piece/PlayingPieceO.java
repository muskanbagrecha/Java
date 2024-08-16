package src.LLD.interview.tictactoe.piece;

public class PlayingPieceO implements PlayingPiece {
    private final PlayingPieceType piece;
    public PlayingPieceO(){
        this.piece = PlayingPieceType.O;
    }

    @Override
    public PlayingPieceType getPieceType(){
        return this.piece;
    }
}
