import java.util.HashMap;
import java.util.LinkedList;

public class Patch {
	private String name;
	
	private HashMap<String, ModuleAbstract> modules;
	
	private LinkedList<Connexion> connexions;
	
	public Patch (String name) {
		this.name = name;
		this.modules = new HashMap<String, ModuleAbstract>();
		this.connexions = new LinkedList<Connexion>();
	}
	
	public void addModule(ModuleAbstract m) {
		this.modules.put(m.name,m);
	}
	
	public void connect(String nameOfOutputModule, int idOutputPort, String nameOfInputModule, int idInputPort) {
		connexions.addFirst(ModuleAbstract.connect(modules.get(nameOfOutputModule),idOutputPort,modules.get(nameOfInputModule),idInputPort));
	}
	
	void exec() {
		//TODO rediger la methode d'excecution d'un pas de calcul du patch
	}
	
	void exec(int nbStep) {
		//TODO rediger la methode d'excecution de nbStep pas de calcul du patch
	}
	
	public boolean equals(Object o) {
		if (o instanceof Patch) {
			if(this.name.equals(((Patch)(o)).name)) {
				return true;
			}
		}
		return false;
	}
}
