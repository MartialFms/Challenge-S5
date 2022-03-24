package fr.ldnr.entities;

import java.awt.Graphics;
import java.nio.channels.spi.AbstractInterruptibleChannel;

public abstract  class Shape {
	private Point center;
	
	public Shape(int x, int y) {
		this.center = new Point(x,y);	
	}
	
	public Shape(Point center) {
		this.center =
				new Point(center.getX(),center.getY());
		
	}
	public abstract double area();
	
	public abstract void draw(Graphics g);

	public Point getCenter() {
		return center;
	}

	public void setCenter(Point center) {
		this.center = center;
	}

	@Override
	public String toString() {
		return "Shape [ center = " + "x : " +  center.getX() + " | y : " + center.getY() + " ]";
	}

}
