package game;

public interface Mixed extends CombatType, Ranged , Melee{
	
	@Override
	public void combatType();
	
	@Override
	public void rage();
	
	@Override
	public void mana();
	
}
