📄 File Name: Java_Switch_Case_Guide.md
markdown
Copy
Edit
# Java Switch Case - Complete Guide

## 🔷 What is a Switch Statement?

The `switch` statement in Java is a control flow structure used to execute one out of many code blocks based on the value of an expression. It is used as an alternative to long chains of `if-else-if` statements for better readability and performance.

---

## 🔷 Basic Syntax (Traditional Switch - Java Before 14)

```java
int number = 2;

switch (number) {
    case 1:
        System.out.println("One");
        break;
    case 2:
        System.out.println("Two");
        break;
    case 3:
        System.out.println("Three");
        break;
    default:
        System.out.println("Not in range");
}
---
✅ Key Points:
Uses case labels for comparison.

break is used to terminate each case block.

Without break, it causes fall-through to the next case.

🔷 Java 14: Enhanced Switch Expressions
Java 14 introduced switch expressions with cleaner, safer syntax.

✅ Arrow Syntax (→)
---java
Copy
Edit
int day = 2;
String result = switch (day) {
    case 1 -> "Monday";
    case 2 -> "Tuesday";
    case 3 -> "Wednesday";
    default -> "Invalid";
};
System.out.println(result);
---
✅ Multiple Case Labels
---java
Copy
Edit
int day = 6;
String type = switch (day) {
    case 1, 7 -> "Weekend";
    case 2, 3, 4, 5, 6 -> "Weekday";
    default -> "Invalid day";
};
---
✅ Switch with Block + yield
---java
Copy
Edit
int marks = 85;
String grade = switch (marks / 10) {
    case 10, 9 -> "A";
    case 8 -> {
        yield "B";
    }
    case 7 -> {
        yield "C";
    }
    default -> {
        yield "F";
    }
};
---
---
🔸 yield is used to return a value from a block-style case in a switch expression.

🔷 All Possibilities in Java Switch
Feature	Traditional Switch	Java 14+ Enhanced Switch
Single case value	✅ Yes	✅ Yes
Multiple case values per case	❌ No	✅ Yes (case 1, 2 ->)
Return value from switch	❌ No	✅ Yes
Arrow syntax	❌ No	✅ Yes (->)
Fall-through by default	✅ Yes	❌ No (default is safe)
Case blocks with yield	❌ No	✅ Yes
Used as an expression	❌ No	✅ Yes
---
---
🔷 Data Types Allowed in Switch
Data Type	Allowed in Switch?	Notes
byte	✅ Yes	Primitive
short	✅ Yes	Primitive
char	✅ Yes	Primitive
int	✅ Yes	Primitive
String	✅ Yes (Java 7+)	Reference
enum	✅ Yes	Enum types
Integer	✅ Yes (auto-unboxed)	Wrapper
Character	✅ Yes (auto-unboxed)	Wrapper
long	❌ No	Not supported
float	❌ No	Not supported
double	❌ No	Not supported
boolean	❌ No	Use if-else instead
---
🔷 Example: Enum with Switch
---java
Copy
Edit
enum TrafficSignal { RED, YELLOW, GREEN }

public class Main {
    public static void main(String[] args) {
        TrafficSignal signal = TrafficSignal.RED;

        String action = switch (signal) {
            case RED -> "Stop";
            case YELLOW -> "Caution";
            case GREEN -> "Go";
        };

        System.out.println("Signal action: " + action);
    }
}
---
