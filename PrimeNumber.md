# Optimal Prime Number Checker (Java)

This Java program checks whether a given number is a **prime number** using an optimized divisor counting approach.

---

## ✅ Code

```java
class maxof4{
public static void main(String[] args)
{
int a=10,b=50,c=37,d=20;
int res=(a>b)?(a>c)? (a>d)?a:d :(c>d)?c:d : (b>c)?(b>d)?b:d:(c>d)?c:d;
System.out.println(res);
}
}
```

---

## 📘 Description

This program checks if a number is prime by counting its exact number of divisors. A prime number has exactly **two distinct divisors**: 1 and itself.

### 🧠 Logic Used

- Loop runs from `i = 1` to `√n` (i.e., `i * i <= n`).
- For each `i`, if `i` divides `n`, it counts both `i` and `n/i` as divisors.
- If `i == n/i` (perfect square), only one count is added.
- The number is **prime if total divisors = 2**.

---

## 🧪 Example

### For `n = 12`
- Divisors: 1, 2, 3, 4, 6, 12 → 6 divisors
- Output: `Not a Prime Number`

### For `n = 13`
- Divisors: 1, 13 → 2 divisors
- Output: `Prime Number`

---

## ⏱ Time Complexity

- **O(√n)**: Efficient due to reduced loop range.

## 📦 Space Complexity

- **O(1)**: Constant space usage.

---

## ✅ Sample Output

```text
Prime Number      // when n = 13
Not a Prime Number // when n = 12
```

---

## 📝 Notes

This approach is more efficient than checking all numbers from 1 to `n`. Still, for large-scale prime checking, using probabilistic or sieve methods may be faster.
