/*			TABLE OF N		*/

import java.util.*;
import java.lang.*;
public class table{
		public static void main(String args[]){
			Scanner sc = new Scanner(System.in);
			 int n = sc.nextInt();
			 int t;
			for(int i=1; i<=10 ; i++)
			{  t = n*i;
			System.out.printf("Table of %d * %d = %d \n",n,i,t);}
		}
}