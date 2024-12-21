package structural.flyweight;

import structural.flyweight.robot.Irobot;
import structural.flyweight.robot.impl.DogRobot;
import structural.flyweight.robot.impl.HumanoidRobot;

import java.util.HashMap;
import java.util.Map;

public class RobotFactory {
    private static Map<String, Irobot> robotCache = new HashMap<>();

    public static Irobot createRobot(String robotType){
        if(robotCache.containsKey(robotType)){
            return robotCache.get(robotType);
        }
        else{
            if(robotType.equals("HUMANOID")){
                Irobot humanoidRobot = new HumanoidRobot(robotType,"HUMAN BODY");
                robotCache.put(robotType,humanoidRobot);
                return humanoidRobot;
            }
            else if(robotType.equals("DOG")){
                Irobot dogRobot = new DogRobot(robotType,"DOG BODY");
                robotCache.put(robotType,dogRobot);
                return dogRobot;
            }
        }
        return null;
    }
}
