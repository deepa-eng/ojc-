/* DAY 7
1. Program to find factorial of n using recursion
2. Program for length of a string using recursion
*/

import java.util.*;
public class factorial{
	
 static long fact(long n){
	if(n<=0)
		return 1;  
	else	
		return (n*fact(n-1));
}



	public static void main (String []args){
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
				 
		System.out.println("factorial of " + num + ": " + fact(num));
	}
}