package BoardGame;

import java.util.Objects;

public class ChessPlayer extends PLayer{
    private String favoriteOpening;

    public ChessPlayer(String name, int rating, String strategy, String favoriteOpening) {
        super(name, rating, strategy);
        this.favoriteOpening = favoriteOpening;
    }

    public String getFavoriteOpening() {
        return favoriteOpening;
    }

@Override
    public boolean equals(Object otherObject){
        if (this == otherObject) return true;
        if (otherObject == null) return false;
        if (!super.equals(otherObject)) return false;


        ChessPlayer other = (ChessPlayer) otherObject;
        return Objects.equals(favoriteOpening, other.favoriteOpening);
}
}
