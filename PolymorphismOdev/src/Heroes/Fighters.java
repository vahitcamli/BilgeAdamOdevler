package Heroes;

import game.CombatType;
import game.Melee;
import game.NewCharacter;

public class Fighters extends NewCharacter implements Melee {

	

	public Fighters(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void combatType() {
		System.out.println("Yumruklarla Dövüş");
		
	}

	@Override
	public void rage() {
		System.out.println("Rage Bar Limit 100");
		
	}

	
}
