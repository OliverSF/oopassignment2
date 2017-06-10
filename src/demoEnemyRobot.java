import java.util.Random;

public class demoEnemyRobot {
	
	Random generator = new Random();
	
	public void smashWithHands(){
		
		int attackDamage = generator.nextInt(10)+1;
		
		System.out.println("Enemy Robot Causes " + attackDamage + " Damage with its hands");
	}
	
	public void walkForward(){
		
		int movement = generator.nextInt(5) + 1;
		
		System.out.println("Enemy Robot Walks Forward " + movement + " Spaces");
	}
	
	public void reactToHuman(String driverName){
		
		System.out.println("Enemy Robot Tramps on " + driverName);
	}
}
