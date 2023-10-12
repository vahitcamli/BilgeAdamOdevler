package Heroes;

import game.CombatType;
import game.NewCharacter;
import game.Ranged;


public class Wizard extends NewCharacter implements Ranged {

	
	public Wizard(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}


	@Override
	public void combatType() {
		System.out.println("Büyü Yapar");
		
	}


	@Override
	public void mana() {
		System.out.println("mana bar limit 250");
		
	}

	
}
