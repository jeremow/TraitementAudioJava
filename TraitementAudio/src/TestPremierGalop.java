public class TestPremierGalop {
	public static void main(String[] args) throws Exception {
		GenSineBasic gen = new GenSineBasic(440/2, 1.0);
		AudioDataReceiver output = new AudioDataReceiver();
		GenSineBasic gen2 = new GenSineBasic(554/2, 0.8);
		AudioDataReceiver output2 = new AudioDataReceiver();
		GenSineBasic gen3 = new GenSineBasic(659/2, 0.6);
		AudioDataReceiver output3 = new AudioDataReceiver();
		
		ModuleAbstract.connect(gen, 0, output, 0);
		ModuleAbstract.connect(gen2, 0, output2, 0);
		ModuleAbstract.connect(gen3, 0, output3, 0);
		for (int i = 0; i < 44100*3 ; i++) {
			gen.exec();
			output.exec();
			gen2.exec();
			output2.exec();
			gen3.exec();
			output3.exec();
		}

		output.playAudioData();
		output2.playAudioData();
		output3.playAudioData();
	}
}