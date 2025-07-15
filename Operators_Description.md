
# Java Program: Demonstrating Operators

This Java program showcases the use of various **operators** including arithmetic, relational, logical, and assignment operators.

## 📋 Program Description

The program uses two integers `a` and `b`, performs different operations using operators, and displays the results.

## 💡 Source Code

```java
public class Operators {
    public static void main(String[] args) {
        int a = 10, b = 20;

        // Arithmetic Operators
        System.out.println("Addition: " + (a + b));
        System.out.println("Subtraction: " + (a - b));
        System.out.println("Multiplication: " + (a * b));
        System.out.println("Division: " + (a / b));
        System.out.println("Modulus: " + (a % b));

        // Relational Operators
        System.out.println("a > b: " + (a > b));
        System.out.println("a < b: " + (a < b));
        System.out.println("a == b: " + (a == b));
        System.out.println("a != b: " + (a != b));

        // Logical Operators
        System.out.println("a > 5 && b > 5: " + (a > 5 && b > 5));
        System.out.println("a > 5 || b < 5: " + (a > 5 || b < 5));
        System.out.println("!(a > b): " + !(a > b));

        // Assignment Operators
        a += 5;
        System.out.println("a after a += 5: " + a);
        b *= 2;
        System.out.println("b after b *= 2: " + b);
    }
}
```

## 🧪 Operators Demonstrated

### 1. 🔢 Arithmetic Operators
- `+` (Addition)
- `-` (Subtraction)
- `*` (Multiplication)
- `/` (Division)
- `%` (Modulus)

### 2. 📊 Relational Operators
- `>` (Greater than)
- `<` (Less than)
- `==` (Equal to)
- `!=` (Not equal to)

### 3. ⚙️ Logical Operators
- `&&` (Logical AND)
- `||` (Logical OR)
- `!` (Logical NOT)

### 4. 🖊️ Assignment Operators
- `+=`, `*=`

## ✅ Sample Output

```
Addition: 30
Subtraction: -10
Multiplication: 200
Division: 0
Modulus: 10
a > b: false
a < b: true
a == b: false
a != b: true
a > 5 && b > 5: true
a > 5 || b < 5: true
!(a > b): true
a after a += 5: 15
b after b *= 2: 40
```

## 📝 Notes

- Division with integers truncates the decimal part.
- Assignment operators modify and reassign values in one step.
- Logical operators are useful for evaluating compound conditions.

---
