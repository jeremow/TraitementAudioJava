public class TestPremierGalop {
	public static void main(String[] args) throws Exception {
		
		Patch chapt = new Patch("Accord parfait majeur");
		
		GenSineBasic gen = new GenSineBasic(440, 1.0);
		AudioDataReceiver output = new AudioDataReceiver();
		GenSineBasic gen2 = new GenSineBasic(554, 0.8);
		AudioDataReceiver output2 = new AudioDataReceiver();
		GenSineBasic gen3 = new GenSineBasic(659, 0.6);
		AudioDataReceiver output3 = new AudioDataReceiver();
		
		ModuleAbstract.connect(gen, 0, output, 0);
		ModuleAbstract.connect(gen2, 0, output2, 0);
		ModuleAbstract.connect(gen3, 0, output3, 0);
		
		chapt.addModule(gen);
		chapt.addModule(gen2);
		chapt.addModule(gen3);
		chapt.addModule(output);
		chapt.addModule(output2);
		chapt.addModule(output3);
		
		chapt.exec(44100*5);

		output.playAudioData();
		output2.playAudioData();
		output3.playAudioData();
	}
}