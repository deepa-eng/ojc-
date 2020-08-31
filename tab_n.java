/* DAY 7
4. Print table of any natural positive number by recursion
*/



import java.util.*;
class tab_n{
	
 static int table(int n, int i)
 {
	if(i>10)
		return 0;
	//System.out.println("Table of:" + n);
	System.out.println(n+ "*" + i +"=" + n*i);
	return table(n, i+1);
 }

	public static void main (String []args){
		Scanner sc = new Scanner(System.in);
		int n =	sc.nextInt();
		System.out.println(table(n,1));
	}
}