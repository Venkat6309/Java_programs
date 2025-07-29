/* Java Patterns
class Pattern1{
	public static void main(String []args){
		int n=5;
		for(int i=1;i<=n;i++){
			for(int j=1;j<=n;j++){
				System.out.print("&");
			}
		System.out.println();
		}
	}
}

&&&&&
&&&&&
&&&&&
&&&&&
&&&&&
-------------------------------------------------

class Pattern2{
	public static void main(String []args){
		int n=5;
		for(int i=1;i<=n;i++){
			for(int j=1;j<=n;j++){
				System.out.print(j);
			}
		System.out.println();
		}
	}
}

12345
12345
12345
12345
12345
-------------------------------------------------

class Pattern3{
	public static void main(String []args){
		int n=5;
		for(int i=1;i<=n;i++){
			for(int j=1;j<=n;j++){
				System.out.print(i);
			}
		System.out.println();
		}
	}
}

11111
22222
33333
44444
55555
-------------------------------------------------


class Pattern4{
	public static void main(String []args){
		int n=5;
		for(int i=1;i<=n;i++){
			for(int j=1;j<=i;j++){
				System.out.print("*");
			}
		System.out.println();
		}
	}
}

*
**
***
****
*****

-------------------------------------------------

class Pattern5{
	public static void main(String []args){
		int n=5;
		for(int i=1;i<=n;i++){
			for(int j=1;j<=i;j++){
				System.out.print(i);
			}
		System.out.println();
		}
	}
}

1
22
333
4444
55555

-------------------------------------------------


class Pattern6{
	public static void main(String []args){
		int n=5;
		for(int i=1;i<=n;i++){
			for(int j=1;j<=i;j++){
				System.out.print(j);
			}
		System.out.println();
		}
	}
}

1
12
123
1234
12345
-------------------------------------------------

class Pattern7{
	public static void main(String []args){
		int n=5;
		for(int i=1;i<=n;i++){
			for(int j=n;j>=i;j--){
				System.out.print("*");
			}
		System.out.println();
		}
	}
}

*****
****
***
**
*
-------------------------------------------------

class Pattern8{
	public static void main(String []args){
		int i,j,n=5;
		for(i=1;i<=n;i++){
			for(j=5;j>=i;j--){
				System.out.print(" ");
				}
			for(j=1;j<=i;j++){
				System.out.print("*");
			}
		System.out.println();
		}		
	
	}
			
}

     *
    **
   ***
  ****
 *****
------------------------------------------------------

// Square Hallow pattern
class Pattern9{
	public static void main(String []args){
		int n=5;
		for(int i=1;i<=n;i++){
			for(int j=1;j<=n;j++){
				if(i==1||i==n||j==1||j==n)
				System.out.print("*");
				else
				System.out.print(" ");
			}
		System.out.println();
		}
	}
}

*****
*   *
*   *
*   *
*****
---------------------------------------------------------------

// X pattern
 
class Pattern10{
	public static void main(String []args){
		int n=5;
		for(int i=1;i<=n;i++){
			for(int j=1;j<=n;j++){
				if(i==j||i+j==n+1)
				System.out.print("*");
				else
				System.out.print(" ");
			}
		System.out.println();
		}
	}
}

*   *
 * *
  *
 * *
*   *

---------------------------------------------------------------
*/

