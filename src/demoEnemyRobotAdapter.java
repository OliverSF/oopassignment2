
public class demoEnemyRobotAdapter implements demoEnemyAttacker {
	
	//creating enemyrobot object - composition
	demoEnemyRobot theRobot;
	
	//constructor
	public demoEnemyRobotAdapter(demoEnemyRobot newRobot){
		
		theRobot = newRobot;
	}
	@Override
	public void fireWeapon() {
		
		theRobot.smashWithHands();
		
	}

	@Override
	public void driveForward() {
		
		theRobot.walkForward();
		
	}

	@Override
	public void assignDriver(String driverName) {
		
		theRobot.reactToHuman(driverName);
		
	}

}
