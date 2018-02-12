// for Loop
// Program to print a sentence 10 times

class ForLoop {
   public static void main(String[] loop ) {
	   //String myVar = "Nothing";
	   StringBuilder sb = new StringBuilder
      int a = Integer.parseInt(loop[0]);
      for (int i = a; i <= 10; ++i) { 
         System.out.println("Line " + i);
      }
   }
}