package model;


public class Execution {
	public static void main(String[] args) {
	Dog dog1 = new Dog();
	Dog rufus = new Dog("rufus");
	Musician generic = new Musician();
	Musician carlos = new BassPlayer();
	Musician diego = new PianoPlayer();
	
	generic.plays();
	carlos.plays();
	diego.plays();
	
	
	
	}
}
