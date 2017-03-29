
public abstract class ModuleAbstract {
	
	static int SAMPLE_FREQ = 44100;
	String name;
	CommunicationPort[] inputPorts;
	CommunicationPort[] outputPorts;
	
	public ModuleAbstract(String name , int nbInputPort , int nbOutputPort) {
		this.name = name;
		this.inputPorts = new CommunicationPort[nbInputPort];
		this.outputPorts = new CommunicationPort[nbOutputPort];
	}
	
	public String getName() {
		return this.name;
	}
	
	static Connexion connect(ModuleAbstract mOutput, int idOutputPort, ModuleAbstract mInput, int idInputPort) {
		Connexion Connex = new Connexion(mInput.inputPorts[idInputPort], mOutput.outputPorts[idOutputPort]);
		return Connex;
	}
	
	public void setAndSendOutputPortValue(int idOutputPort, double sample) {
		this.outputPorts[idOutputPort].setValue(sample);
		
		if (this.outputPorts[idOutputPort].isConnected()) {
			this.outputPorts[idOutputPort].con.communicate();
		}
	}
	
	public double getInputPortValue(int idInputPort) {
		return inputPorts[idInputPort].getValue();
	}
	
	public double getOutputPortValue(int idOutputPort) {
		return outputPorts[idOutputPort].getValue();
	}
	
	void exec() {
		
	}
}
