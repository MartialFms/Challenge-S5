package fr.ldnr.entities;

import java.util.HashMap;

import fr.ldnr.entities.Interfaces.IGraphic;

public class IGraphicImpl implements IGraphic {
	
	private HashMap<Integer, Shape> shapes; 

	public IGraphicImpl() {
		shapes = new HashMap<>();
	}

	@Override
	public void addShape(int id, Shape shape) {
		shapes.put(id, shape);
	}

	@Override
	public void deleteShape(int id) {
		shapes.remove(id);
	}

	@Override
	public Shape getShapeById(int id) {
		return shapes.get(id);
	}

	@Override
	public void moveShape(int id, int x, int y) {
		Shape shape = shapes.get(id);
		shape.setCenter(new Point(x, y));
	
	}

	@Override
	public void drawShape() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void displayAll() {
		shapes.entrySet().stream()
			.forEach(shapes -> System.out.println(shapes.getValue()));
		
	}

}
