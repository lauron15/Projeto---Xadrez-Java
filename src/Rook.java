public class Rook extends ChessPiece {

    public Rook(Board board, java.awt.Color white) {
        super(board, white);

    }

    @Override
    public String toString() {
        return "R";
    }

    @Override
    public boolean[][] possibleMoves() {
        boolean[][] mat = new boolean[getBoard().getRows()][getBoard().getColumns()];
        return mat;

    }

}
