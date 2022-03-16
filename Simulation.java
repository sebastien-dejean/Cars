import javax.swing.JPanel;

public class Simulation {
	public Car c;
	public JPanel p;
	public Simulation(Car c, JPanel p) {
		this.c = c;
		this.p = p;
	}
	public void launch() {
		while(true) {
			c.moove();
			p.repaint();
			try {
				Thread.sleep(15);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
