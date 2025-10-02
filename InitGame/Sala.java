package InitGame;

import Personagens.Player;
import Combate.CombateSistema;
import Personagens.Personagem;
import java.util.*;

public class Sala 
{
    // Atributos
    private String nome;
    private String descricao;
    private Map<String, Sala> caminhos;
    private Personagem inimigo;
    private CombateSistema combate;

    // Definindo constantes para direcoes:
    public static final String NORTE = "norte";
    public static final String SUL = "sul";
    public static final String LESTE = "leste";
    public static final String OESTE = "oeste";

    // Construtor da classe:
    public Sala(String nome, String descricao, Personagem inimigo)
    {
        this.nome = nome;
        this.descricao = descricao;
        this.caminhos = new HashMap<>();
        this.inimigo = inimigo;
        combate = new CombateSistema();
    }

    /*Aqui adicionamos os caminhos:
    * Direcao -> Sala destino*/
    public void adicionarCaminhos(String direcao, Sala destino)
    {
        //É interessante deixar tudo em minusculo ou maisculo para facilitar a busca.
        caminhos.put(direcao.toLowerCase(), destino);
    }

    // Getters

    // Vai listar A sala com base na direcao
    public Sala getDirecoes(String direcao)
    {
        return caminhos.get(direcao.toLowerCase());
    }

    public String getCaminhosDisponiveis()
    {
        if (caminhos.isEmpty()){
            return "Nao ha saidas disponiveis!";
        }

        return "Saidas: " + String.join(", ", caminhos.keySet());
    }

    // Método pra verificar se tem inimigos na sala
    public boolean temInimigo(Player jogador, Scanner sc)
    {
        Personagem inimigo = getInimigo();
        if(inimigo == null)
        {
            return false;
        }
    
        boolean taMorto = combate.combate(jogador, inimigo, sc);
        if(taMorto)
        {
            return true;
        }
        else
        {
            setInimigo(null);
            return false;
        }
    }

    public String getNome() 
    {
        return nome;
    }
    public String getDescricao()
    {
        return this.descricao;
    }
    public Personagem getInimigo()
    {
        return inimigo;
    }
    public CombateSistema getCombate() 
    {
        return combate;
    }

    // Setter
    public void setInimigo(Personagem inimigo)
    {
        this.inimigo = inimigo;
    }

    // Mostrar as direcoes que o player pode seguir com base em uma sala
    public void mostrarCaminhos()
    {
        System.out.println("Direcoes possiveis: " + caminhos.keySet());
    }

    // Mostrar o inimigo:
    public void mostrarInimigo()
    {
        if (this.getInimigo() == null)
        {
            System.out.println("Nao ha inimigos");
        }
        else 
        {
            System.out.println("Ha um inimigo aqui: " + this.inimigo.getNome());
        }
    }
}
