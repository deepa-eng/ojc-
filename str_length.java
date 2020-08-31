/* DAY 7
2. Program for length of a string using recursion
*/


import java.util.*;
public class str_length{

static int len(String str){
	if(str.equals(""))
		return 0;
	return len(str.substring(1))+1;
}

public static void main (String []args){
	
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		System.out.println(len(str));
	}
}