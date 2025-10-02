package Personagens;

import java.util.Random;

import Habilidades.HabilidadeEspecial;

public class Arqueiro extends Personagem implements HabilidadeEspecial
{
    public Arqueiro(String nome) 
    {
        super(nome, 250, 0, 7);
    }

    @Override
    public void atacar(Personagem alvo) 
    {
        Random rand = new Random();
        int dano = getAtaque() + rand.nextInt(6, 31);
        System.out.println("\n"+getNome() + " manda uma flechada certeira!");
        alvo.receberDano(dano);
    }

    @Override
    public void usarULT(Personagem alvo) 
    {
        Random rand = new Random();
        int dano = getAtaque() + rand.nextInt(6, 16);
        dano = dano * 2;
        System.out.println(getNome() + " dispara chuva de flechas!");
        alvo.receberDano(dano);
    }
}
