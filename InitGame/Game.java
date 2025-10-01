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

    //Mostrar nome e descricao da sala
    public void infoSala(){

        //Tenta exibir com uma pausa
        try{
            System.out.println("Voce esta em: " + player.getSalaAtual().getNome());
            Thread.sleep(1000);
            System.out.println(player.getSalaAtual().getDescricao());
        }catch (InterruptedException e){
            e.printStackTrace();
        }

    }

    //Metodo interno para pegar a direcao escolhida pelo jogador:
    public void tentarMover(){
        System.out.println("------------------------------------------------------------------");
        player.olhar();
        System.out.println("Escolha uma direcao:");
        String escolha = sc.nextLine();
        player.mover(escolha);
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
            //Verifica se chegou na ultima sala
            if (player.getSalaAtual() == mapa.getSalaFinal()){
                System.out.println("------------------------------------------------------------------");
                infoSala();
                player.getSalaAtual().mostrarInimigo();
                verificarInimigo();
                System.out.println("Voce chegou ao fim !");
                break;
            }

            try{
                System.out.println("------------------------------------------------------------------");
                infoSala();
                Thread.sleep(1000);
                player.getSalaAtual().mostrarInimigo();
                verificarInimigo();
                Thread.sleep(1000);
                tentarMover();
            }catch (InterruptedException e){
                e.printStackTrace();
            }

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
