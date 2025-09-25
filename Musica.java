import javax.sound.sampled.*;
import java.io.IOException;
import java.io.InputStream;
//to usando a importação inputStrem, e não URL porque eu quero :)
public class Musica {
    private Clip clip;

    public void tocar(String nomeArquivo) {
        try {
            //pega a musica e coloca no classpath
            InputStream audioSrc = getClass().getResourceAsStream("/resources/Musica/" + nomeArquivo); //ta apontando pra onde ta a musica
            if (audioSrc == null) {
                System.out.println("Arquivo não encontrado: " + nomeArquivo);
                return;
            }
            AudioInputStream audioStream = AudioSystem.getAudioInputStream(audioSrc);
            clip = AudioSystem.getClip();
            clip.open(audioStream);
            clip.loop(Clip.LOOP_CONTINUOUSLY); // faz a musica roda em loop
            clip.start();
            //tratamento dos erros que pode ter
        } catch (UnsupportedAudioFileException | IOException | LineUnavailableException e) {
            e.printStackTrace();
        }
    }
    public void parar() {
        if (clip != null && clip.isRunning()) {
            clip.stop();
        }
    }
}
