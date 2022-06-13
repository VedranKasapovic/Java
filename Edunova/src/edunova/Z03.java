package edunova;

import javax.swing.JOptionPane;

public class Z03 {
	public static void main(String[] args) {

		// Za unesena dva cijela broja
		// ispišite rezutat djeljenja

		int a = Integer.parseInt(JOptionPane.showInputDialog("Unesi prvi broj"));
		int b = Integer.parseInt(JOptionPane.showInputDialog("Unesi drugi broj"));
		double c;
		c = (double) a / b;
		System.out.println(c);

	}

}
