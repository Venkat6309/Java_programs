# Check the given number is a Palindrome or Not.

## 📜 Description

This Java program checks whether a given integer is a **palindrome**.

A palindrome number is one that reads the same backward as forward (e.g., 1221, 1331, 12321).

### 🔍 Program Logic:
1. Assign the number `n = 1221`.
2. Store the original value in `temp` for later comparison.
3. Reverse the number using a `while` loop:
   - Extract last digit with `n % 10`
   - Add it to `sum = (sum * 10) + rem`
   - Remove last digit from `n` using `n / 10`
4. Compare the reversed number `sum` with `temp`:
   - If equal, it's a palindrome.
   - Otherwise, it’s not.

### ✅ Example Execution:

Input: `1221`  
Output: `1221 is a palindrome`

## ⏱️ Time Complexity

**O(log₁₀n)** — The loop runs once for each digit in the number. For a number `n` with `d` digits, this results in O(d) ≈ O(log₁₀n) time.

## 🧠 Space Complexity

**O(1)** — Uses a fixed amount of memory regardless of the input size.

## 💡 Code

```java
class Palindrome {
    public static void main(String args[]) {
        int n = 1221;
        int temp = n, rem, sum = 0;
        while (n > 0) {
            rem = n % 10;
            sum = (sum * 10) + rem;
            n = n / 10;
        }
        if (temp == sum)
            System.out.println(temp + " is a palindrome");
        else    
            System.out.println(temp + " Not a palindrome");
    }
}
