public abstract class ChessPiece extends Piece {

    private static final Color WHITE = null;
    private Color color;

    public ChessPiece(Board board, java.awt.Color white) {
        super(board);
        this.color = WHITE;
    }

    public Color getColor() {
        return color;
    }

    @Override
    public String toString() {
        return color.toString(); // Retorna a representação da cor da peça
    }

    protected boolean isThereOpponentPiece(Position position) {
        ChessPiece p = (ChessPiece) getBoard().piece(position);
        return p != null && p.getColor() != color;
    }

    protected abstract java.awt.Color getcolor();
}