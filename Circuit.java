
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Rectangle2D;
import java.util.LinkedList;

import javax.swing.JPanel;

public class Circuit extends JPanel{
	public Car c;
	public Circuit(Car c) {
		this.setPreferredSize(new Dimension(Constant.width,Constant.height));
		this.c = c;
	}
	
	@Override
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		Graphics2D g2d = (Graphics2D) g;
		g2d.fill(new Ellipse2D.Float(c.x, c.y, 10, 10));
		g2d.setColor(Color.blue);
	}
}
