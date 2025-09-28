package Word_Counter_with_Streams;

import java.util.*;
import java.util.stream.*;

public class WordCounterStream {
    public static void main(String[] args) {
        // একটা টেক্সট স্ট্রিং
        String text = "lambda makes Java code concise and powerful powerful powerful";

        // টেক্সটকে শব্দে ভাগ করছি (split by space)
        List<String> words = Arrays.asList(text.split(" "));

        // Stream API দিয়ে word frequency count
        Map<String, Long> wordCounts = words.stream()
                .collect(Collectors.groupingBy(   // গ্রুপ করা হচ্ছে শব্দ অনুযায়ী
                        word -> word,                 // কী: word নিজেই
                        Collectors.counting()         // value: কতবার এসেছে
                ));

        // রেজাল্ট প্রিন্ট করা
        wordCounts.forEach((word, count) ->
                System.out.println(word + " = " + count));
    }
}
