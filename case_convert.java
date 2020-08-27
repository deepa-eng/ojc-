//Day-4 (23 Aug 2020)
/*Write a program to convert any uppercase char to its lowercase and vice versa 
Input : B
Output : b

Input : d
output : D
*/

import java.util.*;
import java.lang.*;

public class case_convert{
	
	public static void main (String args[]) {
		char ch3,ch4;
		Scanner sc = new Scanner(System.in);
		char ch = sc.next().charAt(0);
		
		if(ch>=65 && ch<=90 ) 
			System.out.println( "\n"+Character.toLowerCase(ch) + "\n" );  
      	
       else if( ch >= 97 && ch<=120)
			System.out.println( Character.toUpperCase(ch) + "\n" );  	
		
	}
}