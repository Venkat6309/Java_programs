# For Loop in Java

## Syntax

```java
for(initialization; condition; update) {
    // Code to execute
}
```

### Example:
```java
for(int i = 1; i <= 10; i++) {
    System.out.println(i);
}
```

---

## Description

The `for` loop in Java is used when the number of iterations is known beforehand. It consists of three parts:

- **Initialization**: Initializes the loop control variable.
- **Condition**: Evaluated before each iteration; loop runs as long as this is true.
- **Update**: Updates the loop control variable after each iteration.

---

## Java Program Examples and Output:

```java
/* Example 1: Sum of Even Numbers and Product of Odd Numbers */
class EvensumOddmul {
    public static void main(String args[]) {
        int m = 2;
        int n = 10, sum = 0, mul = 1;
        for (int i = m; i <= n; i++) {
            if (i % 2 == 0)
                sum += i;
            else
                mul *= i;
        }
        System.out.println("Even sum:" + sum);
        System.out.println("Odd mul:" + mul);
    }
}
```
**Output:**
```
Even sum:30
Odd mul:945
```

```java
/* Example 2: Alphabet pattern (A1 B2 C3 ... Z26) */
class Pattern1 {
    public static void main(String args[]) {
        int i = 1;
        for (char ch = 'A'; ch <= 'Z'; i++, ch++) {
            System.out.println(ch + " " + i);
        }
    }
}
```
**Output:**
```
A 1    M 13
B 2    N 14
C 3    O 15
D 4    P 16
E 5    Q 17
F 6    R 18 
G 7    S 19
H 8    T 20
I 9    U 21
J 10   V 22 
K 11   W 23
L 12   X 24
       Y 24
       Z 25
```

```java
/* Example 3: a|1|A , b|2|B , c|3|C ... z|26|Z */
class Pattern2 {
    public static void main(String args[]) {
        int i = 1;
        for (char c = 'a', ch = 'A'; c <= 'z' && ch <= 'Z'; i++, ch++, c++) {
            System.out.println(c + " | " + i + " | " + ch);
        }
    }
}
```
**Output:**
```
a | 1 | A
b | 2 | B
c | 3 | C
d | 4 | D
e | 5 | E
f | 6 | F
g | 7 | G
h | 8 | H
i | 9 | I
j | 10 | J
.................
y | 25 | Y
z | 26 | Z

```

```java
/* Example 4: Pattern A $ Z , B $ Y, ..., Z $ A */
class Pattern3 {
    public static void main(String args[]) {
        for (char ch1 = 'A', ch2 = 'Z'; ch1 <= 'Z' && ch2 >= 'A'; ch1++, ch2--) {
            System.out.println(ch1 + " $ " + ch2);
        }
    }
}
```
**Output:**
```
A $ Z
B $ Y
C $ X
D $ W
E $ V
F $ U
G $ T
H $ S
I $ R
J $ Q
K $ P
L $ O
M $ N
```
```java
/* Example 1: Print all the numbers from 1 - 20 */
class num{
	public static void main(String args[]){
		        int n=20;
			for(int i=0;i<=n;i++){
			System.out.println(i);
		}
	}
}
```
**Output:**
```
1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 17 18 19 20
```
```java
/* Example 2: Print all odd numbers from 1 - 20 */
class Oddnum{
	public static void main(String args[]){
		        int n=20;
			for(int i=0;i<=n;i++){
				if(i%2!=0)
				System.out.println(i);
		}
	}
}
```
**Output:**
```
1 3 5 7 9 11 13 15 17 19
```
```java
/* Example 3: Print squares of all even numbers from m to n */
class Squares{
	public static void main(String args[]){
		        int m=2,n=10;
			for(int i=m;i<=n;i++){
				if(i%2==0)
				System.out.println(i*i);
		}
	}
}
```
**Output:**
```
4 16 36 64 100
```
```java
/* Example 4: Print Sum of N numbers */
class SumofNum{
	public static void main(String args[]){
		        int n=10,sum=0;
			for(int i=1;i<=n;i++){
				sum+=i;
		}
		System.out.println(sum);
	}
}
```
**Output:**
```
55
```
```java
/* Example 5: Find the factorial of a given number */
class factorial{
	public static void main(String args[]){
		        int n=6,fact=1;
			for(int i=1;i<=n;i++){
				fact*=i;
		}
		System.out.println(fact);
	}
}
```
**Output:**
```
720
```
```java
/* Example 6: Find the sum of even numbers from m to n */
class SumofEvenNum{
	public static void main(String args[]){
		        int m=1,n=10,sum=0;
			for(int i=m;i<=n;i++){
				if(i%2==0)
				sum+=i;
		}
		System.out.println(sum);
	}
}
```
**Output:**
```
30
```
```java
/* Example 7: Find the product of odd numbers from m to n */
class MulofOddNum{
	public static void main(String args[]){
		        int m=1,n=10,mul=1;
			for(int i=1;i<=n;i++){
				if(i%2!=0)
				mul*=i;
		}
		System.out.println(mul);
	}
}
```
**Output:**
```
945
```
```java
/* Example 8: print the  multiplication table  */
class Table{
	public static void main(String args[]){
			int n=10,m=3;
			for(int i=1;i<=n;i++){
				System.out.println(m+" x "+i+" = "+ m*i);
		}
	}
}
```
**Output:**
```
3 x 1 = 3
3 x 2 = 6
3 x 3 = 9
3 x 4 = 12
3 x 5 = 15
3 x 6 = 18
3 x 7 = 21
3 x 8 = 24
3 x 9 = 27
3 x 10 = 30
```
```java
/* Example 9: Print all the numbers which is div by 5 & 3 from 10 to 100 */
class DivOfNum{
	public static void main(String args[]){
			int m=10,n=100;
			for(int i=m;i<=100;i++){
				if(i%5==0 && i%3==0)
				System.out.println(i);
		}
	}
}
```
**Output:**
```
15 30 45 60 75 90
```
```java
/* Example 10: Print all the factors for the given value of n */
class Factors{
	public static void main(String args[]){
			int n=12;
			for(int i=1;i<=12;i++){
				if(n%i==0)
				System.out.println(i);
		}
	}
}

```
**Output:**
```
2 3 4 6 12
```
