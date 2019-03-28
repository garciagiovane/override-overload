package model;

import javax.swing.JOptionPane;

public class Dog {
	
	Dog(){
		JOptionPane.showMessageDialog(null, "You've casted a dog.", "Resultado", JOptionPane.INFORMATION_MESSAGE );
		
	}
	
	Dog(String name){
		JOptionPane.showMessageDialog(null, "You've casted "+name+", the nicest dog on earth.", "Resultado", JOptionPane.INFORMATION_MESSAGE );
		
	}
}
