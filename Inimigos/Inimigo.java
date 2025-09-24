package Inimigos;

import java.util.Random;

import Personagens.Personagem;

public class Inimigo extends Personagem
{
    public Inimigo(String nome, int vida, int ataque, int defesa) 
    {
        super(nome, vida, ataque, defesa);
    }

    @Override
    public void atacar(Personagem alvo) 
    {
        Random rand = new Random();
        int dano = getAtaque() + rand.nextInt(5, 16);
        System.out.println(getNome() + " ataca!");
        alvo.receberDano(dano);
    }
}
