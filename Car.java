import java.util.LinkedList;

public abstract class Car {
	public float minrpm;
	public float maxrpm;
	public float maxgear;
	
	public int angle;
	public float v;
	public float x,y;
	public float aeroScore;
	public float weight;
	public float rpm;
	public float r;
	public int gear;

	public int turn = 0;
	public boolean accelerate = false;
	public boolean brake = false;
	
	public Car(float x, float y) {
		this.x = x;
		this.y = y;
	
	}
	
	public void downGear() {
		if(gear >= 1) {
			--gear;
			accelerate();
		}
	}
	public void upGear() {
		if(gear < maxgear) {
			++gear;
			rpm -= 2000f ;
			accelerate();
		}
	}
	
	public void start() {
		this.rpm = minrpm;
		this.gear = 0;
	}
	
	public void turn(int a) {
		this.turn = a;
	}
	
	public abstract void moove();
	public abstract void accelerate();
}
