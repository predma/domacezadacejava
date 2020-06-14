package edunova;

import javax.swing.JOptionPane;

public class TablicaMnozenja {

	public static void main(String[] args) {
		int broj1=Integer.parseInt(JOptionPane.showInputDialog("UNesi broj1"));
		int broj2=Integer.parseInt(JOptionPane.showInputDialog("Unesi drugi broj"));
		
		for(int i=1; i<=broj1; i++) {
			
			for(int j=1; j<=broj2; j++) {
				System.out.print(i*j + "\t");
			}
			
			System.out.println();
		}
	}

}
