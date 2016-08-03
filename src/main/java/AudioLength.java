import java.io.File;
import java.io.IOException;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;

public class AudioLength {

    public static void main(String[] args) throws LineUnavailableException, UnsupportedAudioFileException, IOException {
//        File file = new File(fileName);
//        if (file.exists()) {
//         Clip myClip = AudioSystem.getClip();
//         AudioInputStream ais = AudioSystem.getAudioInputStream(file.toURI().toURL());
//         myClip.open(ais);
         
         
         
         
        File file = new File("d:\\q.mp3");
        Clip clip = AudioSystem.getClip();
        AudioInputStream ais = AudioSystem.getAudioInputStream(file.toURL());
        clip.open(ais);
        System.out.println(clip.getMicrosecondLength() / 1000000D + " s");// 获取音频文件时长
    }


}