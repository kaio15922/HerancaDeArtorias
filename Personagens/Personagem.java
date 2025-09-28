package Personagens;

import java.util.ArrayList;

import Itens.Item;

public abstract class Personagem 
{
    private String nome;
    private int vida;
    private int ataque;
    private int defesa;
    private ArrayList<Item> inventario;

    public Personagem(String nome, int vida, int ataque, int defesa) 
    {
        this.nome = nome;
        this.vida = vida;
        this.ataque = ataque;
        this.defesa = defesa;
        this.inventario = new ArrayList<>();
    }

    public int getAtaque() 
    {
        return ataque;
    }
    public int getDefesa() 
    {
        return defesa;
    }
    public String getNome() 
    {
        return nome;
    }
    public int getVida() 
    {
        return vida;
    }
    public void setAtaque(int ataque) 
    {
        this.ataque = ataque;
    }
    public void setDefesa(int defesa) 
    {
        this.defesa = defesa;
    }
    public void setNome(String nome) 
    {
        this.nome = nome;
    }
    public void setVida(int vida) 
    {
        this.vida = vida;
    }

    public void adicionarItem(Item item) 
    {
        inventario.add(item);
        //System.out.println(item.getNome() + " adicionado ao inventário!");
    }

    public void mostrarInventario() 
    {
        System.out.println("=== Inventário de " + nome + " ===");
        for (int i = 0; i < inventario.size(); i++) 
        {
            Item item = inventario.get(i);
            System.out.println(i + " - " + item.getNome() + ": " + item.getDescricao());
        }
    }

    public void usarItem(int indice) 
    {
        if (indice >= 0 && indice < inventario.size()) 
        {
            Item item = inventario.get(indice);
            item.usar(this); // aplica efeito ao personagem
            inventario.remove(indice); // item consumido
        } 
        else 
        {
            System.out.println("Índice inválido!");
        }
    }

    public void receberDano(int dano) 
    {
        int danoFinal = dano - defesa;
        if (danoFinal < 0) 
        {
            danoFinal = 0;
        }

        vida -= danoFinal;

        if (vida < 0) 
        {
            vida = 0;
        }

        System.out.println(nome + " recebeu " + danoFinal + " de dano. Vida restante: " + vida);
    }

    public boolean estaVivo() 
    {
        return vida > 0;
    }
    public abstract void atacar(Personagem alvo);
}
