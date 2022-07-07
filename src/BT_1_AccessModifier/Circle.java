package BT_1_AccessModifier;

public class Circle {
    private double radius = 1.0;
    private String color = "red";

    public Circle() {
    }

    protected Circle(double radius) {
        this.radius = radius;
    }

    private double getRadius() {
        return radius;
    }

    private String getColor(){
        return color;
    }
}
