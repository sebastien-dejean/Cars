import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class KeyHandler implements KeyListener{
	public Car c;
	
	public KeyHandler(Car c) {
		this.c = c;
	}
	@Override
	public void keyPressed(KeyEvent arg0) {
		
		switch(arg0.getKeyCode()) {
			case KeyEvent.VK_D:
				c.turn(9);
				break;
			case KeyEvent.VK_Q:
				c.turn(-9);
				break;
			case KeyEvent.VK_R:
				c.start();
				break;
			case KeyEvent.VK_Z:
				c.accelerate = true;
				break;
			case KeyEvent.VK_S:
				c.brake = true;
				break;
			case KeyEvent.VK_E:
				c.upGear();
				break;
			case KeyEvent.VK_A:
				c.downGear();
				break;
		}
	}

	@Override
	public void keyReleased(KeyEvent arg0) {
		switch(arg0.getKeyCode()) {
			case KeyEvent.VK_D:
				c.turn(0);
				break;
			case KeyEvent.VK_Q:
				c.turn(0);
				break;
			case KeyEvent.VK_Z:
				c.accelerate = false;
				break;
			case KeyEvent.VK_S:
				c.brake = false;
				break;
		}
	}

	@Override
	public void keyTyped(KeyEvent arg0) {}

}
