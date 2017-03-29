
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
	public void setValut (double sampleValue) {
		this.sampleValue = sampleValue;
	}
}
