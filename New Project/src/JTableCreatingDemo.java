import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;


public class JTableCreatingDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame frame = new JFrame();
	    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	    Object rowData[][] = { { "Salma", 20, "IT" },
	        { "Hael", 22, "Math" } ,{ "Manaf",23,"History" },{ "Johny", 26,"EngineeringSkill"}};
	    Object columnNames[] = { "Name", "Age", "Course" };
	    JTable table = new JTable(rowData, columnNames);

	    JScrollPane scrollPane = new JScrollPane(table);
	    frame.add(scrollPane, BorderLayout.CENTER);
	    frame.setSize(300, 150);
	    frame.setVisible(true);

	}

}
