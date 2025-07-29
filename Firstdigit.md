### Program: Program to find FirstDigit in a given Number

```java
class FirstDigit{
	public static void main(String []args){
		int n=7424,rem=0;
		while(n!=0){
		rem=n%10;
		n/=10;
		}
		System.out.println("First digit :" + rem);
	}
}
```
**Output:**
```
First digit :7
```


