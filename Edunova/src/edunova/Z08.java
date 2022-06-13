package edunova;

import javax.swing.JOptionPane;

public class Z08 {

	public static void main(String[] args) {

		// Za upisana 3 cijela broja
		// program ispisuje najveći

		int a = Integer.parseInt(JOptionPane.showInputDialog("Upiši prvi broj"));
		int b = Integer.parseInt(JOptionPane.showInputDialog("Upiši drugi broj"));
		int c = Integer.parseInt(JOptionPane.showInputDialog("Upiši treći broj"));

		if (a >= b && a >= c) {
			System.out.println(a);
		} else if (b >= c) {
			System.out.println(b);
		} else {
			System.out.println(c);
		}

	}
}
