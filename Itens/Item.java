package Itens;

import Personagens.*;

public abstract class Item 
{
    private String nome;
    private String descricao;
    private int efeito; // pode ser cura, ataque, defesa etc.

    public Item(String nome, String descricao, int efeito) {
        this.nome = nome;
        this.descricao = descricao;
        this.efeito = efeito;
    }

    public String getNome() {
        return nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public int getEfeito() {
        return efeito;
    }

    public abstract void usar(Personagem alvo);
}
