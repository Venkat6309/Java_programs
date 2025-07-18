# PerfectNumber.java

## Description

This Java program checks whether a given number is a **Perfect Number**.

A **Perfect Number** is a positive integer that is equal to the sum of its proper positive divisors, excluding the number itself.
For example:
- 6 is a perfect number because 1 + 2 + 3 = 6
- 28 is a perfect number because 1 + 2 + 4 + 7 + 14 = 28

The code takes a number as input and calculates the sum of its divisors.
It then checks if the sum equals the number itself and prints the result accordingly.

## Java Code
```java
class PerfectNumber{
		public static void main(String args[]){
			int n=17,sum=0;
			int temp=n;
			for(int i=1;i<=n;i++){
				if(n%i==0)
				    sum+=i;
			}
			if(sum==temp)
				System.out.println(n +" is a perfect number");
			else
				System.out.println(n +" is not a perfect number");
	}
}
				
						
```
## Not Perfect Number Examples

Below are some examples of numbers that are **not** perfect numbers:

- **8** → Divisors: 1, 2, 4 → Sum = 7 ≠ 8
- **10** → Divisors: 1, 2, 5 → Sum = 8 ≠ 10
- **12** → Divisors: 1, 2, 3, 4, 6 → Sum = 16 ≠ 12
- **15** → Divisors: 1, 3, 5 → Sum = 9 ≠ 15
- **20** → Divisors: 1, 2, 4, 5, 10 → Sum = 22 ≠ 20

These numbers are not perfect because the sum of their proper divisors does not equal the number itself.
