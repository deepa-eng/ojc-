/*  DAY 6
2. Java Program to remove all the white spaces from a string
*/

import java.util.*;

public class space{
	public static void main (String []args){
		int i;
		Scanner sc = new Scanner(System.in);
		String str= sc.nextLine();
		String str1= str.replaceAll("\\s","");
		System.out.println(str1);
	}
}