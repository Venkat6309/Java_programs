
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
class userinputs
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    
	    System.out.print("Enter the name: ");
	    String name = sc.nextLine();           // for string with spaces
	    
	    System.out.print("Enter the age: ");
	    int age = sc.nextInt();               // for int
	    sc.nextLine();                       // after the int or double the value cannot taken by scanner class then that we will use "sc.nextLine()"
	    
	    System.out.print("Enter the favorite color: ");
	    String color = sc.next();            //for string without spaces
	    
	    System.out.print("Enter mobile no: "); 
	    long mobile_no = sc.nextLong();       // for long 
	    
	    
	    System.out.println("My name is "+name);
	    System.out.println("My age is "+age);
	    System.out.println("favorite color "+color);
	    System.out.println("Mobile no "+mobile_no);
	    
	    
	    
	}
}

/* 
      Method	                   Description

    nextBoolean()        	Reads a boolean value from the user
    nextByte()	            Reads a byte value from the user
    nextDouble()	        Reads a double value from the user
    nextFloat()	            Reads a float value from the user
    nextInt()	            Reads a int value from the user
    nextLine()          	Reads a String value from the user
    nextLong()          	Reads a long value from the user
    nextShort()         	Reads a short value from the user


```

## ✅ Example Input/Output

### Input:
```
Enter the name: venkat
Enter the age: 23
Enter the favorite color: green
Enter mobile no: 973727227263
```

### Output:
```
My name is venkat
My age is 23
favorite color green
Mobile no 973727227263
```

## 🔧 Notes

- `nextLine()` is used to capture the full name (including spaces).
- `next().charAt(0)` reads a single character.
- This is a simple program ideal for beginners to learn about `Scanner` usage.

---
