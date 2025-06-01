package MasterChef;

public sealed class Chef permits HeadChef, PastryChef, SousChef, InternChef, UnknownChef {
    public String getName() {
        return "Unnamed Chef";
    }
}
