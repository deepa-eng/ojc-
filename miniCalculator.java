
/*    MINI CALCULATOR           */


static int[] getUserInput(String operation, Scanner sc) {
		System.out.println("Enter two numbers for "+operation+" : ");
        int a=sc.nextInt();
        int b=sc.nextInt();
        return int[]{a,b};
	}
	static long add(int x, int y) {
		return x+y;
	}
	static int subtract(int x, int y) {
		return x-y;
	}
	static long multiply(int x, int y) {
		return x*y;
	}
	static int divide(int x, int y) {
		return x/y;
	}

class Cal{

public static void miniCalculator() {
		Scanner sc=new Scanner(System.in);
		while(true) {
			System.out.println("Welcome to Mini Calculator.");
            System.out.println("Press \t 1 : Add \n\t 2 : Subtract \n\t 3 : Multiply \n\t 4 : Divide");
            int choice=sc.nextInt();
            switch(choice) {
	            case 1 :
	            	int[] userInput = getUserInput("Addition", sc);
	            	long sum = add(userInput[0], userInput[1]);
	            	System.out.println(sum);
	            	break;
	            case 2 :
	            	userInput = getUserInput("Substraction", sc);
	            	int subtraction = subtract(userInput[0], userInput[1]);
	            	System.out.println(subtraction);
	            	break;
	            case 3 :{
	            	userInput = getUserInput("Multiplication", sc);
	            	long multi = multiply(userInput[0], userInput[1]);
	            	System.out.println(multi);
	            	break;
	            }
	            case 4 :{
	            	userInput = getUserInput("Division", sc);
	            	int divide = divide(userInput[0], userInput[1]);
	            	System.out.println(divide);
	            	break;
	            }
	            default:
	            	System.out.println("Enter proper input to proceed");
	            	System.exit(0);
            }
		}
	}
}	