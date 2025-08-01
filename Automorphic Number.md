# Automorphic Number Checker

## Definition

An **automorphic number** is a number whose square ends in the number itself. In other words, if `n` is an automorphic number, then `n^2` has `n` as its suffix. Examples include 5 (since 5^2 = 25) and 76 (since 76^2 = 5776).


## Description of the Algorithm

1. The input number `n` is taken and its square is computed: `sq = n * n`.
2. In a loop, the program compares the last digit of `n` with the last digit of `sq`:
   - If they differ at any point, the program prints `Not Atomorphic Number` and exits.
   - If they match, both `n` and `sq` are divided by 10 (stripping the last digit), and the comparison continues.
3. If all digits of the original number successfully match the corresponding trailing digits of the square, the program prints `Atomorphic number`.

> Note: The output string in the code has a minor typo: "Atomorphic" should be spelled "Automorphic" for correctness.

## Example

```java
// Example Input: 11
// Expected Output: Automorphic number
```

Explanation: 11 squared is 121, and the last two digits "11" match the original number, so it is automorphic.

## Time Complexity

The algorithm runs in O(d) time, where `d` is the number of digits in the input number, because it compares each digit once from least significant to most.

## Space Complexity

O(1) — only a fixed number of integer variables are used.

## Edge Cases / Notes

- The number 0 is considered automorphic since 0^2 = 0.
- Negative numbers are not handled explicitly; the logic as written will behave on their decimal representation including the sign if adapted, but typically automorphic checks are defined for non-negative integers.
- The code modifies the original `n` during the check; if the original value is needed later, it should be stored separately.
- Typo: Output messages use "Atomorphic" instead of "Automorphic".

  ## Easy approach
```java
 class AutomorphicNumber{
    public static void main(String args[]){
        int n=11,c=0,r=0,p=1;
        int t=n;
        int sq=n*n;
        while(n!=0){
            p*=10;
            n/=10;
        }
        if(t==sq%p)
        System.out.println("Atomorphic number");
        else
        System.out.println("Not a Atomorphic number");
    }
}

```
## Another Approach

```java
class AutomorphicNumber{
    public static void main(String args[]){
        int n=11,c=0,r=0;
        int sq=n*n;
        while(n!=0){
            if(n%10!=sq%10){
                System.out.println("Not Atomorphic Number");
                return;
            }
            n/=10;
            sq/=10;
        }
        System.out.println("Atomorphic number");
    }
}
```
