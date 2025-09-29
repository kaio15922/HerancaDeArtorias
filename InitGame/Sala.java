package InitGame;
import java.util.HashMap;
import java.util.Map;

public class Sala 
{
    //Atributos
    private String nome;
    private String descricao;
    private Map<String, Sala> caminhos;

    // Definindo constantes para direcoes:
    public static final String NORTE = "norte";
    public static final String SUL = "sul";
    public static final String LESTE = "leste";
    public static final String OESTE = "oeste";

    // Construtor da classe:
    public Sala(String nome, String descricao)
    {
        this.nome = nome;
        this.descricao = descricao;
        this.caminhos = new HashMap<>();
    }

    /*Aqui adicionamos os caminhos:
    * Direcao -> Sala destino*/
    public void adicionarCaminhos(String direcao, Sala destino)
    {
        //É interessante deixar tudo em minusculo ou maisculo para facilitar a busca.
        caminhos.put(direcao.toLowerCase(), destino);
    }

    //Vai listar A sala com base na direcao
    public Sala getDirecoes(String direcao)
    {
        return caminhos.get(direcao.toLowerCase());
    }

    //Getters
    public String getNome() 
    {
        return nome;
    }

    public String getDescricao()
    {
        return this.descricao;
    }

    //Mostrar as direcoes que o player pode seguir com base em uma sala
    public void mostrarCaminhos()
    {
        System.out.println("Direcoes possiveis: " + caminhos.keySet());
    }
}
