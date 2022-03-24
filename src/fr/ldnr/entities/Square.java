package fr.ldnr.entities;

public class Square extends Shape {
	private int side;
	
	
    
    public Square  (int side, int x, int y) {
    	super(x,y);
    	this.setSide(side);
    }
      
    public Square (int side, Point center) {
    	super (center);
    	this.setSide(side);

}

	public int getSide() {
		return side;
	}

	public void setSide(int side) {
		if(side<0) side = 1;
		else this.side = side;
	}

	public int getY() {
		return y;
	}

	public double area() {
		return this.side = this.side;
	}

	public double perimeter () {
		return 4 * side;
	}
public String toString() {
	return "Square side : " + side + super.toString();
}
}
