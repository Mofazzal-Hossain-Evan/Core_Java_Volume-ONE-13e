package HistoricalBattlesSimulator;

public class BattleSimulator {
    public static void main(String[] args) {
        Battle unkownBattle = new Battle();
        unkownBattle.displayInfo();

        Battle waterloo = new Battle("Battle of Waterloo", "Belgium", 1815, true);
        waterloo.displayInfo();


    }
}
