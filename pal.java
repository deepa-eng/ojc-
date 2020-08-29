/*			DAY 6
3.	Java Program to determine whether a given string is palindrome
	A string is said to be palindrome if it is the same from both the ends. For e.g. KAYAK

*/

import java.util.*;

public class pal{
	public static void main (String []args){
		int i,j;
		String reverse="";
		Scanner sc = new Scanner(System.in);
		String str= sc.nextLine();
		j=str.length()-1;
		for(i=j;i>=0;i--)
			reverse= reverse+ str.charAt(i);
		if(str.equals(reverse))
			  System.out.println(str + " is palindrome");
		else
			  System.out.println(str + " is not palindrome");
	}


}