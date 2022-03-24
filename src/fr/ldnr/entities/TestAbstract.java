package fr.ldnr.entities;

public class TestAbstract {

	public static void main(String[] args) {

		Shape[] shapes = new Shape[3];
		shapes[0] = new Circle(1.5, new Point(5, 5));
		shapes[1] = new Square(3.2, new Point(1, 2));
		shapes[2] = new Circle();
		for (Shape s : shapes) {
			System.out.print(s);
			System.out.print(" area = " + s.aera());
		}

	}

}