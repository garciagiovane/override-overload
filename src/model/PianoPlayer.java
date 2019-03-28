package model;

import javax.swing.JOptionPane;

public class PianoPlayer extends Musician {

	public void plays() {
		JOptionPane.showMessageDialog(null, "This one plays piano.", "Resultado", JOptionPane.INFORMATION_MESSAGE);
	}
}
