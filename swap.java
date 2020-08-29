/*    DAY 6
7.  Java Program to swap two string variables without using third or temp variable.
String s1 = "abc";
String s2 = "def"
Output : s1 should have value "def" means of s2 and S2 should have value of s1 means "abc"

*/



import java.util.*;
import java.lang.*;
public class swap{
	public static void main (String []args){
		Scanner sc = new Scanner(System.in);
		String str1 = sc.next();
		String str2 = sc.next();
		str1 = str1+str2;
		str2 = str1.substring(0,(str1.length() - str2.length()));
		str1 = str1.substring(str1.length()-str2.length());
		System.out.println("String1: "+str1 + "\nString2: " + str2);
		}
	}