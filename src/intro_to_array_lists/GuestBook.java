package intro_to_array_lists;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class GuestBook {
	public static void main(String[] args) {
		
	}
	// Create a GUI with two buttons. One button reads "Add Name" and the other button reads "View Names". 
	void runner(){
		JFrame frame = new JFrame();
		JPanel panel= new JPanel();
		JButton button=new JButton();
		frame.add(panel);
		panel.add(button);
		frame.pack();
		frame.setVisible(true);
	button.setText("Add Name");
	button.setText("View Names");
	}
	// When the add name button is clicked, display an input dialog that asks the user to enter a name. Add
	// that name to an ArrayList. When the "View Names" button is clicked, display a message dialog that displays
	// all the names added to the list. Format the list as follows:
	// Guest #1: Bob Banders
	// Guest #2: Sandy Summers
	// Guest #3: Greg Ganders
	// Guest #4: Donny Doners
}