class Pattern11{
	public static void main(String []args){
		int n=9;
		for(int i=1;i<=n;i++){
			for(int j=1;j<=n-i;j++){
				System.out.print(" ");    //spaces
			}

			for(int j=1;j<=2*i-1;j++){
				System.out.print("*"); //stars
			}

                        for(int j=1;j<=n-i;j++){
				System.out.print(" ");      //spaces
			}	
		System.out.println();
		}
		
	}
}
/*

       *
      ***
     *****
    *******
   *********
  ***********
 *************
***************

---------------------------------------------------------------

//Number changing pyramid

class Pattern12{
	public static void main(String []args){
		int n=5,k=1;
		for(int i=1;i<=n;i++){
			for(int j=0;j<i;j++){
				System.out.print(k++ +" ");
			}
		System.out.println();
		}
	}
}

1
2 3
4 5 6
7 8 9 10
11 12 13 14 15

---------------------------------------------------------------


//Zero one Triangle 

class Pattern13{
	public static void main(String []args){
		int n=5,s=0;
		for(int i=1;i<=n;i++){
			if(i%2==0)
			s=1;
			else
			s=0;
		
			for(int j=1;j<=i;j++){
		       		System.out.print(s);
				 s=1-s;	
			}
			System.out.println();
		}
	}
}

0
10
010
1010
01010

---------------------------------------------------------------

// Number Traingle

class Pattern14{
	public static void main(String []args){
		int n=5;
		for(int i=1;i<=n;i++){
			for(int j=1;j<=n-i;j++){
				System.out.print(" ");
			}
			for(int j=1;j<=2*i-1;j++){
				System.out.print(j);
			}
			for(int j=1;j<=n-i;j++){
				System.out.print(" ");
			}
		System.out.println();
		}
	}
}

    1
   123
  12345
 1234567
123456789

---------------------------------------------------------------
// Palindrome Traingle

class Pattern15{
	public static void main(String []args){
		int n=5;
		for(int i=1;i<=n;i++){
			for(int j=1;j<=n-i;j++){
				System.out.print(" ");  //spaces
			}
			for(int j=i;j>=1;j--){
				System.out.print(j);
			}
			for (int j = 2; j <= i; j++) {
                               System.out.print(j);
            }
			for(int j=1;j<=n-i;j++){
				System.out.print(" ");  //spaces
			}
		System.out.println();
		}
	}
}

    1
   212
  32123
 4321234
543212345

---------------------------------------------------------------

// Diamond Shape

class Pattern16{
	public static void main(String [] args){
		int n=5;
		for(int i=1;i<=n;i++){
			for(int j=1;j<=n-i;j++)
				System.out.print(" ");
			for(int j=1;j<=2*i-1;j++)
				System.out.print("*");        //upside triangle
			for(int j=1;j<=n-i;j++)
				System.out.print(" ");
			System.out.println();	

			}
		
		for(int i=1;i<=n-1;i++){
			for(int j=1;j<=i;j++)
				System.out.print(" ");
			for(int j=1;j<=2*n-(2*i+1);j++)     // Downside triangle
				System.out.print("*");
			for(int j=1;j<=i;j++)
				System.out.print(" ");
			System.out.println();
	
                        }			
		}
}

    *
   ***
  *****
 *******
*********
 *******
  *****
   ***
    *

---------------------------------------------------------------


class Pattern17{
	public static void main(String [] args){
		int n=5;
		for(int i=1;i<=n;i++){
			for(int j=1;j<=i;j++)
				System.out.print("*");
			System.out.println();
			}
		for(int i=1;i<=n;i++){
			for(int j=1;j<=n-i;j++)
				System.out.print("*");
			System.out.println();
			}		
		}
}

*
**
***
****
*****
****
***
**
*

---------------------------------------------------------------


class Pattern18{
	public static void main(String [] args){
		int n=5;
		for(int i=1;i<=n;i++){
			for(int j=1;j<=i;j++)
				System.out.print("*");
			for(int j=0;j<=2*n-(2*i+1);j++)
				System.out.print(" ");
			for(int j=1;j<=i;j++)
				System.out.print("*");
			System.out.println();
			}
		}
	}
	
*        *
**      **
***    ***
****  ****
**********
	
---------------------------------------------------------------				

class Pattern19{
	public static void main(String [] args){
		int n=5;
		for(int i=1;i<=n;i++){
			for(int j=1;j<=i;j++)
				System.out.print(j);
			for(int j=0;j<=2*n-(2*i+1);j++)
				System.out.print(" ");
			for(int j=i;j>=1;j--)
				System.out.print(j);
			System.out.println();
			}
		}
	}

1        1
12      21
123    321
1234  4321
1234554321

---------------------------------------------------------------				


class Pattern20{
	public static void main(String [] args){
		int n=5;
		char ch;
		for(int i=1;i<=n;i++){
			for(ch='A';ch<='A'+i-1;ch++)  
				System.out.print(ch);
			System.out.println();
			}
		}	

	}

A
AB
ABC
ABCD
ABCDE

---------------------------------------------------------------				


class Pattern21{
	public static void main(String [] args){
		int n=5;
		char ch;
		for(int i=1;i<=n;i++){
			for(ch='A';ch<='A'+n-i;ch++)
				System.out.print(ch);
			System.out.println();
			}
		}	

	}

ABCDE
ABCD
ABC
AB
A
---------------------------------------------------------------				

class Pattern22{
	public static void main(String []args){
		int n=5;
		for(int i=1;i<=n;i++){
			for(int j=1;j<=n-i;j++){
				System.out.print(" ");  //spaces
			}
			for(char ch='A';ch<='A'+i-1;ch++){
				System.out.print(ch);
			}
			for (char ch='A';ch<='A'+i-2;ch++) {
                               System.out.print(ch);
            }
			for(int j=1;j<=n-i;j++){
				System.out.print(" ");  //spaces
			}
		System.out.println();
		}
	}
}

    A
   ABA
  ABCAB
 ABCDABC
ABCDEABCD

---------------------------------------------------------------				


class Pattern23{
	public static void main(String [] args){
		int n=5;
		char ch;
		for(int i=1;i<=n;i++){
			for(ch='E';ch>='E'-i+1;ch--)  
				System.out.print(ch);
			System.out.println();
			}
		}
	}
E
ED
EDC
EDCB
EDCBA

---------------------------------------------------------------				

class Pattern24{
	public static void main(String [] args){
		int n=5;
		char ch;
		for(int i=1;i<=n;i++){
			for(ch=(char)('E' - i+1);ch<='E';ch++)  
				System.out.print(ch);
			System.out.println();
			}
		}
	}
E
DE
CDE
BCDE
ABCDE
---------------------------------------------------------------				

//Hallow Diamond

class Pattern25{
	public static void main(String [] args){
		int n=5;
		for(int i=1;i<=n;i++){
			for(int j=1;j<=n-i+1;j++)
				System.out.print("*");
			for(int j=1;j<=2*i-2;j++)
				System.out.print(" ");
			for(int j=1;j<=n-i+1;j++)
				System.out.print("*");
			System.out.println();
		}
		
		for(int i=1;i<=n-1;i++){
			for(int j=1;j<=i+1;j++)
				System.out.print("*");
			for(int j=1;j<=2*n-(2*i+2);j++)
				System.out.print(" ");
			for(int j=1;j<=i+1;j++)
				System.out.print("*");
			System.out.println();
		}
			
	}
}
**********
****  ****
***    ***
**      **
*        *
**      **
***    ***
****  ****
**********
                       
---------------------------------------------------------------				

class Pattern26{
	public static void main(String [] args){
		int n=5;
		for(int i=1;i<=n;i++){
			for(int j=1;j<=i;j++)
				System.out.print("*");
			for(int j=1;j<=2*n-2*i;j++)
				System.out.print(" ");
			for(int j=1;j<=i;j++)
				System.out.print("*");
			System.out.println();
			}
	
		for(int i=1;i<=n-1;i++){
			for(int j=1;j<=n-i;j++)
				System.out.print("*");
			for(int j=1;j<=2*i;j++)
				System.out.print(" ");
			for(int j=1;j<=n-i;j++)
				System.out.print("*");
			System.out.println();
			}
			
		}
	}
			
*        *
**      **
***    ***
****  ****
**********
****  ****
***    ***
**      **
*        *

---------------------------------------------------------------				

class Pattern27 {
    public static void main(String[] args) {
        int n = 4;
        for (int i = 1; i <= 2 * n - 1; i++) {
            for (int j = 1; j <= 2 * n - 1; j++) {
                int top = i - 1;
                int left = j - 1;
                int right = (2 * n - j);
                int down = (2 * n - i);

                int md = Math.min(Math.min(top, down), Math.min(left, right));

                System.out.print(n - md);
            }
            System.out.println();
        }
    }
}
4444444
4333334
4322234
4321234
4322234
4333334
4444444

---------------------------------------------------------------				

class Pattern28 {
    public static void main(String[] args) {
        int n = 5;
	for(int i=1;i<=n;i++){
		for(int j=1;j<=n;j++){
			if(i==1||j==1||i==n||(j==n && i>=3)||(i==3 && j>=3)) 
				System.out.print("*");
			else
				System.out.print(" ");
			}
		System.out.println();
		}
	}
}

*****
*
* ***
*   *
*****
---------------------------------------------------------------				

11 12 13 14 15 16 17 18 19
21 22 23 24 25 26 27 28 29
31 32 33 34 35 36 37 38 39 
41 42 43 44 45 46 47 48 49
51 52 53 54 55 56 57 58 59
61 62 63 64 65 66 67 68 69
71 72 73 47 57 76 77 78 79
81 82 83 84 85 86 87 88 89
91 92 93 94 95 96 97 98 99


// patterns by using the extra variable (easy approach)

class Pattern29{
	public static void main(String[]args){
		int n=7;
		int stars=1;
		for(int i=1;i<=n;i++){
			for(int j=1;j<=stars;j++)
				System.out.print("*");
			System.out.println();
		if(i<=3)
			stars++;
		else
			stars--;
		}
	}
}

*
**
***
****
***
**
*
------------------------------------------------------------------

class Pattern30{
	public static void main(String[]args){
		int n=7;
		int stars=4;
		for(int i=1;i<=n;i++){
			for(int j=1;j<=stars;j++)
				System.out.print("*");
			System.out.println();
		if(i<=3)
			stars--;		
		else
			stars++;
			
		}
	}
}

****
***
**
*
**
***
****
------------------------------------------------------------------


class Pattern31{
	public static void main(String[]args){
		int n=7;
		int stars=4;
		int spaces=0;
		for(int i=1;i<=n;i++){
			for(int j=1;j<=spaces;j++)
				System.out.print(" ");
			for(int j=1;j<=stars;j++)
				System.out.print("*");
			System.out.println();
		if(i<=3){
			stars--;
			spaces++;
		}
		else{
			stars++;
			spaces--;
		}
		}
	}
}

****
 ***
  **
   *
  **
 ***
****

------------------------------------------------------------------

class Pattern32{
	public static void main(String[]args){
		int n=7;
		int stars=1;
		int spaces=4;
		for(int i=1;i<=n;i++){
			for(int j=1;j<=spaces;j++)
				System.out.print(" ");
			for(int j=1;j<=stars;j++)
				System.out.print("*");
			System.out.println();
		if(i<=3){
			stars++;
			spaces--;
		}
		else{
			stars--;
			spaces++;
		}
		}
	}
}

    *
   **
  ***
 ****
  ***
   **
    *


------------------------------------------------------------------

class Pattern33{
	public static void main(String[]args){
		int n=4;
		int stars=1;
		int spaces=4;
		for(int i=1;i<=n;i++){
			for(int j=1;j<=spaces;j++)
				System.out.print(" ");
			for(int j=1;j<=stars;j++)
				System.out.print("*");
			for(int j=1;j<=spaces;j++)
				System.out.print(" ");

			System.out.println();
			spaces--;
			stars+=2;
		}
	}
}

    *
   ***
  *****
 *******
------------------------------------------------------------------
	
class Pattern34{
	public static void main(String[]args){
		int n=4;
		int stars=1;
		int spaces=3;
		for(int i=1;i<=n;i++){
			for(int j=1;j<=spaces;j++)
				System.out.print(" ");
			for(int j=1;j<=stars;j++){
				if(j%2==0 )
				System.out.print(" ");
				else
				System.out.print("*");
			}
			for(int j=1;j<=spaces;j++)
				System.out.print(" ");
			System.out.println();
			spaces--;
			stars+=2;
		}
	}
}


   *
  * *
 * * *
* * * *	

------------------------------------------------------------------

class Pattern35{
	public static void main(String[]args){
		int n=7,mid=(n/2)+1;
		int stars=3;
		int spaces=1;
		for(int i=1;i<=n;i++){
			for(int j=1;j<=stars;j++)
				System.out.print("*");
			for(int j=1;j<=spaces;j++){
				if(i==j && i==mid && j==mid )
				System.out.print("@");
				else
				System.out.print(" ");
			}
			for(int j=1;j<=stars;j++)
				System.out.print("*");
			System.out.println();
			if(i<mid){
			stars--;
			spaces+=2;
			}
			else{
			stars++;
			spaces-=2;
			}
		}
	}
}
*** ***
**   **
*     *
   @
*     *
**   **
*** ***
------------------------------------------------------------------

class Pattern36{
	public static void main(String[]args){
		int n=5;
		int stars=1;
		int spaces=n+1;
		for(int i=1;i<=n;i++){
			for(int j=1;j<=stars;j++)
				System.out.print("*");
			for(int j=1;j<=spaces;j++)
				System.out.print(" ");
			for(int j=1;j<=stars;j++)
				if(i==n){
				stars=i-1;                  // if(!(i==4 && m=1)
				System.out.print("*");      // System.out.print("* ");
				}
				else
				System.out.print("*");
			System.out.println();
			stars++;
			spaces-=2;	
			
		}
	}
}

------------------------------------------------------------------

class Pattern37{
	public static void main(String [] args){
		int n=7,mid=(n/2)+1;
		int st=4;
		int sp=0;
		for (int i=1;i<=n;i++){
			for(int j=1;j<=sp;j++)
				System.out.print(" ");
			for(int j=1;j<=st;j++)
				System.out.print("*");
			for(int j=1;j<=st-1;j++)
				System.out.print("*");
			System.out.println();
			if(i<mid){
			st--;
			sp++;
			}
			else{
			st++;
			sp--;
			}

			}
		}
}

	

*******
 *****
  ***
   *
  ***
 *****
*******
------------------------------------------------------------------



class Pattern38{
	public static void main(String [] args){
		int n=8;
		int st=7;
		int sp=0;
		for (int i=1;i<=n;i++){
			for(int j=1;j<=sp;j++)
				System.out.print(" ");
			for(int j=1;j<=st;j++)
				System.out.print("*");
			System.out.println();
			if(i<3){
			st-=2;
			sp++;
			}
			else if(i>=3 && i<5){
			st+=2;
			sp--;
			}
			else if(i>=6){
			st-=2;
			sp++;
			}
		}
	} 
		
}
	
								
			
*******
 *****
  ***
 *****
*******
*******
 *****
  ***	

------------------------------------------------------------------


class Pattern39{
	public static void main(String[] args){
		int n=7;
		int st=1;
		int sp=3;
		int rst=5;
		for(int i=1;i<=n;i++){
			for(int j=1;j<=sp;j++)
				System.out.print(" ");
			for(int j=1;j<=st;j++)
				System.out.print("*");
			if(i>2 && i<6)
			for(int j=1;j<=rst;j++)
				System.out.print("*");
			System.out.println();
			if(i<4){
			sp--;
			st++;
			}
			else{
			sp++;
			st--;
			}				
		}
	}
}

   *
  **
 ********
*********
 ********
  **
   *
------------------------------------------------------------------

class Pattern40{
	public static void main(String [] args){
		int n=7,mid=(n/2)+1;
		int st=4;
		int sp=-1;
		for (int i=1;i<=n;i++){
			for(int j=1;j<=st;j++){
				System.out.print("*");
			}
			for(int j=1;j<=sp;j++){
				System.out.print(" ");
			}
			for(int j=1;j<=st;j++){
				if(!(j==4))
				System.out.print("*");
			}
			System.out.println();
			if(i<mid){
			st--;
			sp+=2;
			}
			else{
			st++;
			sp-=2;
			}

			}
		}
}

*******
*** ***
**   **
*     *
**   **
*** ***
*******

---------------------------------------------------------------

class Pattern41{
	public static void main(String [] args){
		int n=14;
		int sst=1;
		int mst=1;
		int sp=5;
		int stars=11;
		int spaces=1;
		for (int i=1;i<=14;i++){
			if(i<=4){
			for(int j=1;j<=sst;j++)
				System.out.print("*");
			for(int j=1;j<=sp;j++)
				System.out.print(" ");
			for(int j=1;j<=mst;j++)
				System.out.print("*");
			for(int j=1;j<=sp;j++)
				System.out.print(" ");
			for(int j=1;j<=sst;j++)
				if(!(i==4 && (j==1 || j==2)))
				System.out.print("*");
			}
			else if(i>=5)
			{
			for(int j=1;j<=spaces;j++)
				System.out.print(" ");
			for(int j=1;j<=stars;j++)
				System.out.print("*");
			}
			System.out.println();
			if(i<=4){
			sst++;
			sp-=2;
			mst+=2;
			}
			else if(i>=5 && i<9){
			stars-=2;
			spaces++;
			}	
						
		}
	}
}	
		
*     *     *
**   ***   **
*** ***** ***
*************
 ***********
  *********
   *******
    *****
     ***
     ***
     ***
     ***
     ***
     ***						
						

---------------------------------------------------------------


class Pattern42{
	public static void main(String[]args){
		int n=12;
			for(int i=1;i<=n;i++){
			for(int j=1;j<=7;j++)
				if(i+j==5||j-i==3 ||(i-j==3 && i<=7)||(i+j==11 && i<=7)||i==4||j==4)
				System.out.print("* ");
				else	
				System.out.print("  ");
			System.out.println();
	
		}
	}
}


      *
    * * *
  *   *   *
* * * * * * *
  *   *   *
    * * *
      *
      *
      *
      *
      *
      *

---------------------------------------------------------------


class Pattern43{
	public static void main(String args[]){
		int n=7;
		int sp=3;
		int st=1;
		int mid=(n/2)+1;
		for(int i=1;i<=n;i++){
			int m=1;
			for(int j=1;j<=sp;j++)
				System.out.print("  ");
			for(int j=1;j<=st;j++){
				if(j<=st/2)
				System.out.print(m++ +" ");
				else
				System.out.print(m-- +" ");
			}
			System.out.println();
			if(i<mid){
			sp--;
			st+=2;
			}
			else{
			sp++;
			st-=2;
			}
		}
	}
}
			
      1
    1 2 1
  1 2 3 2 1
1 2 3 4 3 2 1
  1 2 3 2 1
    1 2 1
      1			
---------------------------------------------------------------

class Pattern44{
	public static void main(String args[]){
		int n=4;
		int val=1;
		int sp=5;
		for(int i=1;i<=n;i++){
			for(int j=1;j<=val;j++)
				System.out.print(j);
			for(int j=1;j<=sp;j++)
				System.out.print(" ");
			for(int j=val;j>=1;j--){
				if(!(i==4 && j==4))
				System.out.print(j);
			}
			System.out.println();
			val++;
			sp-=2;
			}
		}
	}		
					
1     1
12   21
123 321
1234321		
---------------------------------------------------------------


class Pattern45{
	public static void main(String args[]){
		int n=5;
		for(int i=1;i<=n;i++){
			for(int j=1;j<=n;j++){
				if(i==j || i+j==6)
				System.out.print(i);
				else
				System.out.print(" ");
			}
			System.out.println();
			
		}
	}
}

1   1
 2 2
  3
 4 4
5   5	

---------------------------------------------------------------


class Pattern46{
	public static void main(String args[]){
		int n=7;
		int sp=3;
		int st=1;
		int mid=(n/2)+1;
		int m;
		for(int i=1;i<=n;i++){
			if(i<=4)
			m=i;
			else
			m=n-i+1;
			for(int j=1;j<=sp;j++)
				System.out.print("  ");
			for(int j=1;j<=st;j++){
				if(j<=st/2)
				System.out.print(m-- +" ");
				else 
				System.out.print(m++ +" ");
			}
			System.out.println();
			if(i<mid){
			sp--;
			st+=2;
			}
			else{
			sp++;
			st-=2;
			}
		}
	}
}

      1
    2 1 2
  3 2 1 2 3
4 3 2 1 2 3 4
  3 2 1 2 3
    2 1 2
      1
---------------------------------------------------------------

class Pattern47{
	public static void main(String args[]){
		int n=9;
		int sp=3;
		int val=1,c=1;
		for(int i=1;i<=n;i++){
			for(int j=1;j<=sp;j++)
				System.out.print("   ");
			for(int j=1;j<=val;j++)
				System.out.printf("%2d ",c++);
			System.out.println();
			if(i<4){
			sp--;
			val+=2;
			}
			else{
			sp=2;
			val=3;
			}	
		}
	}
}
				
          1
       2  3  4
    5  6  7  8  9
10 11 12 13 14 15 16
      17 18 19
      20 21 22
      23 24 25
      26 27 28
      29 30 31

---------------------------------------------------------------


	
class Pattern48{
	public static void main(String[] args){
		int n=4;
		char ch='a';
		for(int i=1;i<=n;i++){
			for(int j=1;j<=n;j++){
				System.out.print(ch);
			}
			System.out.println();
			ch++;
		}
		
	}
}
					
aaaa
bbbb
cccc
dddd

---------------------------------------------------------------


class Pattern49{
	public static void main(String[] args){
		int n=5,m=1;
		char ch='a';
		for(int i=1;i<=n;i++){
			for(int j=1;j<=2;j++){
				System.out.print(ch++ + "  " + m++ + "  ");
			}
			System.out.println();
			
		}
		
	}
}

a  1  b  2
c  3  d  4
e  5  f  6
g  7  h  8
i  9  j  10
---------------------------------------------------------------


class Pattern50{
	public static void main(String[] args){
		int n=5,m=1;
		char ch='a';
		for(int i=1;i<=n;i++){
			for(int j=1;j<=n;j++){
				if(j==1||j==n)
				System.out.print(ch++);
				else if(j==3)
				System.out.print("$");
				else if(j==2||j==4){
					if(!(i+j==9))
					System.out.print(m++);
					else System.out.print("+");
				}
			}
			System.out.println();			
		}
		
	}
}
a1$2b
c3$4d
e5$6f
g7$8h
i9$+j

---------------------------------------------------------------

class Pattern51{
	public static void main(String[] args){
		int n=5,m=1;
		char ch='a';
		for(int i=1;i<=n;i++){
			for(int j=1;j<=3;j++)
				if(j==1)
				System.out.print(ch++ +""+ m++);
				else if(j==2)
				System.out.print("$");
				else{
				if(i==5&&j==3)
				System.out.print("+" + ch++);
				else
				System.out.print(m++ +""+ ch++);
				}
			System.out.println();
			}
		}
	}
			
a1$2b
c3$4d
e5$6f
g7$8h
i9$+j		
---------------------------------------------------------------

class Pattern52{
	public static void main(String args[]){
		int n=4;
		char ch='a';
		for(int i=1;i<=4;i++){
			for(int j=1;j<=4;j++){
				if(i==j || i+j==5)
				System.out.print(ch++);
				else
				System.out.print(" ");
			}
			System.out.println();
			
		}
	}
}

a  b
 cd
 ef
g  h

---------------------------------------------------------------

class Pattern53{
	public static void main(String args[]){
		int n=5;
		int sp=4;
		int st=1;
		for(int i=1;i<=n;i++){
			for(int j=1;j<=st;j++){
				if(i%2==0)
				System.out.print("@");
				else
				System.out.print("*");
				}
			for(int j=1;j<=sp;j++)	
				System.out.print(" ");
			for(int j=1;j<=st;j++){
				if(i%2==0)
				System.out.print("@");
				else
				System.out.print("*");
				}
			System.out.println();
			sp--;
			st++;
			
		}
	}
}

*    *
@@   @@
***  ***
@@@@ @@@@
**********
---------------------------------------------------------------
*/
class Pattern54{
	public static void main(String args[]){
		int n=5;
		int sp=4;
		int st=1;
		for(int i=1;i<=n;i++){
			for(int j=1;j<=st;j++){
				if((i==3&&j==2)||i==4 && (j==2||j==3))
				System.out.print("@");
				else
				System.out.print("*");
				}
			for(int j=1;j<=sp;j++)	
				System.out.print(" ");
			for(int j=n;j>=st;j--){
				if((i==2&&(j==4 || j==3))||(i==3&&j==4))
				System.out.print("$");
				else
				System.out.print("*");
				}
			System.out.println();
			sp--;
			st++;
			
		}
	}
}
*    *****
**   *$$*
*@*  *$*
*@@* **
******
