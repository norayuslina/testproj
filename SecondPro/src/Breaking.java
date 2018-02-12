public class Breaking {

   public static void main(String args[]) {
      int [] numbers = {10, 20, 30, 40, 50};

      for(int x : numbers ) {
         if( x == Integer.parseInt(args[0]) ) {
            break;
         }
         System.out.print( x );
         System.out.print("\n");
      }
   }
}