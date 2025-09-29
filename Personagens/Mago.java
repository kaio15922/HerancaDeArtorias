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
        //O dano que o personagem dará, é aleatorio dentro de um intervalo entre 6 e 35. Pegamos esse valor e somamos ao ataque passado no construtor (0).
        Random rand = new Random();
        int dano = getAtaque() + rand.nextInt(6, 36);
        System.out.println("-----------------------------------------------------\n"+getNome() + " lança uma bola de fogo!");
        alvo.receberDano(dano);
    }

    @Override
    public void usarULT(Personagem alvo) 
    {
        //Ult -> Habilidade especial -> valor aleatorio entre 6 e 21, vezes 2. Pegamos esse valor e somamos ao ataque passado no construtor (0).
        Random rand = new Random();
        int dano = getAtaque() + rand.nextInt(6, 21);
        dano = dano * 2;
        System.out.println("-----------------------------------------------------\n"+getNome() + " usa Magia Suprema!");
        alvo.receberDano(dano);
    }
}
