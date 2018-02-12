// Ternary operator

public class TernaryTest {

		public static void main(String ar[]){
			int billAmount = Integer.parseInt(ar[0]);
			int discount = (billAmount > 1000) ? 10 : 5;

		System.out.println("Your bill amount is :" + billAmount + " , and discount is : " + discount );
	}

}