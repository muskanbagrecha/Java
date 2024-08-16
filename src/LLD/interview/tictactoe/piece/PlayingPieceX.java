package src.LLD.interview.tictactoe.piece;

public class PlayingPieceX implements PlayingPiece{
    private final PlayingPieceType pieceType;

    public PlayingPieceX(){
        pieceType = PlayingPieceType.X;
    }

    @Override
    public PlayingPieceType getPieceType() {
        return pieceType;
    }
}
