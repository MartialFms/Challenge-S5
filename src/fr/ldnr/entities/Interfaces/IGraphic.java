package fr.ldnr.entities.Interfaces;

import java.util.HashMap;

import fr.ldnr.entities.Shape;

public interface IGraphic {
	
	public void addShape(int id, Shape shape);
	public void deleteShape(int id);
	public Shape getShapeById(int id);
	public void moveShape(int id, int x, int y);
	public void drawShape();
	public void displayAll();

}
