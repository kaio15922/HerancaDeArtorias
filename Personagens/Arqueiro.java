package Personagens;

import java.util.Random;

import Habilidades.HabilidadeEspecial;

//Arqueiro é um personagem -> Heranca e implementa HabilidadeEspecial (Interface)
public class Arqueiro extends Personagem implements HabilidadeEspecial
{
    public Arqueiro(String nome) 
    {
        super(nome, 80, 0, 7);
    }

    @Override
    public void atacar(Personagem alvo) 
    {
        //O dano que o personagem dará, é aleatorio dentro de um intervalo entre 6 e 30. Pegamos esse valor e somamos ao ataque passado no construtor (0).
        Random rand = new Random();
        int dano = getAtaque() + rand.nextInt(6, 31);
        System.out.println("-----------------------------------------------------\n"+getNome() + " manda uma flechada certeira!");
        alvo.receberDano(dano);
    }

    @Override
    public void usarULT(Personagem alvo) 
    {
        //Ult -> Habilidade especial -> valor aleatorio entre 6 e 15, vezes 2. Pegamos esse valor e somamos ao ataque passado no construtor (0).
        Random rand = new Random();
        int dano = getAtaque() + rand.nextInt(6, 16);
        dano = dano * 2;
        System.out.println("-----------------------------------------------------\n"+getNome() + " dispara chuva de flechas!");
        alvo.receberDano(dano);
    }
}
