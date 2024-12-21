package structural.flyweight.robot.impl;

import structural.flyweight.robot.Irobot;

public class DogRobot implements Irobot {
    private String type;

    public DogRobot(String type, String body) {
        this.type = type;
        this.body = body;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    private String body;

    @Override
    public void display(int x, int y) {

    }
}
