/**
 * Programme permettant l'affichage de plusieurs formes géométriques
 * 
 * @author El babili - 2022
 * 
 */

package fr.ldnr.entities;

//import java.awt.Color;
//import java.awt.GradientPaint;
import java.awt.Graphics;
//import java.awt.Graphics2D;
import javax.swing.JFrame;

public class Graphic extends JFrame {
	
	private static IGraphicImpl formes = new IGraphicImpl();
	private static final long serialVersionUID = 1L;
	
	public Graphic() {
		super("A nous les chocolatines!!! Merci Toulouse!!!");			
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(400, 400);		
		setLocationRelativeTo(null);	
		setVisible(true);			
	}
	
	@Override
	public void paint(Graphics g) {	//le repère x,y commence en haut à gauche (0,0)
		super.paint(g);
		formes.drawShape(g);
//		g.fillOval(50, 50, 35, 35);	// x , y , largeur , hauteur (diamètre)
//		g.drawOval(150, 50, 45, 70);
//		g.drawRect(50, 150, 50, 50);
//		g.fillRect(150, 150, 70, 50);		
//		
//		Graphics2D g2d = (Graphics2D)g;
//		g2d.setPaint( new GradientPaint(0, 0, Color.GREEN, 50, 50, Color.RED,true));
//		g2d.fillRect(250, 50, 70, 50);		
//		
//		g2d.fillOval(250,150,55,55);		
	}
	
	public static void main(String[] args) {
		
		formes.addShape(1, new Circle(20, 30, 50));
		formes.addShape(2, new Circle(15, new Point(100, 150)));
		formes.addShape(3, new Circle(30, 300, 300));
		formes.addShape(4, new Square(50, 200, 200));
		formes.addShape(5, new Square(65, 200, 50));
		
		new Graphic();
	}
}
