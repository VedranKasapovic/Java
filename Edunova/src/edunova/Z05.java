package edunova;

import javax.swing.JOptionPane;

public class Z05 {

	public static void main(String[] args) {
		// Za dva unesena cijela broja
		// program ispisuje Osijek
		// ako je zbroj veći od 10
		// inače ispisuje Edunova

		int i = Integer.parseInt(JOptionPane.showInputDialog("Upiši prvi broj"));
		int j = Integer.parseInt(JOptionPane.showInputDialog("Upiši drugi broj"));
		int z = i + j;

		if (z > 10) {
			System.out.println("Osijek");
		} else {
			System.out.println("Edunova");
		}
	}
}
