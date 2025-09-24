package Personagens;

import java.util.Random;

import Habilidades.HabilidadeEspecial;

public class Barbaro extends Personagem implements HabilidadeEspecial
{
    public Barbaro(String nome)
    {
        super(nome, 100, 0, 9);
    }

    @Override
    public void atacar(Personagem alvo) 
    {
        Random rand = new Random();
        int dano = getAtaque() + rand.nextInt(6, 26);
        System.out.println("\n"+getNome() + " ataca com um machado rapido!");
        alvo.receberDano(dano);
    }

    @Override
    public void usarULT(Personagem alvo) 
    {
        Random rand = new Random();
        int dano = getAtaque() + rand.nextInt(6, 11);
        dano = dano * 2;
        System.out.println(getNome() + " taca um machado muito forte");
        alvo.receberDano(dano);
    }
}
