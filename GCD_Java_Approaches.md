
# GCD Calculation in Java

This file contains two approaches to compute the **Greatest Common Divisor (GCD)** of two numbers:
1. Brute Force Method
2. Optimal Method using Euclidean Algorithm

---

## 💡 Brute Force Approach

```java
// Brute Force
class Gcd {
    public static void main(String[] args) {
        int n1 = 12, n2 = 8, gcd = 0;
        int limit;

        if (n1 < n2)
            limit = n1;
        else 
            limit = n2;

        for (int i = 1; i <= limit; i++) {
            if (n1 % i == 0 && n2 % i == 0)
                gcd = i;
        }

        System.out.print(gcd);
    }
}
```

### ✅ Description:
This approach checks every number from `1` to `min(n1, n2)` and updates `gcd` if it divides both numbers. The final value of `gcd` is the largest common divisor.

- It is simple and easy to understand but not efficient for large numbers.

### ⏱ Time Complexity:
- **O(min(n1, n2))**

### 📦 Space Complexity:
- **O(1)**

---

## 🚀 Optimal Approach (Euclidean Algorithm)

```java
// Optimal Approach
class Main {
    public static void main(String[] args) {
        int a = 24, b = 36;
        while (a > 0 && b > 0) {
            if (a > b)
                a = a % b;
            else 
                b = b % a;
        }

        System.out.print(a == 0 ? b : a);
    }
}
```

### ✅ Description:
This is an optimized version using **Euclidean Algorithm** which uses modulo operation to reduce the numbers until one becomes zero. The non-zero number is the GCD.

- Much faster than the brute-force method for large numbers.

### ⏱ Time Complexity:
- **O(log(min(a, b)))**

### 📦 Space Complexity:
- **O(1)**
