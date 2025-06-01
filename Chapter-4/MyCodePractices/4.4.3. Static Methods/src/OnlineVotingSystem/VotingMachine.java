package OnlineVotingSystem;

public class VotingMachine {
    private static int votesA = 0;
    private static int votesB = 0;

    public static void voteForCandidateA(){
        votesA++;
    }
    public static void voteForCandidateB(){
        votesB++;
    }
    public static void displayResults(){
        System.out.println("Candidate A: " + votesA + " votes");
        System.out.println("Candidate B: " + votesB + " votes");
    }

    public static void main(String[] args){
        voteForCandidateA();
        voteForCandidateB();
        voteForCandidateA();
        voteForCandidateB();
        displayResults();
    }
}
