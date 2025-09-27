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

    //Abaixo, temos os metodos responsaveis por mover o jogador:
    public boolean mover(String direcao){
        Sala salaProxima = salaAtual.getDirecoes(direcao);

        if (salaProxima != null){
            salaAtual = salaProxima;
            System.out.println("Deslocamento feito com sucesso!");
            return true;
        }

        System.out.println("Nao consegui se deslocar!");
        return false;
    }

    public void olhar(){
        System.out.println(salaAtual.getNome());
        System.out.println(salaAtual.getDescricao());
        salaAtual.mostrarCaminhos();
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
