package Inimigos;

import java.util.Random;

import Personagens.Personagem;

public class Goblin extends Inimigo
{
    public Goblin(String nome) 
    {
        super(nome, 50, 10, 2);
    }

    @Override
    public void atacar(Personagem alvo) 
    {
        Random rand = new Random();
        int dano = getAtaque() + rand.nextInt(5, 16); // 5 a 15 aleatório
        System.out.println(getNome() + " ataca sorrateiro!");
        alvo.receberDano(dano);
    }
}
