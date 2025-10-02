package Personagens;

import java.util.ArrayList;

import Itens.Item;
import Itens.PocaoAtaque;
import Itens.PocaoDefesa;

public abstract class Personagem 
{
    // Atributos de Personagem
    private String nome;
    private int vida;
    private int ataque;
    private int defesa;
    private ArrayList<Item> inventario;

    // Construtor da classe, precisamos apenas de 4 parametros, pois inventario inicia vazio
    public Personagem(String nome, int vida, int ataque, int defesa) 
    {
        this.nome = nome;
        this.vida = vida;
        this.ataque = ataque;
        this.defesa = defesa;
        this.inventario = new ArrayList<>();
    }

    // Getters que serao necessarios para o codigo:
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

    // Metodos:

    public void adicionarItem(Item item) 
    {
        inventario.add(item);
        if(item instanceof PocaoAtaque)
        {
            System.out.println("Você recebeu uma poção de ataque!");
        }
        else if(item instanceof PocaoDefesa)
        {
            System.out.println("Você recebeu uma poção de defesa!");
        }
        else
        {
            System.out.println("Você recebeu uma poção de vida!");
        }
    }

    public boolean mostrarInventario() 
    {
        // Tratando inventario vazio
        if(inventario.isEmpty())
        {
            System.out.println("Você perdeu sua vez, não itens no seu inventário! Derrote mais inimigos para conseguir itens.");
            return false;
        }
        else
        {
            System.out.println("=== Inventário de " + this.nome + " ===");
            for (int i = 0; i < this.inventario.size(); i++)
            {
                Item item = this.inventario.get(i);
                System.out.println(i + " - " + item.getNome() + ": " + item.getDescricao());
            }
            return true;
        }
    }

    public void usarItem(int indice) 
    {
        // Verificando se indice eh maior que zero e se ehh menor que o tamanho do inventario (nao tem como indice ser 3 se o inventario so tem 2 items)
        if(indice >= 0 && indice < this.inventario.size())
        {
            Item item = inventario.get(indice);
            item.usar(this); // aplica efeito ao personagem
            this.inventario.remove(indice); // item consumido
        } 
        else 
        {
            System.out.println("Índice inválido!");
        }
    }

    public void receberDano(int dano) 
    {
        // O dano tomado pelo Player vai depender dos seus pontos em defesa
        int danoFinal = dano - this.defesa;

        // Nao faz sentido o dano ser -20 (so acontecera se a defesa tiver mais pontos que o ataque sofrido)
        if(danoFinal < 0)
        {
            danoFinal = 0;
        }

        // Recebendo dano
        this.vida -= danoFinal;

        // Nao faz sentido a vida ser -20, por exemplo. Entao caso a vida seja menor que zero -> morreu!
        if(this.vida < 0)
        {
            this.vida = 0;
        }

        // Exibindo dano
        System.out.println(this.nome + " recebeu " + danoFinal + " de dano. Vida restante: " + this.vida);
    }

    // Um boolean que vai retornar true -> se estiver vivo ou Fale-> se morrer
    public boolean estaVivo() 
    {
        return this.vida > 0;
    }

    // Funcao abstrat que todos os personagens deverao implementar -> Cada um executa um ataque com dano diferente
    public abstract void atacar(Personagem alvo);
}
