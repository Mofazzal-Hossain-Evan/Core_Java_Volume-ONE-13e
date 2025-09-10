

📝 Programmer’s Perspective: Task List Organizer
================================================

* * *

1. **The Problem We’re Solving**

--------------------------------

We want a simple **to-do list manager** where each task has:

* A **title** (what to do),

* A **due date** (when to do it),

* A **category** (Work / Personal, etc.).

But instead of just storing them, we want to **sort** tasks differently depending on user needs:

* By **due date** → earliest first.

* By **category** → Work tasks should come before Personal.

This mimics **real-world task apps** (like Todoist, Google Tasks), where sorting rules matter.

* * *

2. **The Core Building Blocks**

-------------------------------

### Class: `Task`

* Represents **one to-do item**.

* Has 3 fields: `title`, `dueDate`, `category`.

* Provides **getters** and a `toString()` for easy printing.

👉 Example:  
`Task("Defeat the Bug Boss", "2025-09-10", "Work")`

* * *

### Class: `DueDateComparator`

* Implements `Comparator<Task>`.

* Compares **two tasks** by their `dueDate` (string compare works because format is `YYYY-MM-DD`).

* Used to sort tasks in **chronological order**.

👉 Example:  
If one task is `2025-09-10` and another `2025-09-12`, the first comes earlier.

* * *

### Class: `CategoryComparator`

* Implements `Comparator<Task>`.

* Uses a **map** to assign priorities:
  
  * `"Work" = 2`
  
  * `"Personal" = 1`

* Compares based on these numbers (higher = more important).

* So **Work tasks always appear before Personal**.

👉 Example:  
Even if a Work task is due later, it still comes before a Personal task when sorted by category.

* * *

### Class: `TaskListOrganizer`

* The **main driver** of the program.

* Creates a few funny tasks.

* Prints the list **originally**.

* Then sorts once by **due date** and once by **category** using `Arrays.sort()` with custom comparators.

* Each sort prints the “screen update” like a mobile app refresh.

* * *

3. **The Programmer’s Workflow**

--------------------------------

If I were coding this project as a programmer:

1. **Model the data** → Create `Task` class.
   
   * Decided what info each task must carry.
   
   * Overrode `toString()` so tasks print nicely in logs.

2. **Add flexibility** → Write comparators.
   
   * One for due date (`DueDateComparator`).
   
   * One for category (`CategoryComparator`).
   
   * Each comparator follows Java’s **Comparator contract** (transitivity, consistent results).

3. **Test the behavior** → In `TaskListOrganizer`.
   
   * Create a sample set of tasks.
   
   * Print them before sorting.
   
   * Sort and print again after applying each comparator.

4. **Mimic UI updates** → Add “Screen Update” messages.
   
   * Simulates how tasks would re-render in a UI when sorting changes.

* * *

4. **What’s Actually Happening in Memory**

------------------------------------------

* Tasks are stored in an **array**.

* When we call `Arrays.sort(tasks, comparator)`:
  
  * Java’s **Timsort algorithm** kicks in.
  
  * It repeatedly calls `compare()` from the comparator.
  
  * Swaps tasks until sorted order is achieved.

* Which comparator we pass decides the sort logic.

So the same data can be reordered in multiple ways with **zero change** to the `Task` class itself. 🚀

* * *

5. **Why It’s a Good Design**

-----------------------------

✅ Separation of concerns:

* `Task` = data.

* `Comparators` = sorting rules.

* `TaskListOrganizer` = application logic.

✅ Reusable comparators:

* Can add new comparators later (e.g., sort by title length).

✅ Demonstrates **Comparator over Comparable**:

* `Task` doesn’t enforce one “natural” ordering.

* Instead, we can plug in **different strategies** dynamically.

* * *

6. **How a Programmer Thinks Here**

-----------------------------------

* Think: "What do I want to sort by today?"

* Just **swap comparator** → done.

* No need to touch the `Task` class.

* This flexibility is powerful in apps (imagine filter/sort buttons in UI).

* * *

⚡️ In short:  
This project teaches how **Comparators act like sorting strategies**.  
The `Task` object stays simple, while different comparators give different perspectives on the same data.

* * *

Would you like me to also **draw a flow diagram** (like tasks flow through comparators → sorted output), so it’s easier to visualize the sorting process?
