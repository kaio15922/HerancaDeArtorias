package Personagens;

import java.util.Random;

import Habilidades.HabilidadeEspecial;

//Barbaro eh um personagem -> Heranca e implementa HabilidadeEspecial (Interface)
public class Barbaro extends Personagem implements HabilidadeEspecial
{
    //Construtor
    public Barbaro(String nome)
    {
        super(nome, 100, 0, 9);
    }

    @Override
    public void atacar(Personagem alvo) 
    {
        try {
            //O dano que o personagem dará, é aleatorio dentro de um intervalo entre 6 e 25. Pegamos esse valor e somamos ao ataque passado no construtor (0).
            Random rand = new Random();
            int dano = getAtaque() + rand.nextInt(6, 26);
            System.out.println("------------------------------------------------------------------");
            System.out.println(getNome() + " ataca com um machado rapido!");
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
            //Ult -> Habilidade especial -> valor aleatorio entre 6 e 10, vezes 2. Pegamos esse valor e somamos ao ataque passado no construtor (0).
            Random rand = new Random();
            int dano = getAtaque() + rand.nextInt(6, 11);
            dano = dano * 2;
            System.out.println("------------------------------------------------------------------");
            System.out.println(getNome() + " taca um machado muito forte");
            Thread.sleep(1000);
            alvo.receberDano(dano);
        }catch (InterruptedException e){
            e.printStackTrace();
        }

    }
}
