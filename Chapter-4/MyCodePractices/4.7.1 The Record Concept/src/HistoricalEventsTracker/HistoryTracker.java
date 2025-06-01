package HistoricalEventsTracker;

import java.util.List;
import java.util.stream.Collectors;
import java.time.Year;

record HistoricalEvent(String name, String description, Year year) {}

public class HistoryTracker {
    public static void main(String[] args) {
        List<HistoricalEvent> events = List.of(
                new HistoricalEvent("World War I", "A global war originating in Europe.", Year.of(1914)),
                new HistoricalEvent("World War II", "The deadliest conflict in human history.", Year.of(1939)),
                new HistoricalEvent("Moon Landing", "Neil Armstrong walked on the Moon.", Year.of(1969)),
                new HistoricalEvent("Internet Invented", "The foundation of the modern internet.", Year.of(1983))
        );

        System.out.println("All Historical Events:");
        events.forEach(System.out::println);

        // ১৯০০ থেকে ১৯৫০ সালের মধ্যে ঘটে যাওয়া ঘটনা খুঁজুন
        List<HistoricalEvent> filteredEvents = events.stream()
                .filter(e -> e.year().isAfter(Year.of(1900)) && e.year().isBefore(Year.of(1950)))
                .collect(Collectors.toList());

        System.out.println("\nHistorical Events (1900-1950):");
        filteredEvents.forEach(System.out::println);
    }
}
