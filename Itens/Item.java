package Itens;

import Personagens.*;

public abstract class Item 
{
    //Atributos
    private String nome;
    private String descricao;
    private int efeito; // pode ser cura, ataque, defesa etc.

    //Construtor da classe
    public Item(String nome, String descricao, int efeito) {
        this.nome = nome;
        this.descricao = descricao;
        this.efeito = efeito;
    }

    //Getters que serao importantes
    public String getNome() {
        return nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public int getEfeito() {
        return efeito;
    }

    //Metodo abstrato usar
    public abstract void usar(Personagem alvo);
}
