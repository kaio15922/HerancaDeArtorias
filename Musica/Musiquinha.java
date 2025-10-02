package Musica;

import javax.sound.sampled.*;
import java.io.IOException;
import java.io.InputStream;

// To usando a importação inputStrem, e não URL porque eu quero :)
public class Musiquinha 
{
    private Clip clip;

    public void tocar(String nomeArquivo) 
    {
        try 
        {
            // Pega a musica e coloca no classpath
            InputStream audioSrc = getClass().getResourceAsStream("/resources/Musica/" + nomeArquivo); //ta apontando pra onde ta a musica
            if (audioSrc == null) 
            {
                System.out.println("Arquivo não encontrado: " + nomeArquivo);
                return;
            }
            AudioInputStream audioStream = AudioSystem.getAudioInputStream(audioSrc);
            clip = AudioSystem.getClip();
            clip.open(audioStream);
            clip.loop(Clip.LOOP_CONTINUOUSLY); // Faz a musica roda em loop
            clip.start();
            // Tratamento dos erros que pode ter
        } 
        catch (UnsupportedAudioFileException | IOException | LineUnavailableException e) 
        {
            e.printStackTrace();
        }
    }
    public void parar() 
    {
        if (clip != null && clip.isRunning()) 
        {
            clip.stop();
        }
    }
}