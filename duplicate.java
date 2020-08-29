/* DAY 6
5.   Java program to find the duplicate words in a string

*/

import java.util.*;
public class duplicate{
	public static void main (String []args){
		int i,j,count;
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		str = str.toLowerCase();
		String str1[]= str.split(" ");
		
		for(i=0;i<str1.length;i++){
			  count=1;
			for(j=i+1;j< str1.length;j++){
				if(str1[i].equals(str1[j]))
				{
					count++;
					str1[j]="0";
				}
			}
			if(count>1 && str1[i] != "0")
				System.out.println("Duplicate word: " + str1[i]);
				
		}
	}
}	