# Prime Number Check in Java

This Java program determines whether a given number is a **prime number**. A prime number is a natural number greater than 1 that has no positive divisors other than 1 and itself.

## Java Code
## Brute Force Approach
```java
class PrimeNum{
	public static void main(String[] args) {
		int n = 1, count = 0;
		for (int i = 1; i<= n; i++) {
			if (n % i == 0) {
				count++;
			}
		}
		if (count == 2)
			System.out.println("Prime Number");
		else
			System.out.println("Not a Prime Number");
	}
}

```

## Description

This program:
- Takes a number `n`.
- Iterates from 1 to `n`.
- Counts how many numbers divide `n` exactly.
- If the count is exactly 2, it is a prime number.
- Otherwise, it is not.


### Example

For `n = 11`:

11 % 1 == 0 → ✅ (count = 1)

11 % 2 == 1 → ❌

11 % 3 == 2 → ❌

11 % 4 == 3 → ❌

11 % 5 == 1 → ❌

11 % 6 == 5 → ❌

11 % 7 == 4 → ❌

11 % 8 == 3 → ❌

11 % 9 == 2 → ❌

11 % 10 == 1 → ❌

11 % 11 == 0 → ✅ (count = 2)

So the number 11 has exactly two divisors: 1 and 11.


## Time Complexity

- **O(n)**: The loop runs from 1 to `n`.

## Space Complexity

- **O(1)**: Constant space is used regardless of the input.

## Optimal Approach

### Logic Used:
- Iterate from `1` to `√n`.
- For each divisor `i`, check if `n % i == 0`.
- Count both `i` and `n/i` unless they are the same.
- If the total count of divisors is exactly 2, the number is prime.

---

## 📌 Code

```java
class PrimeNumber {
    public static void main(String[] args) {
        int n = 12, count = 0;
        for (int i = 1; i * i <= n; i++) {
            if (n % i == 0)
                count++;
            if ((n / i) != i)
                count++;
        }
        if (count == 2)
            System.out.println("Prime Number");
        else
            System.out.println("Not a Prime Number");
    }
}

```
## Example :
For `n = 12`:
- Divisors checked: (1, 12), (2, 6), (3, 4)
- Total divisors = 6 → Not a prime number

For `n = 13`:
- Divisors checked: (1, 13)
- Total divisors = 2 → Prime number

## Time Complexity

- **O(√n)**: The loop runs from 1 to `√n`.

## Space Complexity

- **O(1)**: Constant space is used regardless of the input.



