package Inimigos;

import java.util.Random;

import Personagens.Personagem;

public class Goblin extends Personagem
{
    //Construtor da classe que faz referencia ao construtor da super classe
    public Goblin(String nome) 
    {
        super(nome, 50, 10, 2);
    }


    /*Goblin realiza um ataque:
     * 10 + valor aleatorio entre 5 e 15*/
    @Override
    public void atacar(Personagem alvo) 
    {
        Random rand = new Random();
        int dano = getAtaque() + rand.nextInt(5, 16); // 5 a 15 aleatório
        System.out.println(getNome() + " ataca sorrateiro!");
        alvo.receberDano(dano);
    }
}
