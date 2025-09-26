package InitGame;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

public class Sala {
    private String descricao;
    private Map<String, Sala> saidas;

    public Sala(String descricao){
        this.descricao = descricao;
        this.saidas = new HashMap<>();
    }

    public void adicionarCaminhos(String direcao, Sala destino){
        saidas.put(direcao.toLowerCase(), destino);
    }

    public Sala getDirecoes(String direcao){
        return saidas.get(direcao.toLowerCase());
    }

    public String getSaidasDisponiveis(){
        if (saidas.isEmpty()){
            return "Nao ha saidas disponiveis!";
        }

        return "Saidas: " + String.join(", ", saidas.keySet());
    }

    //Getters
    public String getDescricao(){
        return this.descricao;
    }

    public Map<String, Sala> getSaidas(){
        return this.saidas;
    }

}
