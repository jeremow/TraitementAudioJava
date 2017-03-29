
public class Connexion {
	
	CommunicationPort upModulePort;
	CommunicationPort downModulePort;
	
	public Connexion(CommunicationPort upModulePort,CommunicationPort downModulePort) {
		this.upModulePort = upModulePort;
		this.downModulePort = downModulePort;
	}
	
	void communicate() {
		downModulePort.setValue(upModulePort.getValue());
	}
	
}
