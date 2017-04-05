
public class GenSineBasic extends ModuleAbstract {
	
	private double f; //Fréquence de la sinusoïde
	private double amp; // Amplitude de la sinusoïde 
	private int n;
	

	public GenSineBasic(double f, double amp) {
		super("SineBasic", 0, 1);
		this.f = f;
		this.amp = amp;
		this.n = 0;
	}
	
	void exec() {
		double e = this.amp*Math.sin(2*Math.PI*this.f*this.n/SAMPLE_FREQ);
		this.setAndSendOutputPortValue(0, e);
		this.n += 1;
	}
	
    public static void main(String[] args) throws Exception {
    	
    }
}
