
# Divisors (or) factors of a given number

## 📜 Description

This Java file contains **two approaches** to find all the **divisors** of a number `n = 36`.

---

### 🚀 1. Brute Force Approach

**Logic:**
- Iterate from `1` to `n`.
- If `n % i == 0`, then `i` is a divisor.

#### 💡 Code:
```java
class Divisors {
    public static void main(String[] args) {
        int n = 36;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0)
                System.out.print(i + " ");
        }
    }
}
```

#### ⏱️ Time Complexity:
- **O(n)** — The loop runs from `1` to `n`.

#### 🧠 Space Complexity:
- **O(1)** — No extra space is used.

---

### ⚡ 2. Optimal Approach

**Logic:**
- Iterate from `1` to `√n`.
- If `i` divides `n`, both `i` and `n/i` are divisors.
- Store and sort them before printing to get ordered output.

#### 💡 Code:
```java
import java.util.*;

class OptimalDivisors {
    public static void main(String[] args) {
        int n = 36;
        ArrayList<Integer> divisors = new ArrayList<>();
        for (int i = 1; i * i <= n; i++) {
            if (n % i == 0) {
                divisors.add(i);
                if ((n / i) != i)
                    divisors.add(n / i);
            }
        }
        Collections.sort(divisors);
        for (int d : divisors)
            System.out.print(d + " ");
    }
}
```

#### ⏱️ Time Complexity:
- **O(√n + k log k)**  
  - Loop runs till `√n`.
  - Sorting the list of divisors takes `O(k log k)` where `k` is the number of divisors.

#### 🧠 Space Complexity:
- **O(k)** — To store the list of divisors.

---

## ✅ Example Output

For `n = 36`, the output would be:
```
1 2 3 4 6 9 12 18 36
```
