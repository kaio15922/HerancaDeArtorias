package InitGame;
import Inimigos.Goblin;
import Itens.PocaoAtaque;
import Itens.PocaoDefesa;
import Itens.PocaoVida;
import Personagens.*;
import java.util.Scanner;
import Combate.CombateSistema;

public class Game 
{
    //Atributos
    private Player player;
    private Sala spwan;
    private Mapa mapa;
    private Scanner sc;
    private CombateSistema combate;


    //Construtor da classe
    public Game(Player player)
    {
        this.player = player;
        this.sc = new Scanner(System.in);
        this.combate = new CombateSistema();
    }

    //Metodo interno para pegar a direcao escolhida pelo jogador:
    public void tentarMover(){
        System.out.println("-----------------------------------------------------");
        player.olhar();
        System.out.println("Escolha uma direcao:");
        String escolha = sc.nextLine();
        player.mover(escolha);
    }

    // Aqui ficariam os inimigos
    public void iniciarJogo()
    {
        //Inicializando o mapa e definindo o spwan
        this.mapa = new Mapa();
        this.spwan = mapa.getSalaInicial();
        player.setSalaAtual(this.spwan);

        //Criando poções e adicionando ao inventario
        PocaoAtaque poçaoAtk = new PocaoAtaque("Poção de Ataque", "Aumenta o ataque em 10", 10);
        PocaoDefesa poçaoDef = new PocaoDefesa("Poção de Defesa", "Aumenta a defesa em 5", 5);
        PocaoVida poçaoVida = new PocaoVida("Poção de Vida", "Recupera 30 de vida", 30);

        player.addItem(poçaoVida);
        player.addItem(poçaoDef);
        player.addItem(poçaoAtk);

        System.out.println("Você escolheu: " + player.getNome());

        //Rodando o mapa, so ira parar quando a sala atual do player for igual a sala final (sala 40)
        while (true){
            // Interessante verificar a condicao de parada no inicio (no caso se a sala atual do player eh a sala final)
            if (player.getSalaAtual() == mapa.getSalaFinal()){
                Personagem goblin = new Goblin("Goblin Selvagem");

                boolean morreu;
                morreu = combate.combate(player, goblin, sc);
                if(morreu)
                {
                    System.out.println("Morreu Fim de jogo");;
                }

                System.out.println("Voce chegou ao fim !");
                break;
            }

            // Tentar mover:
            tentarMover();


        }

    }
}
