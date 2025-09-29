package Itens;

import Personagens.Personagem;

//Poção de defesa é um item -> Herança
public class PocaoDefesa extends Item
{
    //Construtor da classe que faz referencia ao construtor da super classe
    public PocaoDefesa(String nome, String descricao, int efeito)
    {
        super(nome, descricao, efeito);
    }

    //Pocao de defesa -> aumenta a defesa de acordo com o valor do efeito
    @Override
    public void usar(Personagem alvo) 
    {
        int defesaAtual = alvo.getDefesa();
        alvo.setDefesa(defesaAtual + getEfeito());
        System.out.println(alvo.getNome() + " usa " + getNome() + " e aumenta sua defesa em " + getEfeito() + "!");
    }
}
