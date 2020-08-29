/*     DAY 6
4. Java Program to determine whether one string is a rotation of another.
*/

public class rot{
	public static void main (String []args){
		//Scanner sc = new Scanner(System.in);
		String str1= "abcd";
		String str2= "cdab";
		String str3=str1+str1;
		if(str1.length() != str2.length())
			System.out.println(str1 + " is not rotation of " + str2);
		if(str3.contains(str2))	
			System.out.println(str1 + " is rotation of " + str2);
		else
			System.out.println(str1 + " is not rotation of " + str2);
	}
}