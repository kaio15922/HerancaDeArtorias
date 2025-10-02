package Personagens;
import InitGame.*;
import Itens.*;

// Player vai ter o personagem que o jogador escolher (Composicao) e a posicao inicial no mapa(1 ou 0)
public class Player 
{
    private Personagem personagemEscolhido;
    private Sala salaAtual;

    // Construtor da classe
    public Player(Personagem personagemEscolhido)
    {
        this.personagemEscolhido = personagemEscolhido;
        this.salaAtual = null;
    }

    // Getters
    // Get personagem -> vai ser necessario em algumas situacoes, como os inimigos darem dano no player
    public Personagem getPersonagem()
    {
        return this.personagemEscolhido;
    }

    public String getNome()
    {
        return personagemEscolhido.getNome();
    }

    public Sala getSalaAtual()
    {
        return this.salaAtual;
    }

    // Setters:
    public void setSalaAtual(Sala salaAtual) 
    {
        this.salaAtual = salaAtual;
    }

    // Abaixo, temos os metodos responsaveis por mover o jogador:
    public boolean mover(String direcao)
    {
        // Aqui pega a sala que vai corresponder a direcao passa na assinatura do metodo
        Sala salaProxima = this.salaAtual.getDirecoes(direcao);

        // Caso sala proxima exista
        if (salaProxima != null)
        {
            this.salaAtual = salaProxima;
            return true;
        }

        // Significa que nao achou a sala
        System.out.println("Nao consegui se deslocar!");
        return false;
    }

    // Abaixo temos metodos que irão chamar os metodos correspondenstes da classe Personagem
    public void olhar()
    {
        salaAtual.mostrarCaminhos();
    }
    // Abaixo todas os metodos vao chamar metodos de personagemEscolhido
    public void addItem(Item item)
    {
        personagemEscolhido.adicionarItem(item);
    }

    public boolean mostrarInventario()
    {
        return personagemEscolhido.mostrarInventario();
    }

    public void usarItem(int indice)
    {
        personagemEscolhido.usarItem(indice);
    }

    public boolean estaVivo()
    {
        return personagemEscolhido.estaVivo();
    }

    public void atacar(Personagem alvo)
    {
        personagemEscolhido.atacar(alvo);
    }
}
