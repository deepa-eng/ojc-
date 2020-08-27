/* 			 Write a program to print following pattern:-
Input : 5
Output
				*
	           **
	          ***
	         ****
	        *****
*/

import java.util.*;
import java.lang.*;

class star_pattern{
	public static void main(String args[]){
		int i,j,k,n;
		Scanner sc = new Scanner(System.in);
		n=sc.nextInt();
		for(i=1;i<=n;i++){
			for(j=1;j<=(n-i) ;j++)
			{ 
				System.out.printf(" ");
			}
			for(k=1; k<=i;k++)
				{ System.out.printf("*"); }
			System.out.printf("\n");
		}
	}
}