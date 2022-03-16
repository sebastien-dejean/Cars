
public class FormulaOne extends Car{

	public FormulaOne(float x, float y) {
		super(x, y);
		
		this.v = 0f;
		
		this.angle = 0;
		
		this.weight = 740f;
		this.aeroScore = 90f;
		
		this.rpm = 0f;
		this.gear = 0;
		
		this.r = 2.8f;
		
		this.minrpm = 3000f;
		this.maxrpm = 12000f;
		
		this.maxgear = 8;
	}

	
	public void accelerate() {
		this.rpm = Math.max(minrpm,Math.min(rpm + (maxgear-gear)*20,maxrpm));
		this.v = (float) (rpm * Math.log(gear+1)/30);
	}
	
	public void brake() {
		this.rpm = Math.max(minrpm,Math.min(rpm - (maxgear-gear)*40,maxrpm));
		this.v = (float) (rpm * Math.log(gear+1)/30);
	}
	
	public void moove() {
		angle = Math.floorMod(angle+((int)(this.turn*(aeroScore/100) * (maxgear-gear+1)/maxgear)), 360);
		this.x = (float) (x + (v/100 * Math.cos(angle* Math.PI/180)));
		this.y = (float) (y + (v/100 * Math.sin(angle* Math.PI/180)));
		if(accelerate) {
			accelerate();
		}
		else if(brake) {
			brake();
		}
	}
	
	
	
}
