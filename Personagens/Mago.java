package Personagens;

import java.util.Random;

import Habilidades.HabilidadeEspecial;

public class Mago extends Personagem implements HabilidadeEspecial
{
    public Mago(String nome)
    {
        super(nome, 260, 0, 5);
    }

    @Override
    public void atacar(Personagem alvo) 
    {
        Random rand = new Random();
        int dano = getAtaque() + rand.nextInt(6, 36);
        System.out.println("\n"+getNome() + " lança uma bola de fogo!");
        alvo.receberDano(dano);
    }

    @Override
    public void usarULT(Personagem alvo) 
    {
        Random rand = new Random();
        int dano = getAtaque() + rand.nextInt(6, 21);
        dano = dano * 2;
        System.out.println(getNome() + " usa Magia Suprema!");
        alvo.receberDano(dano);
    }
}
