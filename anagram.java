/*      DAY 6
8. Java Program to determine whether two strings are the anagram
If two words have same character example : "brag" and "grab" so these are anagram 
Here order of character doesn't  matter. One more example : "abcde" , "cdeab"
*/ 

import java.util.*;
public class anagram{
	public static void main (String []args){
		boolean b=true;
		Scanner sc = new Scanner(System.in);
		
		String str1= sc.nextLine();
		String str2= sc.nextLine();
		
		str1=str1.toLowerCase();
		str2=str2.toLowerCase();
		
		char[] ch1 = str1.toCharArray(); 
		char[] ch2= str2.toCharArray();
		if(str1.length()!= str2.length()){
			b=false;
			}
			
		else{
			for(int i=0;i<str1.length();i++){
				for(int j=0;j<str2.length();j++){
					if(ch1[i]!= ch2[j])
						b=false;
				}
				b=true;
			}
		}
		if(b)
			System.out.print("Anagram\n");
		else
			System.out.print("Not Anagram\n");
	}
}