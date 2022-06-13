package edunova;

import javax.swing.JOptionPane;

public class Z09 {
	public static void main(String[] args) {

		// program unosi broj između 
		// 1 i 999
		// U slučaju da je izvan tog raspona
		// ispisati grešku i prekinuti program
		// Program ispisuje 1. znamenku upisanog broja
		
		// -5 greška
		// 1067 greška
		// 456 4
		// 6 6
		// 89 8
		
		int a = Integer.parseInt(JOptionPane.showInputDialog("Upiši broj"));
		if (a<0 || a>1000) {
			System.out.println("Greška");
		}else if (a<10) {
			System.out.println(a);
		}else if (a>=10 && a<100) {
			System.out.println(a/10);
		}else if (a>=100 && a<1000) {
			System.out.println(a/100);
		}
		
	}
}
