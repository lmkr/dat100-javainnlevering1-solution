package no.hvl.dat100;

import javax.swing.JOptionPane;

public class OppgaveO3 {

	public static void main(String[] args) {
		
		int n = Integer.parseInt(JOptionPane.showInputDialog("n:")); 

		int fak = 1;
		
		for (int i=2; i<=n;i++) {
			
			fak = fak * i;

		}
		
		System.out.println("n! = " + fak);
	}

}
