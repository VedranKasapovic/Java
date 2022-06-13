package edunova;

import javax.swing.JOptionPane;

public class Z01 {
	public static void main(String[] args) {
		double a = Double.parseDouble(JOptionPane.showInputDialog("Upiši prvi decimalni broj"));
		double b = Double.parseDouble(JOptionPane.showInputDialog("Upiši drugi decimalni broj"));
		double c = Double.parseDouble(JOptionPane.showInputDialog("Upiši treći decimalni broj"));

		double d = (a * c) - b;
		System.out.println(d);

	}

}
