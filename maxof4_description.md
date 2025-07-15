
# Java Program: Maximum of Four Numbers

## 📄 File: `maxof4.java`

### **Purpose**
This Java program determines the maximum value among four integers using nested ternary operators.

### **Code**
```java
class maxof4 {
    public static void main(String[] args) {
        int a = 10, b = 50, c = 37, d = 20;
        int res = (a > b) ? 
                      (a > c) ? 
                          (a > d) ? a : d 
                          : (c > d) ? c : d 
                  : (b > c) ? 
                      (b > d) ? b : d 
                      : (c > d) ? c : d;
        System.out.println(res);
    }
}
```

### **Explanation**
- Initializes four integers.
- Uses nested ternary operators to compare and find the greatest of the four values.
- Prints the result to the console.

### **Output**
```
50
```

