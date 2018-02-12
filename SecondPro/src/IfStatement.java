class IfStatement {
    public static void main(String args[]) {

    	//int number = 10;
    	int number = Integer.parseInt(args[0]);

    	if (number > 0) {
    		int var = 0 ;
    		System.out.println("Number "+ number + " is positive.");


    	} else {
    		int var = 0 ;
    	 System.out.println("Number "+ number + " is ZEERO or Negative.");
    	}
    	System.out.println("This statement "+ number + " is always executed.");
    }
}