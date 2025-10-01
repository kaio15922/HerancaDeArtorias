package Inimigos;

import java.util.Random;
import Personagens.Personagem;

public class Orc extends Personagem
{
    //Construtor da classe que faz referencia ao construtor da super classe
    public Orc(String nome) 
    {
        super(nome, 80, 15, 5);
    }

    /*Orc realiza um ataque:
     * 15 + valor aleatorio entre 10 e 20*/
    @Override
    public void atacar(Personagem alvo) 
    {
        try{
            Random rand = new Random();
            int dano = getAtaque() + rand.nextInt(10, 21); // 10 a 20 aleatório
            Thread.sleep(1000);
            System.out.println(getNome() + " golpeia com força brutal!");
            Thread.sleep(1000);
            alvo.receberDano(dano);
        }catch (InterruptedException e){
            e.printStackTrace();
        }

    }
}
