// Find all the spy numbers from m to n by creating a method to check the given number is spy or not with return type booolean.

class Methods{
	public static Boolean spynum(int n){
		int s=0;
		int p=1;
		while(n!=0){
		int rem=n%10;
		s+=rem;
		p*=rem;
		n/=10;
		}
	if(s==p)
	   return true;
	else
	   return false;
	}


public static void main(String args[]) {
	int m=1;
	int n=100;
	for(int i=m;i<=n;i++){
		if(spynum(i))
			System.out.println(i+ " --> is a spy number");	
		}
	}
}
