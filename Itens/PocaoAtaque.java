package Itens;

import Personagens.Personagem;

//Poção de ataque é um item -> Herança
public class PocaoAtaque extends Item
{
    //Construtor da classe que faz referencia ao construtor da super classe
    public PocaoAtaque(String nome, String descricao, int efeito)
    {
        super(nome, descricao, efeito);
    }

    //Pocao de ataque -> aumenta o ataque de acordo com o valor do efeito
    @Override
    public void usar(Personagem alvo) 
    {
        int ataqueAtual = alvo.getAtaque();
        alvo.setAtaque(ataqueAtual + getEfeito());
        System.out.println(alvo.getNome() + " usa " + getNome() + " e aumenta seu ataque em " + getEfeito() + "!");
    }
}
