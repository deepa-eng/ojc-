/*					Write a program to print following pattern
Input : 4
Output: 1
 22
 333
 4444
*/

import java.util.*;
import java.lang.*;

class pattern{
	public static void main(String args[]){
		int i,j,n;
		Scanner sc = new Scanner(System.in);
		n=sc.nextInt();
		for(i=1;i<=n;i++){
			for(j=1;j<=i;j++)
			{ 
				System.out.printf("%d",i);
			}
			System.out.printf("\n");
		}
	}
}