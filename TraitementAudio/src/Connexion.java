
public class Connexion {
	
	CommunicationPort upModulePort;
	CommunicationPort downModulePort;
	
	public Connexion(CommunicationPort upModulePort,CommunicationPort downModulePort) {
		this.upModulePort = upModulePort;
		this.downModulePort = downModulePort;
		upModulePort.setConnexion(this);
		downModulePort.setConnexion(this);
	}
	
	void communicate() {
		System.out.println(upModulePort.getValue());
		downModulePort.setValue(upModulePort.getValue());
	}
	
}
