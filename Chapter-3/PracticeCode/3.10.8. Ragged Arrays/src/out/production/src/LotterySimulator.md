#### **Project 1: Custom Lottery Simulator**

##### Objective

Simulate a lottery system where users can generate the probability table and randomly draw numbers to check for matches.

Step 1: Generate Lottery Combinations
First, we'll calculate the possible combinations using the binomial coefficient:
𝐶(𝑛 , 𝑘)= 𝑛!𝑘!(𝑛 − 𝑘)!C(n,k)= k!(n−k)!n!​


Code Explanation:
Create a ragged array where each row represents the combinations for choosing k items from n items.
Use a loop to populate the values row by row.

