public class Circle{
    private double radius;
    public Circle() {
        this(10.0);
    }
    public Circle(double radius) {
        this.radius = radius;
    }
    public double getRadius() {
        return radius;
    }
    public void setRadius(double radius) {
        this.radius = radius;
    }
    public static void main(String[] args) {
        Circle circle1 = new Circle();
        Circle circle2 = new Circle(20.0);
        
        System.out.println("Circle 1: Radius = " + circle1.getRadius());
        System.out.println("Circle 2: Radius = " + circle2.getRadius());
		
		circle2.setRadius(30.0);
	    System.out.println("Circle 2: Radius = " + circle2.getRadius());

    }
}