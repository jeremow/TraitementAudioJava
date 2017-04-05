public class TestPremierGalop {
	public static void main(String[] args) throws Exception {
		ModuleAbstract gen = new GenSineBasic(442, 1.0);
		ModuleAbstract output = new AudioDataReceiver();
		
		ModuleAbstract.connect(gen, 0, output, 0);
		
	}
	
	//Ecrire un programme de test qui :
	//	— Cr´ee un module GenSineBasic (fr´equence 442 Hz ; amplitude 1.0) nomm´e gen et un module
//		AudioDataReceiver nomm´e output.
//		— Connecte le port de sortie du GenSineBasic au port d’entr´ee du AudioDataReceiver
//		— G´en`ere 5 secondes de son (calcul de 44100 ∗ 5 pas)
//		— Affiche la forme d’onde du signal r´esultant, le sauve dans un fichier audio test1.wav, ´ecoute le
//		signal (oui, vous avez raison, ce n’est pas tr`es joli pour le moment !)
//		Pour tester le fonctionnement du bypass du module AudioDataReceiver, modifier ce programme pour
//		ajouter un second module AudioDataReceiver en aval du premier et v´erifier que le mˆeme son est bien
//		g´en´er´e.
}
