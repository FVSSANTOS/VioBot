package violinbot;

import com.musicg.fingerprint.FingerprintSimilarity;
import com.musicg.wave.Wave;

import javazoom.jl.converter.Converter;
import javazoom.jl.decoder.JavaLayerException;

public class TesteAudio {
    public static void main(String[] args) {
        
        String wavFilePath = "C:\\Users\\70803247427\\Desktop\\Violin-bot-TCC\\demo\\src\\main\\java\\violinbot\\brilha.wav";

        
        String wavFilePath2 = "C:\\Users\\70803247427\\Desktop\\Violin-bot-TCC\\demo\\src\\main\\java\\violinbot\\brilha2.wav";

        String mp3FilePath = "C:\\Users\\70803247427\\Desktop\\Violin-bot-TCC\\demo\\src\\main\\java\\violinbot\\brilha2.mp3";


          


        Wave wave = new Wave(wavFilePath);
        Wave wave2 = new Wave(wavFilePath2);
  
        
        FingerprintSimilarity similarity = wave2.getFingerprintSimilarity(wave2);
        double score = similarity.getSimilarity();
        System.out.println(score);
    }

}
 