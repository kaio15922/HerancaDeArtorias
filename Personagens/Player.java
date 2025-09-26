package Personagens;
import InitGame.*;
import Itens.*;

//Player vai ter o personagem que o jogador escolher (Composicao) e a posicao inicial no mapa(1 ou 0)
public class Player {
    private Personagem personagemEscolhido;
    private Sala salaAtual;

    //Construtor da classe
    public Player(Personagem personagemEscolhido){
        this.personagemEscolhido = personagemEscolhido;
        this.salaAtual = null;
    }

    //Getters
    //Get personagem -> vai ser necessario em algumas situacoes, como os inimigos darem dano no player
    public Personagem getPersonagem(){
        return this.personagemEscolhido;
    }

    public String getNome(){
        return personagemEscolhido.getNome();
    }

    //Setters:
    public void setSalaAtual(Sala salaAtual) {
        this.salaAtual = salaAtual;
    }

    //Abaixo todas os metodos vao chamar metodos de personagemEscolhido
    public void addItem(Item item){
        personagemEscolhido.adicionarItem(item);
    }

    public void mostrarInventario(){
        personagemEscolhido.mostrarInventario();
    }

    public void usarItem(int indice){
        personagemEscolhido.usarItem(indice);
    }

    public void recberDano(int dano){
        personagemEscolhido.receberDano(dano);
    }

    public boolean estaVivo(){
        return personagemEscolhido.estaVivo();
    }

    public void atacar(Personagem alvo){
        personagemEscolhido.atacar(alvo);
    }
}
