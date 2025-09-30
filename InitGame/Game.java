package InitGame;
import Itens.PocaoAtaque;
import Itens.PocaoDefesa;
import Itens.PocaoVida;
import Personagens.*;
import java.util.Scanner;

public class Game 
{
    private Player player;
    private Sala spwan;
    private Mapa mapa;
    private Scanner sc;

    public Game(Player player)
    {
        this.player = player;
        this.sc = new Scanner(System.in);
    }

    // Start
    public void iniciarJogo()
    {
        this.mapa = new Mapa();
        this.spwan = mapa.getSalaInicial();
        player.setSalaAtual(this.spwan);

        PocaoAtaque poçaoAtk = new PocaoAtaque("Poção de Ataque", "Aumenta o ataque em 10", 10);
        PocaoDefesa poçaoDef = new PocaoDefesa("Poção de Defesa", "Aumenta a defesa em 5", 5);
        PocaoVida poçaoVida = new PocaoVida("Poção de Vida", "Recupera 30 de vida", 30);

        player.addItem(poçaoVida);
        player.addItem(poçaoDef);
        player.addItem(poçaoAtk);

        // Sistema de andada
        while (true) 
        {
            verificarInimigo();

            System.out.println("\n=== Você está na " + player.getSalaAtual().getNome() + " ===");
            System.out.println(player.getSalaAtual().getDescricao());
            System.out.println(player.getSalaAtual().getCaminhosDisponiveis());

            System.out.print("Digite a direção para se mover (norte, sul, leste, oeste): ");
            String direcao = sc.nextLine().toLowerCase();

            player.mover(direcao);
        }
        
    }

    // Verificador pra ver se tem inimigo na sala
    private void verificarInimigo() 
    {
    boolean morreu = player.getSalaAtual().temInimigo(player, sc);
    if(morreu) 
    {
        System.out.println("Fim de jogo!");
        System.exit(0);
    }
}

}
