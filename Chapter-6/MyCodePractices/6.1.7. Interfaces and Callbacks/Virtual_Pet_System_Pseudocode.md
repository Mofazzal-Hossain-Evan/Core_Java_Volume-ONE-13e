# 📌 Pseudocode – Virtual Pet System

---

## Class: `PetCaretaker` (implements ActionListener)

```
CLASS PetCaretaker IMPLEMENTS ActionListener
    VARIABLES:
        demandTemplates ← ["Pet wants a snack!",
                           "Pet demands belly rubs!",
                           "Pet needs a walk!",
                           "Pet begs for a toy!",
                           "Pet whines for attention!"]
        hungerLevel ← 5        // Neutral hunger
        happinessLevel ← 5     // Neutral happiness
        randomGenerator
        timer

    CONSTRUCTOR(timerInput):
        timer ← timerInput
        hungerLevel ← 5
        happinessLevel ← 5

    METHOD actionPerformed(event):
        // Update pet state
        hungerLevel ← MIN(hungerLevel + 1, 10)
        happinessLevel ← MAX(happinessLevel - 1, 0)

        // Select demand message
        demand ← selectDemand()

        // Print event time and demand
        PRINT "[" + event.timestamp + "] " + demand

        // Randomly decide between beep and message
        IF randomGenerator.randomBoolean() THEN
            BEEP SOUND
            PRINT "BEEP! Pet yips with " + getMood() + " energy!"
        ELSE
            PRINT "Care for your pet! It's feeling " + getMood() + "!"

    METHOD selectDemand():
        IF hungerLevel >= 8 AND randomChance(2/3):
            RETURN "Pet is STARVING! Wants a snack NOW!"
        ELSE IF happinessLevel <= 2 AND randomChance(2/3):
            RETURN "Pet is SAD! Demands belly rubs or cuddles!"
        ELSE
            RETURN random element from demandTemplates

    METHOD getMood():
        moods ← ["sassy", "grumpy", "playful", "needy", "chill"]
        RETURN random element from moods

    METHOD stopCaring():
        STOP timer
        PRINT "Pet curls up for a nap! Caretaking done!"
END CLASS
```

---

## Class: `VirtualPetCaretaker` (main program)

```
CLASS VirtualPetCaretaker
    METHOD main():
        CREATE timer with 4000ms interval and no listener
        CREATE caretaker ← new PetCaretaker(timer)
        ADD caretaker as ActionListener to timer

        PRINT "Virtual pet awakens! It's ready to demand ALL your attention!"

        START timer

        SHOW dialog box:
            "Pet's demanding care! Click OK to stop?"

        caretaker.stopCaring()
END CLASS
```
