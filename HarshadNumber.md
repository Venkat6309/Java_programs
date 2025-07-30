# Harshad Number in Java

## 📘 Definition:
if the sum of the digits of a given number divides the given number itself then it is called **Harshad Number** (also known as a **Niven number**) .

For example:
- 18 → 1 + 8 = 9 → 18 ÷ 9 = 2 → ✅ Harshad Number
- 21 → 2 + 1 = 3 → 21 ÷ 3 = 7 → ✅ Harshad Number
- 19 → 1 + 9 = 10 → 19 ÷ 10 = 1.9 → ❌ Not a Harshad Number

---

## 🧾 Java Code

```java
import java.util.Scanner;

public class HarshadNumber {
    public static void main(String[] args) {
        int num, rem = 0, sum = 0, n;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        num = sc.nextInt();
        n = num;

        while (num > 0) {
            rem = num % 10;
            sum = sum + rem;
            num = num / 10;
        }

        if (n % sum == 0) {
            System.out.println(n + " is a Harshad Number.");
        } else {
            System.out.println(n + " is not a Harshad Number.");
        }
    }
}
