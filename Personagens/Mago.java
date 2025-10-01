package Personagens;
import java.util.Random;
import Habilidades.HabilidadeEspecial;

//Mago eh um personagem -> Heranca e implementa HabilidadeEspecial (Interface)
public class Mago extends Personagem implements HabilidadeEspecial
{
    //Construtor
    public Mago(String nome)
    {
        super(nome, 60, 0, 5);
    }


    @Override
    public void atacar(Personagem alvo) 
    {
        try {
            //O dano que o personagem dará, é aleatorio dentro de um intervalo entre 6 e 35. Pegamos esse valor e somamos ao ataque passado no construtor (0).
            Random rand = new Random();
            int dano = getAtaque() + rand.nextInt(6, 36);
            System.out.println("------------------------------------------------------------------");
            System.out.println(getNome() + " lança uma bola de fogo!");
            Thread.sleep(1000);
            alvo.receberDano(dano);
        }catch (InterruptedException e){
            e.printStackTrace();
        }

    }

    @Override
    public void usarULT(Personagem alvo) 
    {
        try {
            //Ult -> Habilidade especial -> valor aleatorio entre 6 e 21, vezes 2. Pegamos esse valor e somamos ao ataque passado no construtor (0).
            Random rand = new Random();
            int dano = getAtaque() + rand.nextInt(6, 21);
            dano = dano * 2;
            System.out.println("------------------------------------------------------------------");
            System.out.println(getNome() + " usa Magia Suprema!");
            Thread.sleep(1000);
            alvo.receberDano(dano);
        }catch (InterruptedException e){
            e.printStackTrace();
        }

    }
}
