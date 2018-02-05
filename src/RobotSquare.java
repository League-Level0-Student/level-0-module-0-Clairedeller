/*
 *    Copyright (c) The League of Amazing Programmers 2013-2017
 *    Level 0
 */

import org.jointheleague.graphical.robot.Robot;

// This recipe draws a square using the Robot

public class RobotSquare {
    public static void main(String[] args) throws Exception {
 
    	// 1. Make a new RobotSquare
    
    	Robot robot =	new Robot();
   
   
        // 3. Put the robot's pen down
    robot.setPenWidth(200);
    	robot.setPenColor(255, 187, 218);
    robot.penDown();

        // 6. Make the robot move as fast as possible
robot.setSpeed(10000000);

        // 5. Do everything below here 4 times


        //         2. Move your robot 200 pixels


        //         4. Turn the robot 90 degrees to the right (90 degrees)
for(int i=0;i<360; i++) {
robot.turn(1);
robot.move(5);


    }
}
}
