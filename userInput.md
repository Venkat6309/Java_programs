
# Java Program: Taking User Input of Various Types

This Java program demonstrates how to take input of various data types using the `Scanner` class.

## 📋 Program Description

The program collects the following information from the user:

- **Name** (String)
- **Roll Number** (int)
- **Section** (char)
- **Percentage** (float)

It then prints the collected data in a readable format.

## 💡 Code

```java
import java.util.Scanner;

public class userInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String name = sc.nextLine();
        int roll = sc.nextInt();
        char section = sc.next().charAt(0);
        float percentage = sc.nextFloat();

        System.out.println("Name: " + name);
        System.out.println("Roll Number: " + roll);
        System.out.println("Section: " + section);
        System.out.println("Percentage: " + percentage);
    }
}
```

## ✅ Example Input/Output

### Input:
```
Alice Johnson
101
B
89.5
```

### Output:
```
Name: Alice Johnson
Roll Number: 101
Section: B
Percentage: 89.5
```

## 🔧 Notes

- `nextLine()` is used to capture the full name (including spaces).
- `next().charAt(0)` reads a single character.
- This is a simple program ideal for beginners to learn about `Scanner` usage.

---
