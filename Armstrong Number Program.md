# Armstrong Number Checker in Java

## 📜 Description

This Java program checks whether a given number is an Armstrong number. An **Armstrong number** is a number that is equal to the sum of its own digits raised to the power of the number of digits.

### 🔍 Program Logic:
1. Assign the number `n = 1221`.
2. Store the original value in `temp` for later comparison.
3. The program computes the number of digits using `Math.log10(n) + 1`.
4. Reverse the number using a `while` loop:
   - Extract last digit with `n % 10`
   - Add it to `sum = (sum * 10) + rem`
   - Remove last digit from `n` using `n / 10`
5. Compare the reversed number `sum` with `temp`:
   - If equal, it's a palindrome.
   - Otherwise, it’s not.
  
### ✅ Example:
```
Input: 1634  
Calculation: 1⁴ + 6⁴ + 3⁴ + 4⁴ = 1634  
Output: 1634 is an Armstrong number
```

## 💡 Code

```java
import java.io.*;
class Armstrong {
    public static void main(String[] args) {
        int n = 1634, rem, sum = 0;
        int temp = n;
        int count = (int) Math.log10(n) + 1;

        while (n > 0) {
            rem = n % 10;
            sum += Math.pow(rem, count);
            n /= 10;
        }

        if (temp == sum)
            System.out.println(temp + " is a Armstrong number");
        else
            System.out.println(temp + " is not a Armstrong number");
    }
}
```

## ⏱️ Time Complexity

- **O(d)** where `d` is the number of digits in the number.
  - Each digit is extracted and processed once using modulo and division operations.

## 🧠 Space Complexity

- **O(1)** (Constant Space)
  - Only a few integer and double variables are used. No extra space is allocated based on input size.
