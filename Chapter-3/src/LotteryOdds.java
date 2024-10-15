import java.util.*;

/**
 * This program demonstrates a <code>for</code> loop.
 * @version 1.20 2004-02-10
 * @author Cay Horstmann
 */
public class LotteryOdds
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        System.out.print("How many numbers do you need to draw? ");
        int k = in.nextInt();

        System.out.print("What is the highest number you can draw? ");
        int n = in.nextInt();

        /*
         * compute binomial coefficient n*(n-1)*(n-2)*...*(n-k+1)/(1*2*3*...*k)
         */

        int lotteryOdds = 1;
        for (int i = 1; i <= k; i++)
            lotteryOdds = lotteryOdds * (n - i + 1) / i;

        System.out.println("Your odds are 1 in " + lotteryOdds + ". Good luck!");
    }
}
/***
 Let's break down how the `for` loop works in this Java program, focusing on what it does and how the loop calculates the **binomial coefficient** (which is used to determine lottery odds):

 ### The Loop
 ```java
 for (int i = 1; i <= k; i++)
 lotteryOdds = lotteryOdds * (n - i + 1) / i;
 ```

 ### Purpose of the Loop

 - The loop is calculating the **binomial coefficient**, which is a way to determine how many ways you can choose `k` numbers from a set of `n` numbers.
 - In lottery terms:
 - `n` is the **highest number** that can be drawn (e.g., if the range is 1 to 49, then `n` is 49).
 - `k` is the **number of numbers** you need to draw (e.g., choosing 6 numbers).

 The formula for calculating the binomial coefficient (or "n choose k") is:
 \[
 \text{Binomial Coefficient} = \frac{n \times (n - 1) \times (n - 2) \times \ldots \times (n - k + 1)}{1 \times 2 \times 3 \times \ldots \times k}
 \]

 ### How the Loop Works

 1. **Initialization (`i = 1`)**:
 - `i` starts at `1`, which is the starting point for counting the terms in the loop.
 - `lotteryOdds` is initially set to `1`.

 2. **Condition (`i <= k`)**:
 - The loop runs as long as `i` is less than or equal to `k` (the number of numbers to draw).
 - This ensures that it executes `k` times, processing each factor in the calculation.

 3. **Iteration (`i++`)**:
 - After each iteration, `i` is incremented by `1`.

 4. **Body of the Loop**:
 - `lotteryOdds = lotteryOdds * (n - i + 1) / i;`
 - This line updates `lotteryOdds` with each iteration.
 - It multiplies the current value of `lotteryOdds` by `(n - i + 1)`, then divides by `i`.

 ### Example Calculation

 Let's say `n = 49` (highest number) and `k = 6` (numbers to draw):

 1. **Iteration 1 (`i = 1`)**:
 - `lotteryOdds = 1 * (49 - 1 + 1) / 1 = 49`
 - So, `lotteryOdds` is now `49`.

 2. **Iteration 2 (`i = 2`)**:
 - `lotteryOdds = 49 * (49 - 2 + 1) / 2 = 49 * 48 / 2 = 1176`
 - `lotteryOdds` becomes `1176`.

 3. **Iteration 3 (`i = 3`)**:
 - `lotteryOdds = 1176 * (49 - 3 + 1) / 3 = 1176 * 47 / 3 = 18424`
 - `lotteryOdds` becomes `18424`.

 4. **Iteration 4 (`i = 4`)**:
 - `lotteryOdds = 18424 * (49 - 4 + 1) / 4 = 18424 * 46 / 4 = 211876`
 - `lotteryOdds` becomes `211876`.

 5. **Iteration 5 (`i = 5`)**:
 - `lotteryOdds = 211876 * (49 - 5 + 1) / 5 = 211876 * 45 / 5 = 1906884`
 - `lotteryOdds` becomes `1906884`.

 6. **Iteration 6 (`i = 6`)**:
 - `lotteryOdds = 1906884 * (49 - 6 + 1) / 6 = 1906884 * 44 / 6 = 13983816`
 - `lotteryOdds` becomes `13983816`.

 ### Final Result

 After `k` iterations, `lotteryOdds` will contain the total number of ways to choose `k` numbers from `n` possibilities. For example, if `n = 49` and `k = 6`, `lotteryOdds` will be the number of combinations of choosing 6 numbers out of 49, which is `13,983,816`.

 ### Why This Formula?

 - The formula represents the way combinations work in probability: the numerator multiplies decreasing values from `n` down to `n - k + 1`, representing each choice of numbers.
 - The denominator divides by `1, 2, 3, ... k`, which accounts for the ordering of those numbers (since we are counting combinations, not permutations).

 ### Summary

 - The `for` loop calculates the number of ways to choose `k` numbers from `n`.
 - Each iteration adjusts `lotteryOdds` by multiplying it by `(n - i + 1)` and dividing by `i`.
 - The loop structure is simplified without curly braces since it has a single statement.
 */