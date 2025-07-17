# Leap Year Program in Java

## ✅ Description:
This Java program identifies and prints all **leap years** between the years `2000` and `2070`. It uses standard leap year logic:
- A year is a leap year if it is divisible by 4 **and** not divisible by 100,
- **OR** it is divisible by 400.

This is implemented using a `for` loop to iterate through the years and a conditional `if` statement to check each year.

## ✅ Code (`Leapyear.java`)
```java
class Leapyear {
    public static void main(String args[]) {
        int n = 2000, m = 2070;

        for (int i = n; i <= m; i++) {
            if ((i % 4 == 0 && i % 100 != 0) || i % 400 == 0)
                System.out.print(i + "  ");
        }
    }
}
```
