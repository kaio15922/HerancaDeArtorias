package Inimigos;

import java.util.Random;

import Personagens.Personagem;

//Dragao é um personagem -> Herança
public class Dragao extends Personagem
{
    //Construtor da classe que faz referencia ao construtor da super classe
    public Dragao(String nome) 
    {
        super(nome, 150, 25, 10);
    }

    /*Dragao realiza um ataque:
    * 25 + valor aleatorio entre 15 e 30*/
    @Override
    public void atacar(Personagem alvo) 
    {
        Random rand = new Random();
        int dano = getAtaque() + rand.nextInt(15, 31); // 15 a 30 aleatório
        System.out.println(getNome() + " cospe fogo!");
        alvo.receberDano(dano);
    }
}
