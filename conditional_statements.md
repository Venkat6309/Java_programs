
# Conditional Statements in Programming

## What Are Conditional Statements?
Conditional statements are used in programming to perform different actions based on different conditions. These allow a program to make decisions and execute particular blocks of code based on whether a condition is true or false.

---

## Types of Conditional Statements

### 1. **`if` Statement**
Executes a block of code if the condition is true.

```java
if (condition) {
    // Code to execute if condition is true
}
```

### 2. **`if-else` Statement**
Executes one block if the condition is true, and another block if it is false.

```java
if (condition) {
    // Code if condition is true
} else {
    // Code if condition is false
}
```

### 3. **`else-if` Ladder**
Used to check multiple conditions.

```java
if (condition1) {
    // Code if condition1 is true
} else if (condition2) {
    // Code if condition2 is true
} else {
    // Code if none of the above conditions are true
}
```

### 4. **`switch` Statement**
Provides multiple branches based on the value of a variable or expression.

```java
switch (expression) {
    case value1:
        // Code block
        break;
    case value2:
        // Code block
        break;
    default:
        // Default code block
}
```

### 5. **Ternary Operator (`? :`)**
A shorthand for `if-else`.

```java
variable = (condition) ? value_if_true : value_if_false;
```

---

## Why Use Conditional Statements?
- To make decisions in code.
- To control the flow of execution.
- To handle multiple outcomes or options dynamically.

---

## Example in Java
```java
int a = 10, b = 20;
if (a > b) {
    System.out.println("a is greater");
} else {
    System.out.println("b is greater");
}
```

This prints: `b is greater`
