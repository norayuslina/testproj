import java.util.ArrayList;

/**
 * 
 */

/**
 * @author User
 *
 */
public class TestArrayList {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> al = new ArrayList<>();
		
		for (String str:args) {
			al.add(str);
			
		}
		System.out.println("Array list is empty:" + al.isEmpty());
		System.out.println("Array list Size is:" + al.size());
		
		System.out.println("Original :" + al);
		al.remove("two");
		System.out.println("Now:" + al);
		al.set(1, "New");
		System.out.println("Now:" + al);
		
		Object ar[] = al.toArray();
		System.out.println(al);
		
		
		
		
	}

}
