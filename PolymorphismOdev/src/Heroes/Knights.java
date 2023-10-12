package Heroes;

import game.CombatType;
import game.Mixed;
import game.NewCharacter;


public class Knights extends NewCharacter implements Mixed {

	

	public Knights(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void combatType() {
		System.out.println("Kılıç Kullanır");
		
	}

	@Override
	public void rage() {
		System.out.println("Rage Bar Limit 200");
		
	}

	@Override
	public void mana() {
		System.out.println("Mana Limit 100");
		
	}

}
