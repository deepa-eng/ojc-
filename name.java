class name
{ 
    public static void main(String[] args) 
    { 
        String input = "sonu sood" ; 
  
        StringBuilder input1 = new StringBuilder(); 
		
        // append a string into StringBuilder input1 
        input1.append(input);
         input1 = input1.reverse(); 
        System.out.println(input1); 
    } 
} 