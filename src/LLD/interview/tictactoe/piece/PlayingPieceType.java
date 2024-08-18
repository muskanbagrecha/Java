package src.LLD.interview.tictactoe.piece;

public enum PlayingPieceType {
    X('X'),
    O('O'),
    STAR('*');

    private final char symbol;

    PlayingPieceType(char symbol) {
        this.symbol = symbol;
    }

    public char getSymbol() {
        return symbol;
    }

    public static PlayingPieceType mapCharToPlayingPieceType(char ch) {
        for (PlayingPieceType type : PlayingPieceType.values()) {
            if (type.getSymbol() == ch) {
                return type;
            }
        }
        return null;
    }
}
