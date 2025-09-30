package InitGame;
import java.util.*;

import Inimigos.*;

public class Mapa 
{
    /*Atrbutos:
    * em salas temos a key String que vai ser o nome da sala
    * nesse caso toda sala tera como key "sala n", em que n
    * corresponde a numeracao do sala*/
    private Map<String, Sala> salas;
    private Sala salaInicial;

    //Construtor da classe
    public Mapa()
    {
        salas = new HashMap<>();
        carregarMapa();
    }

    //Metodo que vai carregar o mapa
    public void carregarMapa()
    {

        // Aqui a gente coloca todas as salas (40 no total)
        Sala sala1 = new Sala("Sala 1","Voce acorda em uma masmorra, ", new Goblin("Goblin da masmorra"));
        Sala sala2 = new Sala("Sala 2","Um corredor com armas e joias", new Goblin("Goblin do corredor"));
        Sala sala3 = new Sala("Sala 3","Uma sala qualquer", null);


        // Lembre-se que sala inicial em player esta como null, precisamos setar isso:
        this.salaInicial = sala1;

        // No final a gente adiciona no Hash map salas
        adicionarSalas(sala1);
        adicionarSalas(sala2);
        adicionarSalas(sala3);

        // Conectando salas:
        conectarSalas("Sala 1", Sala.LESTE, "Sala 2");
        conectarSalas("Sala 2", Sala.NORTE, "Sala 3");
    }

    //Metodo
    public void adicionarSalas(Sala sala)
    {
        salas.put(sala.getNome().toLowerCase(), sala);
        System.out.println("Sala adicionada: " + sala.getNome());
    }

    //Metodo para conectar salas
    public void conectarSalas(String origem, String direcao, String destino)
    {
        /*Criamos uma sala origem -> de onde o player vai sair
        * e uma sala destino -> para onde o player vai
        * ambas serao criadas de acordo com os parametros origem
        * e destino que estao na assinatura do metodo
        * Na verdade nao criamos novas salas, e sim so procuramos
        * e armazenamos nas duas variaveis criadas*/

        Sala salaOrigem = salas.get(origem.toLowerCase());
        Sala salaDestino = salas.get(destino.toLowerCase());

        //Caso sala origem ou sala destino nao existir
        if (salaOrigem == null || salaDestino == null){
            System.out.println("Sala nao encontrada -> impossivel realizar conexao");
        } 
        else
        {
            /*Aqui adicionamos um caminho em sala origem,
            *pegamos a direcao e a sala destino
            *Ambas variaveis presentes na assinatura do metodo*/
            salaOrigem.adicionarCaminhos(direcao, salaDestino);

            // Pegando caminho oposto:
            salaDestino.adicionarCaminhos(getDirecaoOposta(direcao), salaOrigem);
        }

    }

    //Metodo que pega o caminho oposto
    public String getDirecaoOposta(String direcao)
    {
        switch (direcao.toLowerCase())
        {
            //Retorna a direcao oposta, em relacao a passada como parametro
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

    //Getters
    public Sala getSalaFinal(){
        return salas.get("sala 3");
    }
    public Sala getSalaInicial()
    {
        return this.salaInicial;
    }
}
