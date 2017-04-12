
public class CommunicationPort {
	
	private ModuleAbstract mod;
	private Connexion con; 
	private int idPort;
	private double sampleValue;
	
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
	public Connexion getConnexion() {
		return this.con;
	}
	public void setConnexion(Connexion con) {
		this.con = con;
	}
	public ModuleAbstract getModuleAbstract() {
		return this.mod;
	}
	public int getIPort() {
		return this.idPort;
	}
	
	
	
	public boolean isConnected() {
		return con != null ;
	}
	
}
