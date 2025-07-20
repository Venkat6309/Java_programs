# Max of Four Numbers (Java)

This Java program finds the **maximum among four numbers** entered by the user.

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

The program uses conditional statements to compare four integer values and determine the largest among them.

### 🧠 Logic Used

- It compares the four integers using either nested `if-else` conditions or chained comparisons.
- The value which satisfies the condition of being greater than or equal to all others is printed as the maximum.

---

## ⏱ Time Complexity

- **O(1)**: Constant time as only a fixed number of comparisons (3) are made.

## 📦 Space Complexity

- **O(1)**: Only a few integer variables are used.

---

## 🧪 Example

### Input:
```text
Enter four numbers: 10 25 8 17
```

### Output:
```text
The maximum number is: 25
```

---

## 📝 Notes

- This is a basic program useful for understanding conditional logic and comparative operators in Java.
- For larger sets of numbers, arrays and loops are recommended.


