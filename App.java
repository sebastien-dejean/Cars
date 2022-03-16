
public class App {
	public static void main(String[] args) {
		FormulaOne f1 = new FormulaOne(200,200);
		Window w = new Window(Constant.width, Constant.height);
		Circuit c = new Circuit(f1);
		KeyHandler kh = new KeyHandler(f1);
		c.addKeyListener(kh);
		w.add(c);
		w.pack();
		c.grabFocus();
		Simulation sim = new Simulation(f1,c);
		sim.launch();
	}
}
