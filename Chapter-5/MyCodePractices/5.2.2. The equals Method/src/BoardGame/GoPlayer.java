package BoardGame;

public class GoPlayer extends PLayer{
    private int territoryFocus;

    public GoPlayer(String name, int rating, String strategy, int territoryFocus) {
        super(name, rating, strategy);
        this.territoryFocus = territoryFocus;
    }

    @Override
    public boolean equals(Object otheObject){
        if (otheObject == this) return  true;
        if (otheObject == null) return false;
        if (!super.equals(otheObject)) return false;

        GoPlayer other = (GoPlayer) otheObject;
        return territoryFocus == other.territoryFocus;

    }

    @Override
    public String toString() {
        return "GoPlayer{" +
                "territoryFocus=" + territoryFocus +
                '}';
    }
}
