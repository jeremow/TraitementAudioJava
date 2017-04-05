public class TestPremierGalop {
	public static void main(String[] args) throws Exception {
		GenSineBasic gen = new GenSineBasic(442, 1.0);
		AudioDataReceiver output = new AudioDataReceiver();
		
		ModuleAbstract.connect(gen, 0, output, 0);
		for (int i = 0; i < 44100*5 ; i++) {
			gen.exec();
			output.exec();
		}
		
		output.displayAudioDataWaveform();
	}
}