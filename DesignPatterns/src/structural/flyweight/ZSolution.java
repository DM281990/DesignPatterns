package structural.flyweight;

import structural.flyweight.robot.Irobot;

public class ZSolution {
    public static void main(String[] args) {
        Irobot humanoidRobo = RobotFactory.createRobot("HUMANOID");
        humanoidRobo.display(2,3);
        Irobot dogRobo = RobotFactory.createRobot("DOG");
        dogRobo.display(5,10);

        }
}
