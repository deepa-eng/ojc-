/* DAY 6
6. Java Program to find the largest and smallest word in a string
*/


import java.util.*;
import java.lang.*;
public class large_small{
	public static void main (String []args){
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		 String[] s= str.split(" ");
		 String shortest=s[0];
		 String largest= "";
		 
		 for(String s1:s){ 
				if(s1.length()<shortest.length()){
						shortest=s1;
					}
				else if(s1.length()>largest.length()){
						largest=s1;
					}	
				}
		System.out.println(" MINIMUM WORD: " + shortest + "\nMAXIMUM WORD: " + largest );
	}
}