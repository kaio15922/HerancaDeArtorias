package InitGame;
import Inimigos.Goblin;
import Itens.PocaoAtaque;
import Itens.PocaoDefesa;
import Itens.PocaoVida;
import Personagens.*;
import java.util.Scanner;
import Combate.CombateSistema;

public class Game {
    private Player player;
    private Sala spwan;
    private Mapa mapa;
    private Scanner sc;
    private CombateSistema combate;


    public Game(Player player){
        this.player = player;
        this.sc = new Scanner(System.in);
        this.combate = new CombateSistema();
    }

    //Aqui ficariam os inimigos
    public void iniciarJogo(){
        this.mapa = new Mapa();
        this.spwan = mapa.getSalaInicial();
        player.setSalaAtual(this.spwan);

        PocaoAtaque poçaoAtk = new PocaoAtaque("Poção de Ataque", "Aumenta o ataque em 10", 10);
        PocaoDefesa poçaoDef = new PocaoDefesa("Poção de Defesa", "Aumenta a defesa em 5", 5);
        PocaoVida poçaoVida = new PocaoVida("Poção de Vida", "Recupera 30 de vida", 30);

        player.addItem(poçaoVida);
        player.addItem(poçaoDef);
        player.addItem(poçaoAtk);

        System.out.println("Você escolheu: " + player.getNome());
        //Tentar mover:
        player.mover(Sala.LESTE);
        player.olhar();
        player.mover(Sala.NORTE);
        player.olhar();
        // Cria inimigo
        Personagem goblin = new Goblin("Goblin Selvagem");

        boolean morreu;
        morreu = combate.combate(player, goblin, sc);
        if(morreu)
        {
            System.out.println("Morreu Fim de jogo");;
        }
    }
}
