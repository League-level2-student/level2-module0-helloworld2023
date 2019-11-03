package arrays;

import java.util.Random;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class _01_RobotRace {
	//1. make a main method
public static void main(String[] args) {
	//2. create an array of 5 robots.
Robot[] robots = new Robot[5];
	//3. use a for loop to initialize the robots.
for(int r=0;r<5;r++) {
	robots[r] = new Robot();
	robots[r].setSpeed(10);
}
	//4. make each robot start at the bottom of the screen, side by side, facing up
Robot.setWindowSize(500, 500);
int a = 0;
for(int s=0;s<robots.length;s++) {
	robots[s].moveTo(a+=80, 500);
}
	//5. use another for loop to iterate through the array and make each robot move 
	//   a random amount less than 50.
Random r = new Random();
for(Robot robot: robots) {
	robot.move(r.nextInt(50));
}
	//6. use a while loop to repeat step 5 until a robot has reached the top of the screen.
boolean finished = false;
int w = 0;
while(!finished) {
	for(int f = 0; f<5; f++) {
		robots[f].move(new Random().nextInt(51));
		if(robots[f].getY()==0) {
			finished = true;
			w = f;
			break;
		}
	}
}
	//7. declare that robot the winner and throw it a party!
if(finished) {
	JOptionPane.showMessageDialog(null, "Robot " + w + " is the winner!");
}
	//8. try different races with different amounts of robots.

	//9. make the robots race around a circular track.
	}
}
