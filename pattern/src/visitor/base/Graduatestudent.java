package visitor.base;

/**
 * Created by jinxd on 2016/6/1.
 */
public class Graduatestudent extends Student {
    double math,english,physics;
    String name;

    public Graduatestudent(double math, double english, double physics, String name) {
        this.math = math;
        this.english = english;
        this.physics = physics;
        this.name = name;
    }

    public double getMath() {
        return math;
    }

    public double getEnglish() {
        return english;
    }

    public double getPhysics() {
        return physics;
    }

    public String getName() {
        return name;
    }

    public void accept(Visitor v){
        v.visit(this);
    }
}
