# Bitwise.java

This Java program demonstrates various bitwise operations and the use of the ternary operator.

## 🧾 Description:

The program performs operations on two integers `a = 23` and `b = 14`:

1. `c = a & b` – Bitwise AND
2. `d = c | a` – Bitwise OR
3. `e = c ^ d` – Bitwise XOR
4. `f = (a & b) & c` – Nested Bitwise AND
5. `g = (a & c) ^ (b | d)` – Combination of AND, OR, XOR
6. `h = (d | e) | f` – Nested Bitwise OR
7. Uses a ternary operator to check whether `a` is even or odd.

## 💻 Code:

```java
import java.util.*;
public class Bitwise
{
	public static void main(String[] args) {
		int a=23,b=14;
		int c=a&b;
		int d=c|a;
		int e=c^d;
		int f=(a&b)&c;
		int g=(a&c)^(b|d);
		int h=(d|e)|f;
		System.out.println(c);
		System.out.println(d);
		System.out.println(e);
		System.out.println(f);
		System.out.println(g);
		System.out.println(h);
		String ev="even";
		String od="odd";
		String res=(a%2==0)?ev:od;
                System.out.println(res);
		

		
	}
}
```