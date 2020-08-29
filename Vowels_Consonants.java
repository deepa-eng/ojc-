/*			DAY 6
1.	Java Program to count the total number of vowels and consonants in a string
*/

import java.util.*;

public class Vowels_Consonants{
	public static void main (String []args){
		int i,c_vol=0,c_const=0;
		
		Scanner sc = new Scanner(System.in);
		
		String str= sc.nextLine();
		System.out.println(str);
		str = str.toLowerCase();
		
		for(i=0; i<str.length();i++){
			char ch = str.charAt(i);
			if(ch=='a' || ch =='e' || ch =='i' || ch =='o' || ch =='u')
			{		c_vol++;    }
			else if(ch>= 'a' && ch<='z')
			{	c_const++;	}
		}
	System.out.println("Vowels: " + c_vol + "\tConsonants: " + c_const );
	}
}