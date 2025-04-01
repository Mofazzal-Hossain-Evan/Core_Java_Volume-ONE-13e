package AlternateHistoryGenerator;

public class HistoryEvent {
    void predictOutcome(){
        System.out.println("Predicting outcome based on historical data...");
    }

    void analyze(String event){
        System.out.println("Analyzing historical event: "+ event);
    }

    void analyze(int year){
        System.out.println("Analyzing events of year: "+year);
    }
}
