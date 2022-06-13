package edunova;

import javax.swing.JOptionPane;

public class Z02 {
	public static void main(String[] args) {

		// Za uneseni dvoznamenkasti broj
		// ispišite jediničnu vrijednost

		int i = Integer.parseInt(JOptionPane.showInputDialog("Unesi dvoznamenkasti broj"));
		System.out.println(i % 10);
		System.out.println(i / 10);
	}

}
