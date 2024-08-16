package src.LLD.interview.tictactoe.piece;

public class PlayingPieceStar implements PlayingPiece {
    private final PlayingPieceType piece;

    public PlayingPieceStar(){
        this.piece = PlayingPieceType.STAR;
    }

    @Override
    public PlayingPieceType getPieceType() {
        return piece;
    }
}
