
# Switch-Case Statement in Java

## Introduction

The `switch` statement in Java is a type of control statement that allows a variable to be tested for equality against a list of values. Each value is called a **case**, and the variable being switched on is checked for each case.

This is particularly useful when you have a large number of conditions based on a single variable.

---

## Syntax (Traditional)

```java
switch (expression) {
    case value1:
        // Code block for value1
        break;
    case value2:
        // Code block for value2
        break;
    ...
    default:
        // Default code block
}
```

### Components:
- **expression**: Can be `int`, `byte`, `short`, `char`, `enum`, `String`, or wrapper types like `Integer`.
- **case**: Each value compared to the expression.
- **break**: Optional. Stops execution of more cases.
- **default**: Optional. Executes if no match is found.

---

## How it Works

1. The `expression` is evaluated.
2. Its value is compared with the values of each `case`.
3. If a match is found, the corresponding block of code is executed.
4. If no `break` statement is used, execution continues to the next case (fall-through).
5. The `default` block executes if no matching case is found.

---

## Example 1: Basic Usage

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
        System.out.println("Not in range 1-3");
}
```

### Output:
```
Two
```

---

## Example 2: Without Break (Fall-Through)

```java
int number = 2;

switch (number) {
    case 1:
        System.out.println("One");
    case 2:
        System.out.println("Two");
    case 3:
        System.out.println("Three");
    default:
        System.out.println("Default");
}
```

### Output:
```
Two
Three
Default
```

---

## Example 3: Using String in Switch

```java
String day = "MONDAY";

switch (day) {
    case "MONDAY":
        System.out.println("Start of work week");
        break;
    case "FRIDAY":
        System.out.println("End of work week");
        break;
    default:
        System.out.println("Midweek days");
}
```

---

## Java 14: Switch Expressions (New Syntax)

Java 14 introduced a new and enhanced version of the switch statement called **switch expressions**. This allows returning a value from the switch directly.

### Syntax:

```java
String result = switch (day) {
    case "MONDAY", "TUESDAY", "WEDNESDAY", "THURSDAY" -> "Weekday";
    case "FRIDAY" -> "Almost Weekend";
    case "SATURDAY", "SUNDAY" -> "Weekend";
    default -> "Invalid day";
};
```

### Example:

```java
String day = "FRIDAY";

String message = switch (day) {
    case "MONDAY", "TUESDAY", "WEDNESDAY", "THURSDAY" -> "It's a weekday.";
    case "FRIDAY" -> "It's almost the weekend!";
    case "SATURDAY", "SUNDAY" -> "It's the weekend!";
    default -> "Unknown day.";
};

System.out.println(message);
```

### Output:
```
It's almost the weekend!
```

### Advantages:
- More concise.
- Returns values directly.
- Eliminates need for `break` statements.
- Reduces fall-through bugs.

---

## Limitations

- Cannot evaluate ranges or complex conditions (use `if-else` for that).
- Expression must be compatible type (e.g., `int`, `String`, etc.).

---

## Advantages

- Improves code readability.
- Faster than long `if-else` chains when dealing with many exact values.
- Java 14 expressions return values directly — clean and functional.

---

## Summary

- `switch` is a multi-branch decision statement.
- Use `break` to prevent fall-through in traditional syntax.
- `default` is optional but useful.
- Java 14 introduced `switch expressions` for cleaner code and returning values.

