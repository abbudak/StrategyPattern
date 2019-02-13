
public abstract class Fighter {

	FightBehavior fightBehavior;
	
	public Fighter() {}
	
	public void doFight() {
		fightBehavior.fight();
	}
	
	public void setFightBehavior(FightBehavior fb) {
		fightBehavior = fb;
	}
	
	public abstract void display();
}
