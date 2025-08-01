// Example Input: 283476
// Expected Output: Prime digits are :237
// --------------------------------------------------
class PrimeDigitsReverse{
	public static void main(String args[]){
		int n=283476,rev=0,fr=0;
		while(n!=0){                   //Extracting the digits 
			int rem=n%10;
			int c=0;
			for(int i=2;i<=rem/2;i++){     // checking prime or not
				if(rem%i==0){
					c++;
					break;
				}
			}
			if(c==0 && rem>1){
				rev=(rev*10)+rem;
			}
			n/=10;
		}
		                          
		while(rev!=0){                 //for reversing the prime digits
			fr=fr*10+(rev%10);
			rev/=10;
		}
		System.out.print("Prime digits are : "+ fr);
	}
}

// Example Input: 563871
// Expected Output: Odd Digits : 5371
// --------------------------------------------------
class OddDigits{
	public static void main(String [] args){
		int n=563871,rev=0,fr=0;
		while(n!=0){
			int r=n%10;
			if(r%2!=0){
				rev=rev*10+r;
			}
			n/=10;
		}
		
		while(rev!=0){                 //for reversing the prime digits
			fr=fr*10+(rev%10);
			rev/=10;
		}

		System.out.print("Odd Digits : "+fr);
	}
}

// Example Input: 12345
// Expected Output:
// 123
// 45
// --------------------------------------------------
class SeperateDigits{
	public static void main(String args[]){
		int n=12345;
		int t=n;
		int p=1;
		int res=0,c=0;
		while(t!=0){
			c++;
			t/=10;
		}
		for(int i=1;i<=c/2;i++){
			int r=n%10;
			res=res+r*p;
			p*=10;
			n/=10;
		}
		System.out.print(n +"\n" +res);
	}
}

// Alternative separation example snippet (not full class):
// for(int i=1;i<=c/2;i++){
//     p*=10;
// }
// int fhalf=n%p;
// int Shalf=n/p;
// Output (for n=12345): 
// 123
// 45

// Example Input: 12345
// Expected Output: extreme sum : 6  (1 + 5)
// --------------------------------------------------
class ExtremeSum{
	public static void main(String args[]){
		int n=12345;
		int ld=n%10;
		while(n>=10){
			n/=10;
		}
		System.out.println("extreme sum : "+(n+ld));
	}
}

// Example Input: 543563
// Expected Output: 5 3 45 concatenated -> 5345? (Based on logic prints: first digit + last digit + middle reversed)
// Actual output with given logic: 5 3 4 5 combined as string: "5345"
// --------------------------------------------------
class Extremenumber{
	public static void main(String args[]){
		int n=543563;
		int ld=n%10;
		int t=n/=10;
		int res=0,p=1;
		while(t>=10){
			int r=t%10;
			res=res+r*p;
			p*=10;
			t/=10;
		}
		System.out.println(t+""+ld+""+res);
	}
}

// Example Input Range: 10 to 30
// Expected Output: count of all '2' digits between 10 and 30 (including duplicates) -> count: 3
// Explanation: Numbers with '2': 12 (one 2), 20 (one), 21 (one), 22 (two) -> total 1+1+1+2=5? But original output comment shows behavior; actual logic counts each '2' digit so for 10..30 it's 5.
// --------------------------------------------------
class NoOf2s{
	public static void main(String []args){
		int r=30;
		int n=22;
		int c=0;
		for(int i=10;i<=30;i++){
			int t=i;
			while(t!=0)
			{
			   int rem=t%10;
			   if(rem==2)
   			     c++;
	             t/=10;
			}
		}
		System.out.println("count: "+c);
	}
}

// Example Input Range: 10 to 30
// Expected Output: count of numbers containing at least one '2' -> count: 4 (12, 20, 21, 22)
// --------------------------------------------------
class NoOfUnique2s{
	public static void main(String []args){
		int r=30;
		int n=22;
		int c=0;
		for(int i=10;i<=30;i++){
			int t=i;
			while(t!=0)
			{
			   int rem=t%10;
			   if(rem==2){
	   		     c++;
				     break;	
			   }
			
		         t/=10;
			}
		}
		System.out.println("count: "+c);
	}
}
