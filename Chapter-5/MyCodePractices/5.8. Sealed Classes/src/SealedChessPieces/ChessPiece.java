package SealedChessPieces;

public sealed interface ChessPiece permits King, Bishop, Queen, Knight, Rook, Pawn{
    String name();
    String movePattern();

}

final class King implements ChessPiece{
    public String name(){
        return "King";
    }

    public String movePattern(){
        return "One square in any direction";
    }
}

final class Queen implements ChessPiece{
    public String name(){
        return "Queen";
    }

    public String movePattern(){
        return "Any number of squares in any direction";
    }
}

final class Bishop implements ChessPiece{
    public String name(){
        return "Bishop";
    }

    public String movePattern(){
        return "Any number of squares diagonally";
    }
}
final class Knight implements ChessPiece {
    @Override
    public String name() {
        return "Knight";
    }

    @Override
    public String movePattern() {
        return "Moves in an 'L' shape (2 + 1)";
    }
}

final class Rook implements ChessPiece {
    @Override
    public String name() {
        return "Rook";
    }

    @Override
    public String movePattern() {
        return "Any number of squares horizontally or vertically";
    }
}

final class Pawn implements ChessPiece {
    @Override
    public String name() {
        return "Pawn";
    }

    @Override
    public String movePattern() {
        return "One square forward (two on first move), captures diagonally";
    }
}
