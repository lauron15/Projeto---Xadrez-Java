import java.awt.Color;

public class ChessMatch {

    private Board board;

    public ChessMatch() {
        board = new Board(8, 8);
        initialSetup();
    }

    public ChessPiece[][] getPieces() {
        ChessPiece[][] mat = new ChessPiece[board.getRows()][board.getColumns()];

        for (int i = 0; i < board.getRows(); i++) {
            for (int j = 0; j < board.getColumns(); j++) {
                mat[i][j] = (ChessPiece) board.piece(i, j);
            }
            System.out.println();
        }
        return mat;
    }

    private void placeNewPiece(char Column, int row, ChessPiece piece) {
        board.placePiece(piece, new ChessPosition(Column, row).toPosition());
    }

    private void initialSetup() {
        placeNewPiece('b', 6, new Rook(board, Color.WHITE));
        placeNewPiece('e', 8, new king(board, Color.BLACK));
        placeNewPiece('e', '1', new king(board, Color.BLACK));
    }

}
