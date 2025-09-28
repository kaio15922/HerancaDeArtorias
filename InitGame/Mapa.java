package InitGame;
import java.util.*;

public class Mapa 
{
    private Map<String, Sala> salas;
    private Sala salaInicial;

    public Mapa()
    {
        salas = new HashMap<>();
        carregarMapa();
    }


    public void carregarMapa()
    {
        //Aqui a gente coloca todas as salas (40 no total)
        Sala sala1 = new Sala("Sala 1","Voce acorda em uma masmorra, ");
        Sala sala2 = new Sala("Sala 2","Um corredor com armas e joias");

        //Lembre-se que sala inicial em player esta como null, precisamos setar isso:
        this.salaInicial = sala1;

        //No final a gente adiciona no Hash map salas
        adicionarSalas(sala1);
        adicionarSalas(sala2);

        //Conectando salas:
        conectarSalas("Sala 1", Sala.LESTE, "Sala 2");
    }

    public void adicionarSalas(Sala sala)
    {
        salas.put(sala.getNome().toLowerCase(), sala);
        System.out.println("Sala adicionada: " + sala.getNome());
    }

    public void conectarSalas(String origem, String direcao, String destino)
    {
        Sala salaOrigem = salas.get(origem.toLowerCase());
        Sala salaDestino = salas.get(destino.toLowerCase());

        if (salaOrigem == null || salaDestino == null){
            System.out.println("Sala nao encontrada -> impossivel realizar conexao");
        } 
        else
        {
            salaOrigem.adicionarCaminhos(direcao, salaDestino);

            //Pegando caminho oposto:
            salaDestino.adicionarCaminhos(getDirecaoOposta(direcao), salaOrigem);
        }

    }

    public String getDirecaoOposta(String direcao)
    {
        switch (direcao.toLowerCase())
        {
            case "norte":
                return Sala.SUL;
            case "sul":
                return Sala.NORTE;
            case "leste":
                return Sala.OESTE;
            case "oeste":
                return Sala.LESTE;
            default:
                return direcao;
        }
    }

    public Sala getSalaInicial()
    {
        return this.salaInicial;
    }
}
