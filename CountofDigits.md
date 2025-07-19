# Count of Digits in a Number – Java Implementation

This file demonstrates two different approaches to count the number of digits in a given integer using Java.

---

## 🧠 Description

Counting the number of digits in an integer is a fundamental programming problem. There are two common approaches:

1. **Brute Force Approach** – Repeatedly divide the number by 10 and count the iterations.
2. **Optimal Approach** – Use logarithmic calculations for better performance.

---

## 💡 Brute Force Approach

This method uses a `while` loop to extract each digit from the number and count them.

```java
// Brute force approach
class CountofDigits {
    public static void main(String args[]) {
        int n = 1234, count = 0, rem;
        while (n > 0) {
            rem = n % 10;    // Extract last digit
            count++;         // Increment count
            n /= 10;         // Remove last digit
        }
        System.out.print("count = " + count);
    }
}
```

---

## ⚡ Optimal Approach

This method uses the mathematical property:
> Number of digits in a number `n` = floor(log₁₀(n)) + 1

```java
import java.io.*;

class Countdigits {
    public static void main(String args[]) {
        int n = 1234, val;
        val = (int)Math.log10(n) + 1;
        System.out.println(val);
    }
}
```

---

## ✅ Conclusion

- Use **Brute Force** when learning or debugging.
- Use **Optimal Approach** in performance-sensitive scenarios.


---

## ⏱️ Time and Space Complexity

### Brute Force Approach
- **Time Complexity**: O(n), where *n* is the number of digits in the number.
- **Space Complexity**: O(1), as we use a constant amount of extra space.

### Optimal Approach
- **Time Complexity**: O(1), as it uses a single mathematical operation.
- **Space Complexity**: O(1), no additional space required.

---
