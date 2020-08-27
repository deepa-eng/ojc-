/*	Write a program to print the length of this String text.
*/

public class Length{  
public static void main(String args[]){ 
	String text = "I am an engineering student. I like to play table tennis. But i love badminton. I am good at solving problems.";

		System.out.println("string length is: "+ text.length());
	
	int count=0;
	String[] strArray = text.split(" ");
		for(int i=0; i<strArray.length; i++) {
			count++;
			System.out.println(strArray[i]);
		}
		System.out.println("total words:"+ count);
	}
}