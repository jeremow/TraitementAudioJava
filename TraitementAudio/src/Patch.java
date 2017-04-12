import java.util.HashMap;
import java.util.LinkedList;

public class Patch {
	private String name;
	
	private HashMap<String, ModuleAbstract> modules;
	private LinkedList<ModuleAbstract> listModules;
	
	private LinkedList<Connexion> connexions;
	
	public Patch (String name) {
		this.name = name;
		this.modules = new HashMap<String, ModuleAbstract>();
		this.connexions = new LinkedList<Connexion>();
		this.listModules = new LinkedList<ModuleAbstract>();
	}
	
	public void addModule(ModuleAbstract m) {
		this.modules.put(m.name,m);
		this.listModules.addFirst(m);
	}
	
	public void connect(String nameOfOutputModule, int idOutputPort, String nameOfInputModule, int idInputPort) {
		connexions.addFirst(ModuleAbstract.connect(modules.get(nameOfOutputModule),idOutputPort,modules.get(nameOfInputModule),idInputPort));
	}
	
	void exec() {
		for (ModuleAbstract e : listModules) {
			e.exec();
		}
	}
	
	void exec(int nbStep) {
		for (int i = 0 ; i < nbStep ; i++) {
			this.exec();
			}
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
