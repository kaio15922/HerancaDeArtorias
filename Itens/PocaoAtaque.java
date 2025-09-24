package Itens;

import Personagens.Personagem;

public class PocaoAtaque extends Item
{
    public PocaoAtaque(String nome, String descricao, int efeito)
    {
        super(nome, descricao, efeito);
    }

    @Override
    public void usar(Personagem alvo) 
    {
        int ataqueAtual = alvo.getAtaque();
        alvo.setAtaque(ataqueAtual + getEfeito());
        System.out.println(alvo.getNome() + " usa " + getNome() + " e aumenta seu ataque em " + getEfeito() + "!");
    }
}
