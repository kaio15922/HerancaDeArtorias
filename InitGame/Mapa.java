package InitGame;
import java.util.*;

public class Mapa {
    private List<Sala> salas;

    public Mapa(){
        salas = new ArrayList<>();
        carregarMapa();
    }


    public void carregarMapa(){
        //Aqui a gente coloca todas as salas (40 no total)
        Sala sala1 = new Sala("Voce acorda em uma masmorra, ");
        Sala sala2 = new Sala("Um corredor com armas e joias");

        //adicionando as possiveias movimentacoes e os possiveis destinos:
        sala1.adicionarCaminhos("l", sala2);
        sala2.adicionarCaminhos("o", sala1);

        //No final a gente adiciona no ArrayList salas
        salas.add(sala1);
        salas.add(sala2);
    }

    public Sala getSalaInicial(){
        return salas.get(0);
    }
    public List<Sala> getSalas(){
        return this.salas;
    }
}
