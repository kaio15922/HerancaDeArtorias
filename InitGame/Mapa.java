package InitGame;
import java.util.*;
import DescricaoSalas.Descricoes;
import Inimigos.*;


public class Mapa 
{
    /*Atrbutos:
    * em salas temos a key String que vai ser o nome da sala
    * nesse caso toda sala tera como key "sala n", em que n
    * corresponde a numeracao do sala*/
    private Map<String, Sala> salas;
    private Sala salaInicial;
    private Descricoes descricoes;

    //Construtor da classe
    public Mapa()
    {
        this.salas = new HashMap<>();
        this.descricoes = new Descricoes();
        carregarMapa();
    }

    // Metodo que vai carregar o mapa
    public void carregarMapa()
    {

        // Aqui a gente coloca todas as salas (40 no total)
        Sala sala1 = new Sala("Vilarejo inicial", descricoes.getDescricaoSala1(), null);
        Sala sala2 = new Sala("Rota 2", descricoes.getDescricaoSala2(), new Goblin("Goblin do mato"));
        Sala sala3 = new Sala("Vilarejo Vizinho 3", descricoes.getDescricaoSala3(), null);
        Sala sala4 = new Sala("Floresta 4", descricoes.getDescricaoSala4(), new Goblin("Goblin da floresta"));
        Sala sala5 = new Sala("Rota 5", descricoes.getDescricaoSala5(), null);
        Sala sala6 = new Sala("Rota 6", descricoes.getDescricaoSala6(), new Goblin("Goblin das ruas"));
        Sala sala7 = new Sala("Lixão 7", descricoes.getDescricaoSala7(), null);
        Sala sala8 = new Sala("Rota 8", descricoes.getDescricaoSala8(), null);
        Sala sala9 = new Sala("Caverna Goblin 9", descricoes.getDescricaoSala9(), new Orc("Orc bombado"));
        Sala sala10 = new Sala("Rota 10", descricoes.getDescricaoSala10(), null);
        Sala sala11 = new Sala("Rota 11", descricoes.getDescricaoSala11(), null);
        Sala sala12 = new Sala("Acampamento 12", descricoes.getDescricaoSala12(), null);
        Sala sala13 = new Sala("Rota 13", descricoes.getDescricaoSala13(), null);
        Sala sala14 = new Sala("Rota 14", descricoes.getDescricaoSala14(), null);
        Sala sala15 = new Sala("Ponte quebrada 15", descricoes.getDescricaoSala15(), new Orc("Orc da ponte"));
        Sala sala16 = new Sala("Rota 16", descricoes.getDescricaoSala16(), null);
        Sala sala17 = new Sala("Rota 17", descricoes.getDescricaoSala17(), null);
        Sala sala18 = new Sala("Sala 18", descricoes.getDescricaoSala18(), null);
        Sala sala19 = new Sala("Rota 19", descricoes.getDescricaoSala19(), new Goblin("Goblinzin"));
        Sala sala20 = new Sala("Rota 20", descricoes.getDescricaoSala20(), new Goblin("Goblin maldito"));
        Sala sala21 = new Sala("Rota 21", descricoes.getDescricaoSala21(), null);
        Sala sala22 = new Sala("Rota 22", descricoes.getDescricaoSala22(), null);
        Sala sala23 = new Sala("Rota 23", descricoes.getDescricaoSala23(), null);
        Sala sala24 = new Sala("Cidade 24", descricoes.getDescricaoSala24(), null);
        Sala sala25 = new Sala("Arredores 25", descricoes.getDescricaoSala25(), new Goblin("Outro Goblin !?"));
        Sala sala26 = new Sala("Vítima 26", descricoes.getDescricaoSala26(), null);
        Sala sala27 = new Sala("Estátua 27", descricoes.getDescricaoSala27(), null);
        Sala sala28 = new Sala("Rota 28", descricoes.getDescricaoSala28(), null);
        Sala sala29 = new Sala("Fim do Desfiladeiro 29", descricoes.getDescricaoSala29(), new Orc("Orc do desfiladeiro"));
        Sala sala30 = new Sala("Rota 30", descricoes.getDescricaoSala30(), null);
        Sala sala31 = new Sala("Lago 31", descricoes.getDescricaoSala31(), null);
        Sala sala32 = new Sala("Rota 32", descricoes.getDescricaoSala32(), null);
        Sala sala33 = new Sala("Rota 33", descricoes.getDescricaoSala33(), new Goblin("Advinha.. outro Goblin"));
        Sala sala34 = new Sala("Rota 34", descricoes.getDescricaoSala34(), null);
        Sala sala35 = new Sala("Rota 35", descricoes.getDescricaoSala35(), new Orc("Orc pre-final boss"));
        Sala sala36 = new Sala("Acampamento de Bandidos 36", descricoes.getDescricaoSala36(), null);
        Sala sala37 = new Sala("Rota 37", descricoes.getDescricaoSala37(), null);
        Sala sala38 = new Sala("Rota 38", descricoes.getDescricaoSala38(), null);
        Sala sala39 = new Sala("Caverna 39", descricoes.getDescricaoSala39(), null);
        Sala sala40 = new Sala("Ninho do Dragão 40", descricoes.getDescricaoSala40(), new Dragao("Dragão branco dos olhos azuis"));


        // Lembre-se que sala inicial em player esta como null, precisamos setar isso:
        this.salaInicial = sala1;

        // No final a gente adiciona no Hash map salas
        adicionarSalas(sala1);
        adicionarSalas(sala2);
        adicionarSalas(sala3);
        adicionarSalas(sala4);
        adicionarSalas(sala5);
        adicionarSalas(sala6);
        adicionarSalas(sala7);
        adicionarSalas(sala8);
        adicionarSalas(sala9);
        adicionarSalas(sala10);
        adicionarSalas(sala11);
        adicionarSalas(sala12);
        adicionarSalas(sala13);
        adicionarSalas(sala14);
        adicionarSalas(sala15);
        adicionarSalas(sala16);
        adicionarSalas(sala17);
        adicionarSalas(sala18);
        adicionarSalas(sala19);
        adicionarSalas(sala20);
        adicionarSalas(sala21);
        adicionarSalas(sala22);
        adicionarSalas(sala23);
        adicionarSalas(sala24);
        adicionarSalas(sala25);
        adicionarSalas(sala26);
        adicionarSalas(sala27);
        adicionarSalas(sala28);
        adicionarSalas(sala29);
        adicionarSalas(sala30);
        adicionarSalas(sala31);
        adicionarSalas(sala32);
        adicionarSalas(sala33);
        adicionarSalas(sala34);
        adicionarSalas(sala35);
        adicionarSalas(sala36);
        adicionarSalas(sala37);
        adicionarSalas(sala38);
        adicionarSalas(sala39);
        adicionarSalas(sala40);

        // Conectando salas:
        conectarSalas(sala1.getNome(), Sala.LESTE, sala2.getNome());
        conectarSalas(sala2.getNome(), Sala.LESTE, sala3.getNome());
        conectarSalas(sala3.getNome(), Sala.LESTE, sala4.getNome());
        conectarSalas(sala4.getNome(), Sala.NORTE, sala5.getNome());
        conectarSalas(sala5.getNome(), Sala.NORTE, sala6.getNome());
        conectarSalas(sala6.getNome(), Sala.NORTE, sala7.getNome());
        conectarSalas(sala6.getNome(), Sala.OESTE, sala8.getNome());
        conectarSalas(sala8.getNome(), Sala.OESTE, sala9.getNome());
        conectarSalas(sala4.getNome(), Sala.SUL, sala10.getNome());
        conectarSalas(sala10.getNome(), Sala.SUL, sala11.getNome());
        conectarSalas(sala11.getNome(), Sala.LESTE, sala12.getNome());
        conectarSalas(sala4.getNome(), Sala.LESTE, sala13.getNome());
        conectarSalas(sala13.getNome(), Sala.LESTE, sala14.getNome());
        conectarSalas(sala14.getNome(), Sala.LESTE, sala15.getNome());
        conectarSalas(sala15.getNome(), Sala.SUL, sala16.getNome());
        conectarSalas(sala16.getNome(), Sala.OESTE, sala17.getNome());
        conectarSalas(sala17.getNome(), Sala.SUL, sala18.getNome());
        conectarSalas(sala16.getNome(), Sala.SUL, sala19.getNome());
        conectarSalas(sala19.getNome(), Sala.SUL, sala20.getNome());
        conectarSalas(sala20.getNome(), Sala.LESTE, sala21.getNome());
        conectarSalas(sala15.getNome(), Sala.NORTE, sala22.getNome());
        conectarSalas(sala22.getNome(), Sala.NORTE, sala23.getNome());
        conectarSalas(sala23.getNome(), Sala.LESTE, sala24.getNome());
        conectarSalas(sala24.getNome(), Sala.NORTE, sala25.getNome());
        conectarSalas(sala25.getNome(), Sala.LESTE, sala26.getNome());
        conectarSalas(sala24.getNome(), Sala.SUL, sala27.getNome());
        conectarSalas(sala24.getNome(), Sala.LESTE, sala28.getNome());
        conectarSalas(sala28.getNome(), Sala.LESTE, sala29.getNome());
        conectarSalas(sala29.getNome(), Sala.SUL, sala30.getNome());
        conectarSalas(sala30.getNome(), Sala.SUL, sala31.getNome());
        conectarSalas(sala31.getNome(), Sala.LESTE, sala32.getNome());
        conectarSalas(sala32.getNome(), Sala.SUL, sala33.getNome());
        conectarSalas(sala33.getNome(), Sala.LESTE, sala34.getNome());
        conectarSalas(sala34.getNome(), Sala.SUL, sala35.getNome());
        conectarSalas(sala35.getNome(), Sala.OESTE, sala36.getNome());
        conectarSalas(sala35.getNome(), Sala.SUL, sala37.getNome());
        conectarSalas(sala35.getNome(), Sala.LESTE, sala38.getNome());
        conectarSalas(sala38.getNome(), Sala.LESTE, sala39.getNome());
        conectarSalas(sala39.getNome(), Sala.LESTE, sala40.getNome());
    }

    // Metodo
    public void adicionarSalas(Sala sala)
    {
        salas.put(sala.getNome(), sala);
    }

    // Metodo para conectar salas
    public void conectarSalas(String origem, String direcao, String destino)
    {
        /*Criamos uma sala origem -> de onde o player vai sair
        * e uma sala destino -> para onde o player vai
        * ambas serao criadas de acordo com os parametros origem
        * e destino que estao na assinatura do metodo
        * Na verdade nao criamos novas salas, e sim so procuramos
        * e armazenamos nas duas variaveis criadas*/

        Sala salaOrigem = salas.get(origem);
        Sala salaDestino = salas.get(destino);

        // Caso sala origem ou sala destino nao existir
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

    // Metodo que pega o caminho oposto
    public String getDirecaoOposta(String direcao)
    {
        switch (direcao.toLowerCase())
        {
            // Retorna a direcao oposta, em relacao a passada como parametro
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

    // Getters
    public Sala getSalaFinal()
    {
        return this.salas.get("Ninho do Dragão 40");
    }
    public Sala getSalaInicial()
    {
        return this.salaInicial;
    }
}
