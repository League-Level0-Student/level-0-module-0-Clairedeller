import org.jointheleague.graphical.robot.Robot;

public class RobotGraffiti {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	 	Robot robot1 =	new Robot();
	 	
	 	 robot1.setPenWidth(10);
	    	robot1.setPenColor(255, 187, 218);
	    robot1.penDown();
	    robot1.setSpeed(10000000);
	    robot1.turn(260);
	    for(int i=0;i<200; i++) {
	    	robot1.turn(1);
	    	robot1.move(1);
	    	
	    }
	    robot1.penUp();
    	robot1.turn(-20);
    	robot1.move(50);
    	robot1.penDown();
    	robot1.turn(95);
    	robot1.move(150);
    	robot1.turn(85);
    	robot1.penUp();
    	
	}

	private static void setPenWidth(int i) {
		// TODO Auto-generated method stub
		
	}

}
