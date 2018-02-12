/* Create a StringBuilder with "I am Studying Java"
 * Print first 3 characters
 * print last 3 characters 
 * Extract Studying and print
 */

/**
 * 
 * @author User
 *
 */
   public class StringRegular {
	   public static void main(String[]args) {
	   StringBuilder sb = new StringBuilder(args[0]);
	    String constant = "Studying";
	    System.out.println("Given String:" + sb);
	    System.out.println("First three:" + sb.substring(0,3));
	    System.out.println("Last three:" + sb.substring((sb.length()-3)));
	    int startOfConstant = sb.indexOf(constant);
	    int endOfConstant = startOfConstant + constant.length();
	    System.out.println("Print Studying:" + sb.substring(startOfConstant,endOfConstant));
	    
	    //Insert <space your name> after "am"
	    sb.insert((sb.indexOf("am")+2), " ama");
	    System.out.println("After Insert:" +sb);
	    sb.delete(sb.indexOf("am"),sb.indexOf("am")+2);
	    System.out.println("After Delete:" +sb);
	    System.out.println("Reverse:" +sb.reverse());
	    
	    
	    StringBuilder sb2 = new StringBuilder(args[0]);
	    System.out.println(sb == sb2);
	    StringBuilder sb3 =(sb.insert((sb.indexOf("am")+2), "ama"));
	    System.out.println(sb == sb3);
	    sb = null;
	    sb2 = null;
	    sb3 = null;
	    
	    System.out.println("sb:" + sb);
	    System.out.println("sb3:" + sb3);
	   }
}
