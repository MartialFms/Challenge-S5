package fr.ldnr.entities;

public class TestAbstract {

	public static void main(String[] args) {

		IGraphicImpl formes = new IGraphicImpl();
		formes.addShape(1, new Circle(1.5, 5, 5));
		
		formes.displayAll();

	}

}