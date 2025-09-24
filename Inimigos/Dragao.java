package Inimigos;

import java.util.Random;

import Personagens.Personagem;

public class Dragao extends Inimigo
{
    public Dragao(String nome) 
    {
        super(nome, 150, 25, 10);
    }

    @Override
    public void atacar(Personagem alvo) 
    {
        Random rand = new Random();
        int dano = getAtaque() + rand.nextInt(15, 31); // 15 a 30 aleatório
        System.out.println(getNome() + " cospe fogo!");
        alvo.receberDano(dano);
    }
}
