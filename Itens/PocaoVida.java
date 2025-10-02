package Itens;

import Personagens.Personagem;

// Poção de vida é um item -> Herança
public class PocaoVida extends Item
{
    // Construtor da classe que faz referencia ao construtor da super classe
    public PocaoVida(String nome, String descricao, int efeito)
    {
        super(nome, descricao, efeito);
    }

    // Pocao de vida -> aumenta a vida de acordo com o valor do efeito
    @Override
    public void usar(Personagem alvo) 
    {
        alvo.setVida(alvo.getVida() + getEfeito());
        System.out.println(alvo.getNome() + " usa " + getNome() + " e recupera " + getEfeito() + " de vida!");
    }
}
