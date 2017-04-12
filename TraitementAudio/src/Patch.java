import java.util.*;
import java.util.LinkedList;

public class Patch {
	private String name;
	
	private Map<String, ModuleAbstract> modules;
	private List<ModuleAbstract> listModules;
	
	private Collection<Connexion> connexions;
	
	public Patch (String name) {
		this.name = name;
		this.modules = new HashMap<String, ModuleAbstract>();
		this.connexions = new HashSet<Connexion>();
		this.listModules = new LinkedList<ModuleAbstract>();
	}
	public List<ModuleAbstract> getModules () {
		return this.listModules;
	}

	public String getName () {
		return this.name;
	}
	public void addModule(ModuleAbstract m) {
		if(modules.containsKey(m.getName()) ) {
			throw new IllegalArgumentException(m.getName() + " est un module qui existe deja dans le patch" + this.getName());
		}
		this.modules.put(m.name,m);
		this.listModules.add(m);
	}
	
	public void connect(String nameOfOutputModule, int idOutputPort, String nameOfInputModule, int idInputPort) {
		connexions.add(ModuleAbstract.connect(modules.get(nameOfOutputModule),idOutputPort,modules.get(nameOfInputModule),idInputPort));
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
	
	
	public String toString() {
		return "blabla";
	}
}
