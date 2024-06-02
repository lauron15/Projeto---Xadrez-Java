import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ChessMatch ChessMatch = new ChessMatch();

        while (true) {
            UI.printBoard(ChessMatch.getPieces());
            System.out.println();
            System.out.println("Source: ");
            ChessPosition source = UI.readChessPosition(sc);
            System.out.println();
            System.out.println("Target: ");
            ChessPosition target = UI.readChessPosition(sc);
            ChessPiece capturedsPiece = ChessMatch.performChessMove(source, target);
        }
    }
}
