
public class FightSimulator {

	public static void main(String[] args) {

		Fighter fighter1 = new Goro();
		
		fighter1.display();
		fighter1.doFight();
		fighter1.setFightBehavior(new FightWithTwoHands());
		fighter1.doFight();

	}

}
