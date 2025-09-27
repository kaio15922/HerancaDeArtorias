package InitGame;
import java.util.HashMap;
import java.util.Map;

public class Sala {
    private String nome;
    private String descricao;
    private Map<String, Sala> caminhos;

    //Definindo constantes para direcoes:
    public static final String NORTE = "norte";
    public static final String SUL = "sul";
    public static final String LESTE = "leste";
    public static final String OESTE = "oeste";

    //Construtor da classe:
    public Sala(String nome, String descricao){
        this.nome = nome;
        this.descricao = descricao;
        this.caminhos = new HashMap<>();
    }

    public void adicionarCaminhos(String direcao, Sala destino){
        caminhos.put(direcao.toLowerCase(), destino);
    }

    public Sala getDirecoes(String direcao){
        return caminhos.get(direcao.toLowerCase());
    }

    public String getCaminhosDisponiveis(){
        if (caminhos.isEmpty()){
            return "Nao ha saidas disponiveis!";
        }

        return "Saidas: " + String.join(", ", caminhos.keySet());
    }

    //Getters
    public String getNome() {
        return nome;
    }

    public String getDescricao(){
        return this.descricao;
    }

    public void mostrarCaminhos(){
        System.out.println("Direcoes possiveis: " + caminhos.keySet());
    }

}
