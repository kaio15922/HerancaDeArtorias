package Inimigos;

import java.util.Random;
import Personagens.Personagem;

public class Dragao extends Personagem
{
    // Construtor da classe que faz referencia ao construtor da super classe
    public Dragao(String nome) 
    {
        super(nome, 125, 10, 10);
    }

    /*Dragao realiza um ataque:
    * 25 + valor aleatorio entre 15 e 30*/
    @Override
    public void atacar(Personagem alvo) 
    {
        try 
        {
            Random rand = new Random();
            int dano = getAtaque() + rand.nextInt(15, 31); // 15 a 30 aleatório
            Thread.sleep(1000);
            System.out.println(getNome() + " cospe fogo!");
            Thread.sleep(1000);
            alvo.receberDano(dano);
        }
        catch (InterruptedException e)
        {
            e.printStackTrace();
        }
    }
}
