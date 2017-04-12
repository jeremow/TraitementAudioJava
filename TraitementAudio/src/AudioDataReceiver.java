import java.io.IOException;

import phelmaaudio.AudioData;
import phelmaaudio.WavFileException;

public class AudioDataReceiver extends ModuleAbstract {
	
	public AudioData data;
	
	public AudioDataReceiver() {
		super("AudioDataReceiver", 1, 1);
		this.data = new AudioData();
	}
	
	public void exec() {
		data.addSample(this.getInputPortValue(0));
		this.setAndSendOutputPortValue(0, getInputPortValue(0));
	}
	
	void saveAudioDataToWavFile(String name) {
		try {
			data.saveAudioDataToWavFileNormalized(name);
		} catch (IOException e) {
			e.printStackTrace();
		} catch (WavFileException e) {
			e.printStackTrace();
		}
	}
	
	void displayAudioDataWaveform() {
		data.display();
	}
	
	void playAudioData() {
		data.play();
	}
	

	
}
