package Itens;

import Personagens.Personagem;

public class PocaoDefesa extends Item
{
    public PocaoDefesa(String nome, String descricao, int efeito)
    {
        super(nome, descricao, efeito);
    }

    @Override
    public void usar(Personagem alvo) 
    {
        int defesaAtual = alvo.getDefesa();
        alvo.setDefesa(defesaAtual + getEfeito());
        System.out.println(alvo.getNome() + " usa " + getNome() + " e aumenta sua defesa em " + getEfeito() + "!");
    }
}
