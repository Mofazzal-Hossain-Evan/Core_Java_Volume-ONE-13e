package SealedChessPieces;

public class ChessGame {
    public static void main(String[] args) {
        ChessPiece[] pieces = {
                new King(), new Queen(), new Bishop(), new King(), new Rook(), new Pawn()
        };

        for (ChessPiece piece : pieces){
            System.out.println(piece.name() +" moves: " + piece.movePattern());
        }
    }
}
