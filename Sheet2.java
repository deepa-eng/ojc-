public class Sheet2 {

	/******* 1.) N Prime Number **********/
	static void findNPrimeNum(int n) {
		int i = 0, m =3;
		if(n > 0)
			System.out.println(2);
		while(i < n-1) {
			boolean isPrime = isPrime(m);
			if(isPrime) {
				System.out.println(m);
				i++;
			}
			m +=2;
		}
	}
	
	static boolean isPrime(int number) {
        if (number <= 1) return false;    
        
        for (int i = 2; i < number/2; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

	public static void findTable(int x) {
		for(int i=1; i<=10; i++) {
			System.out.printf("%d * %d = %d\n",x,i,x*i);
		}
	}
}