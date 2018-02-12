// Java while Loop Example
// Following is a while loop that counts down from 10, printing exactly 10 lines of "tick" :

/* Java Program Example - Java while Loop
 * Demonstrate the while Loop */

public class WhileLoop
{   
    public static void main(String args[])
    {
        
        //int n = 10;
        int n = Integer.parseInt(args[0]);
         do{
       	 //while(n>0);
            System.out.println("tick " + n);
            n--;
        //} 
       } while(n>0) ;
        
    }
}