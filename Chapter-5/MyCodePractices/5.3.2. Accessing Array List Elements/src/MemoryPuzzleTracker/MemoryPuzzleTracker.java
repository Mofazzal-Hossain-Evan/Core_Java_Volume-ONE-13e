package MemoryPuzzleTracker;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class MemoryPuzzleTracker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Move> MoveList = new ArrayList<>();

        MoveList.add(new Move(1, "Flip Tile A1", "00:05"));
        MoveList.add(new Move(2, "Flip Tile B2", "00:10"));
        MoveList.add(new Move(3, "Wrong Match", "00:12"));
        MoveList.add(new Move(4, "Flip Tile A1", "00:20"));

        System.out.println("✅ All Moves:");
        printMoves(MoveList);

        //editing move
        System.out.println("\n🔧 Fixing Move 3...");
        MoveList.set(2, new Move(3, "Flip Tile C3", "00:13"));

        System.out.println("📋 After Editing Move 3:");
        printMoves(MoveList);

        //removing mistake
        System.out.println("\n❌ Removing Move 2...");
        MoveList.remove(1);

        System.out.println("📋 After Removal:");
        printMoves(MoveList);

        //convert To array
        System.out.println("\n📦 Converting to Array:");
        Move[] moveArray = new Move[MoveList.size()];
        MoveList.toArray(moveArray);

        for (Move m : moveArray){
            System.out.println(m);
        }
        scanner.close();

        }
    public static void printMoves(ArrayList<Move> moves){
        for (Move m : moves){
            System.out.println(m);
        }
    }
}
