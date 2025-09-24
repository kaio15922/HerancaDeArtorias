package Inimigos;

import java.util.Random;
import Personagens.Personagem;

public class Orc extends Inimigo
{
    public Orc(String nome) 
    {
        super(nome, 80, 15, 5);
    }

    @Override
    public void atacar(Personagem alvo) 
    {
        Random rand = new Random();
        int dano = getAtaque() + rand.nextInt(10, 21);
        System.out.println(getNome() + " golpeia com força brutal!");
        alvo.receberDano(dano);
    }
}
