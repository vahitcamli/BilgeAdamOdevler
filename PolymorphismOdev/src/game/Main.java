package game;

import Heroes.Fighters;
import Heroes.Knights;
import Heroes.Wizard;

public class Main {

	public static void main(String[] args) {
		Fighters f = new Fighters("Ali");
		f.combatType();
		f.rage();
		Knights k = new Knights("Mehmet");
		k.combatType();
		k.mana();
		k.rage();
		Wizard w = new Wizard("Ayşe");
		w.combatType();
		w.mana();
	}

}
