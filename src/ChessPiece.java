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
}