package fr.ldnr.entities;

import java.util.HashMap;
import java.util.Map.Entry;

import fr.ldnr.entities.Interfaces.IGraphic;

public class IGraphicImpl implements IGraphic {
	
	private static HashMap<Integer, Shape> shapes; 

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
		for(Entry<Integer, Shape> entry: shapes.entrySet()) {
			if(entry.getValue() instanceof Square) {
				// Méthode pour dessiner un carré
			} else if (entry.getValue() instanceof Circle) {
				// Méthode pour dessiner un rond
			} else {
				System.out.println("Désolé la forme n'est pas pris en charge");
			}
		}
	}

	@Override
	public void displayAll() {
		shapes.entrySet().stream()
			.forEach(shapes -> System.out.println(shapes.getValue()));
		
	}

}
