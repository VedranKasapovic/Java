package edunova;

import javax.swing.JOptionPane;

public class Z07 {

	public static void main(String[] args) {

		// Za unesena dva cjela broj
		// program ispisuje najveći

		int a = Integer.parseInt(JOptionPane.showInputDialog("Unesi prvi broj"));
		int b = Integer.parseInt(JOptionPane.showInputDialog("Unesi drugi broj"));

		if (a >= b) {
			System.out.println(a);
		} else {
			System.out.println(b);

		}
	}
}
