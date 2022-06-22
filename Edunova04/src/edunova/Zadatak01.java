package edunova;

import javax.swing.JOptionPane;

public class Zadatak01 {
	public static void main(String[] args) {

		// Deklarirajte niz od 4 cijela broja,
		// u niz učitajte vrijednosti od korisnika
		// ispišite sumu svih upisanih vrijednosti

		int[] broj;
		broj = new int[4];
		for (int i = 0; i < 4; i++) {
			 broj[i] = Integer.parseInt(JOptionPane.showInputDialog("Upiši broj"));

		}
		System.out.println((broj[0])+(broj[1])+(broj[2])+(broj[3]));

	}
}
