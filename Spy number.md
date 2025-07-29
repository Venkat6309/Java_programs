# Spy Number in Java

## 🕵️ What is a Spy Number?

A **Spy Number** is a number for which the **sum of its digits is equal to the product of its digits**.

### ✅ Example:
- Take the number **1124**:
  - Digits: 1, 1, 2, 4
  - Sum: 1 + 1 + 2 + 4 = **8**
  - Product: 1 × 1 × 2 × 4 = **8**
- Since the **sum equals the product**, 1124 is a **Spy Number**.

---

## 🔢 Java Code to Check the given number is Spy Number or  not?

```java
import java.util.Scanner;

public class SpyNumber {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any number: ");
        int n = sc.nextInt();

        int sum = 0, product = 1;

        while (n > 0) {
            int digit = n % 10;
            sum += digit;
            product *= digit;
            n = n / 10;
        }

        if (sum == product) {
            System.out.println("Spy number");
        } else {
            System.out.println("Not a Spy number");
        }
    }
}
