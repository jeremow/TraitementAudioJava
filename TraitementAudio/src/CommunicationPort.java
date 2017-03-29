
public class CommunicationPort {
	
	ModuleAbstract mod;
	Connexion con; 
	int idPort;
	double sampleValue;
	
	CommunicationPort (ModuleAbstract mod , int idPort) {
		this.mod = mod;
		this.idPort = idPort;
		con = null;
	}
	public void setValue (double sampleValue) {
		this.sampleValue = sampleValue;
	}
	
	public double getValue() {
		return this.sampleValue;
	}
	
	public boolean isConnected() {
		if (con == null) {
			return false;
		}
		return true;
	}
	
}
