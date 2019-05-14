package intro_to_array_lists;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class GuestBook implements ActionListener, MouseListener {
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JButton button = new JButton();
	JButton button2 = new JButton();
	ArrayList<String> names = new ArrayList<String>();

	public static void main(String[] args) {
		GuestBook r = new GuestBook();
		r.runner();

	}

	// Create a GUI with two buttons. One button reads "Add Name" and the other
	// button reads "View Names".
	void runner() {
		JFrame frame = new JFrame();
		JPanel panel = new JPanel();
 button = new JButton();
		button2 = new JButton();
		frame.add(panel);
		panel.add(button);
		panel.add(button2);

		frame.setVisible(true);
		button.setText("Add Name");
		button2.setText("View Names");
		button.addActionListener(this);
		button.addMouseListener(this);
		button2.addMouseListener(this);
		frame.pack();
	}

	// When the add name button is clicked, display an input dialog that asks the
	// user to enter a name. Add
	// that name to an ArrayList. When the "View Names" button is clicked, display a
	// message dialog that displays
	// all the names added to the list. Format the list as follows:
	// Guest #1: Bob Banders
	// Guest #2: Sandy Summers
	// Guest #3: Greg Ganders
	// Guest #4: Donny Doners
	@Override
	public void actionPerformed(ActionEvent e) {

	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
	
		if (e.getSource() == button) {
System.out.println("Button pressed");
			names.add(JOptionPane.showInputDialog("Enter a name"));

		}
		if (e.getSource() == button2) {
			System.out.println("button pressed pt 2");
			String output = "";
			for (int i = 0; i < names.size(); i++) {
				output += "Guest # " + i + ":" + names.get(i) + "\n";
				// System.out.println("Guest #" + i + ":" + names.get(i));

			}
			JOptionPane.showMessageDialog(null, output);

		}
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub

	}
}
