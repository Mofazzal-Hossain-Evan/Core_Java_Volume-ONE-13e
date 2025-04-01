package AlternateHistoryGenerator;

public class AlternateHistoryApp {
    public static void main(String[] args) {
        HistoryEvent generalEvent = new HistoryEvent();
        BattleEvent battle = new BattleEvent();

        generalEvent.analyze("French Food");
        generalEvent.analyze(80 );

        HistoryEvent event = new BattleEvent();
        event.predictOutcome();
    }
}
