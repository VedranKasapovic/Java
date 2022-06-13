package edunova;

import javax.swing.JOptionPane;

public class Z06 {

	public static void main(String[] args) {
		// Za upisani cjeli broj
		// program ispisuje da li je
		// parni broj ili ne

		int i = Integer.parseInt(JOptionPane.showInputDialog("Upiši broj"));
		if (i % 2 == 1) {
			System.out.println("Neparni");
		} else {
			System.out.println("Parni");
		}

	}
}
