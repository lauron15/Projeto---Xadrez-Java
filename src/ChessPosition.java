public class ChessPosition {
    private char Column;
    private int row;

    public ChessPosition(char column, int row) {
        if (column < 'a' || column > 'h' || row < 1 || row > 8) {
            throw new ChessException("Erros Instantiatin ChessPosition. Valid valuer are from a1 to h8");
        }
        this.Column = column;
        this.row = row;
    }

    public char getColumn() {
        return Column;
    }

    public int getRow() {
        return row;
    }

    protected Position toPosition() {
        return new Position(8 - row, Column - 'a');
    }

    protected static ChessPosition fromPosition(Position position) {
        return new ChessPosition((char) ('a' + position.getColumn()), 8 - position.getRow());
    }

    @Override
    public String toString() {
        return "" + Column + row;
    }

}
