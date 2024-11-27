package presentacion;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.util.ArrayList;

import javax.swing.JPanel;

public class PLienzo extends JPanel {
	
	private int valorR;
	private int valorG;
	private int valorB;
	private String textoBoton;
	
	public void paint(Graphics g) {
		Graphics2D g2d = (Graphics2D) g;
		g2d.setColor(new Color(255, 255, 255)); //blanco
		g2d.fillRect(0, 0, this.getWidth(), this.getHeight());
		
		
		if (textoBoton != null) {
			g2d.setColor(new Color(valorR, valorG, valorB));
			if(textoBoton.equals("Cuadrado")) {
				g2d.fillRect(0+this.getWidth()/4, 0+this.getHeight()/4, this.getWidth()/2, this.getHeight()/2);	
			}
			else if(textoBoton.equals("Circulo")) {
				g2d.fillOval(0+this.getWidth()/4, 0+this.getHeight()/4, this.getWidth()/2, this.getHeight()/2);
			}
		}
			
	}
	
	
	
	public PLienzo(int valorR, int valorG, int valorB, String textoBoton) {
		repaint();
		this.valorR = valorR;
		this.valorG = valorG;
		this.valorB = valorB;
		this.textoBoton = textoBoton;
		repaint();
	}

	
}
