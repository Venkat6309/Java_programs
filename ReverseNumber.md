# Reverse Number

## 📜 Description

This Java program reverses a given integer number. Here's what it does:

1. Initializes a number `n = 12453`.
2. Uses a `while` loop to reverse the digits of the number:
   - Takes the last digit using `n % 10`.
   - Appends it to `sum` (which stores the reversed number) by `sum = (sum * 10) + rem`.
   - Removes the last digit from `n` by `n = n / 10`.
3. Finally, prints the reversed number.

### ✅ Example Execution:

Input: `12453`  
Output: `35421`

## ⏱️ Time Complexity

**O(log₁₀n)** — The loop runs once for every digit in the number. For a number with `d` digits, the loop executes `d` times. This is logarithmic in terms of the numeric value of `n`.

## 🧠 Space Complexity

**O(1)** — The algorithm uses a constant amount of space regardless of the input size.

## 💡 Code

```java
class ReverseNumber {
    public static void main(String[] args) {
        int n = 12453, rem, sum = 0;
        while (n > 0) {
            rem = n % 10;
            sum = (sum * 10) + rem;
            n = n / 10;
        }
        System.out.print(sum);
    }
}
