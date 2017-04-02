import java.io.IOException;

import phelmaaudio.AudioData;
import phelmaaudio.WavFileException;

public class AudioDataReceiver extends ModuleAbstract {
	
	public AudioData Data;
	
	public AudioDataReceiver() {
		super("AudioDataReceiver", 1, 0);
		
	}
	
	public void exec() {
		Data.addSample(this.getInputPortValue(0));
	}
	
	void saveAudioDataToWavFile(String name) {
		try {
			Data.saveAudioDataToWavFileNormalized(name);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (WavFileException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	void displayAudioDataWaveform() {
		Data.display();
	}
	
	void playAudioData() {
		Data.play();
	}
	
}
