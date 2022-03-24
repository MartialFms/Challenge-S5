package fr.ldnr.entities;

import java.util.ArrayList;

public class TestShapes {
	public static void main(String[] args) {
		Shape[] shapes = new Shape[5];
		shapes[0] = new Circle(1.5,new Point(5,5));
		shapes[1] = new Square(3.2, new Point(1,2));
		shapes[2] = new Circle();
		for ( Shape s : shapes) {
			System.out.println(s);
		}
			System.out.println("---------------");
			
			Circle c1 = new Circle(2.0,3,7);
			Shape s1 = new Square(3.2,7,10);
			Point p = new Point(3,15);
			Object c2 = new Circle(1.5,p);
			
			ArrayList<Object> objects=new ArrayList<>();
			objects.add(c1);
			objects.add(s1);
			objects.add(c2);
			objects.add(p);
			for(Object o : objects) {
				if(o instanceof Point) System.out.println("Point ");
				System.out.println(o);	
		}
	}
}
