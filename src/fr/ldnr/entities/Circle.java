package fr.ldnr.entities;

import java.awt.Graphics;

public class Circle extends Shape {
    private int radius;
    
    public Circle(int radius, int x, int y) {
    super (x,y);
    setRadius(radius);
    }
    
    public Circle(int radius, Point point) {
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
	
	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		if (radius<0) radius = 1;
		else
		this.radius = radius;
	}
	public String toString () {
		return "Circle : radius = " + radius + " " + super.toString();
	}

	
	@Override
	public void draw(Graphics g) {
		//dessine cercles
		g.fillOval(this.getCenter().getX(), this.getCenter().getY(),this.getRadius() * 2, this.getRadius() * 2);
	}

}

