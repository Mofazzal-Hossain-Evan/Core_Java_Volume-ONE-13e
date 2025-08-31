# Karaoke Party Pseudocode

```
// Class: KaraokeSinger
DEFINE KaraokeSinger
    // Attributes
    songs: LIST of LIST of STRINGS = [
        ["Bohemian Rhapsody: Is this the real life?", 
         "Bohemian Rhapsody: Or is this just fantasy?", 
         "Bohemian Rhapsody: Caught in a landslide!", 
         "Bohemian Rhapsody: No escape from reality!"],
        ["Sweet Caroline: Where it began...", 
         "Sweet Caroline: I can't begin to knowin'!", 
         "Sweet Caroline: But then I know it's growin' strong!", 
         "Sweet Caroline: Sweet Caroline, bah bah bah!"],
        ["I Will Survive: At first I was afraid...", 
         "I Will Survive: I was petrified!", 
         "I Will Survive: Kept thinkin' I could never live...", 
         "I Will Survive: But I survived!"]
    ]
    currentSong: LIST of STRINGS
    currentLyricIndex: INTEGER = 0
    random: RANDOM number generator
    timer: TIMER

    // Constructor
    FUNCTION initialize(timer)
        SET this.timer to timer
        SET currentSong to a random song from songs
    END FUNCTION

    // Handle timer event
    FUNCTION onTimerTick(event)
        GET current lyric from currentSong at currentLyricIndex
        GET timestamp from event
        PRINT "[" + timestamp + "] " + lyric
        INCREMENT currentLyricIndex
        IF currentLyricIndex is greater than or equal to size of currentSong
            SET currentLyricIndex to 0
            SET currentSong to a random song from songs
            PRINT "New song alert! Get ready to belt it out!"
        END IF
        IF random boolean is true
            PLAY beep sound
            PRINT "BEEP! Hit that high note, superstar!"
        ELSE
            PRINT "Sing it loud, karaoke king/queen!"
        END IF
    END FUNCTION

    // Stop karaoke
    FUNCTION stopKaraoke
        STOP timer
        PRINT "Mic drop! Karaoke party over, take a bow!"
    END FUNCTION
END CLASS

// Class: KaraokePartySimulator
DEFINE KaraokePartySimulator
    FUNCTION main
        CREATE timer with 2000ms delay
        CREATE new KaraokeSinger instance with timer
        ADD KaraokeSinger as listener to timer
        PRINT "Karaoke party starts! Grab the mic and sing!"
        START timer
        SHOW dialog "Karaoke in full swing! Click OK to end the sing-along?" with OK/Cancel options
        CALL stopKaraoke on KaraokeSinger
    END FUNCTION
END CLASS
```

## Description

This pseudocode outlines a karaoke party simulator. The `KaraokeSinger` class manages a list of songs, each containing a sequence of lyrics. A timer triggers every 2 seconds to display the next lyric with a timestamp, randomly switching to a new song when the current one ends. It also adds random beeps or encouraging messages for a lively vibe. The `KaraokePartySimulator` class initializes the timer and singer, starts the karaoke, and prompts the user to end the session, stopping the timer and displaying a final message.