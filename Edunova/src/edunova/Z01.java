package edunova;

import javax.swing.JOptionPane;

public class Z01 {
	
	public static void main(String[] args) {
		
		double a = Double.parseDouble(
				JOptionPane.showInputDialog("Unesi prvi decimalni broj"));
		
		double b = Double.parseDouble(
				JOptionPane.showInputDialog("Unesi drugi decimalni broj"));
		
		double c = Double.parseDouble(
				JOptionPane.showInputDialog("Unesi treći decimalni broj"));
		
		double d=(a*b)-c;
		
		System.out.println(d);
	}
}