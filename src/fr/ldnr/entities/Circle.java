package fr.ldnr.entities;

public class Circle {
    private int x;
    private int y;
    private double radius;
    
    public Circle(double radius, int x, int y) {
    setRadius(radius);
    setX(x);
    setY(y);
}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}
	
}
