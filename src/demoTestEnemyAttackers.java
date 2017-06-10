
public class demoTestEnemyAttackers {

	public static void main(String[] args) {

		demoEnemyTank rx7 = new demoEnemyTank();
		
		demoEnemyRobot fred = new demoEnemyRobot();
		
		demoEnemyAttacker robotAdapter = new demoEnemyRobotAdapter(fred);
		
		System.out.println("The Robot");
		
		fred.reactToHuman("Paul");
		fred.walkForward();
		fred.smashWithHands();
		
		System.out.println("The Enemy Tank");
		
		rx7.assignDriver("Frank");
		rx7.driveForward();
		rx7.fireWeapon();
		
		System.out.println("The Robot with Adapter");
		
		robotAdapter.assignDriver("Mark");
		robotAdapter.driveForward();
		robotAdapter.fireWeapon();
		
	}

}
