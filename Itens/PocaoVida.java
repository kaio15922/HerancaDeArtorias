package Itens;

import Personagens.Personagem;

public class PocaoVida extends Item
{
    public PocaoVida(String nome, String descricao, int efeito)
    {
        super(nome, descricao, efeito);
    }

    @Override
    public void usar(Personagem alvo) 
    {
        alvo.setVida(alvo.getVida() + getEfeito());
        System.out.println(alvo.getNome() + " usa " + getNome() + " e recupera " + getEfeito() + " de vida!");
    }
}
