package DigitalVotingSystem;

public class Candidate {

    private String name;
    private String party;
    private static int totalVotes;

    public Candidate(String name, String party) {
        this.name = name;
        this.party = party;
    }

    public void vote(){
        totalVotes++;
    }
    public static int getTotalVotes(){
        return totalVotes;
    }

    public void displayCandidate(){
        System.out.println(name +" (" + party + ")" );
    }
}
