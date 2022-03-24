package fr.ldnr.entities;


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

	@Override
	public String toString() {
		return "Shape [center = "+center+"]";
	}

}
