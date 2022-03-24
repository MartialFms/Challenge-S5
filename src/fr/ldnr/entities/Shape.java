package fr.ldnr.entities;

import java.awt.Point;

public class Shape {
	private Point centerPoint;
	
	public Shape(int x, int y) {
		this.centerPoint = new Point(centerPoint.getX(),centerPoint.getY());
		
	}

	@Override
	public String toString() {
		return "Shape [center = "+center+"]";
	}

}
