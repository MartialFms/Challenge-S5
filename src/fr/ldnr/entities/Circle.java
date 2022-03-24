package fr.ldnr.entities;

public class Circle extends Shape {
    private double radius;
    
    public Circle(double radius, int x, int y) {
    super (x,y);
    setRadius(radius);
    }
    
    public Circle(double radius, Point point) {
    	super(point);
    	setRadius(radius);
    }

	public Circle() {
		super(1,1);
		setRadius(1);
	}

	public double area( ) {
		return Math.PI * this.radius * this.radius;
	}
	
	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		if (radius<0) radius = 1;
		else
		this.radius = radius;
	}
	public String toString () {
		return "Circle : radius = " + radius + " " + super.toString();
	}
}

