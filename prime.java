//WARM UP 2
/* Find first n prime numbers ( n < 999999999)
Input : 5
Output : 2
	  3
	  5
	  7
	  11
*/


import java.util.*;

int isPrime(int number){
	if(number<=1) 
			return false;
		if(int i=2 ; i<number/2 ; i++){
			if(number%i==0){
				return false;	
				break;
			}
		}
		return true;
	  }
	  
	void findPrimeNum(int n){
		int m=3, i=0;
		if(n>0)
			System.out.println(2);
		while(i<n-1) {
			boolean isPrime = isPrime(m);
			if(isPrime){
				System.out.println(m);
				i++;
			}
			m+=2;
		}
	}	
	
class prime{
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
			int x = sc.nextInt();
			findPrimeNum(x);
	}
}