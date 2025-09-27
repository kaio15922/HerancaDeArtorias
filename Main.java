import Personagens.*;
import java.util.ArrayList;
import java.util.Scanner;
import Combate.CombateSistema;
import Inimigos.Goblin;
import Itens.PocaoAtaque;
import Itens.PocaoDefesa;
import Itens.PocaoVida;
import InitGame.*;

public class Main 
{
    public static void main(String[] args) 
    {
        // Scanner pra pegar inputs e arraylist pra guardar personagens
        Game jogo;
        Scanner sc = new Scanner(System.in);
        ArrayList<Personagem> personagens = new ArrayList<>();

        // Sistema de combate
        CombateSistema combate = new CombateSistema();

        // Criação dos personagens
        personagens.add(new Mago("Gandalf"));
        personagens.add(new Barbaro("Conan"));
        personagens.add(new Arqueiro("Legolas"));

        // Escolha do personagem e tratamento caso tente escolher algo fora dos parametros
        System.out.println("=== RPG de Texto ===");
        System.out.println("Escolha seu herói:");

        for (int i = 0; i < personagens.size(); i++) 
        {
            System.out.println(i + " - " + personagens.get(i).getNome());
        }

        int escolha = -1;
        try 
        {
            escolha = sc.nextInt();
            if (escolha < 0 || escolha >= personagens.size()) 
            {
                sc.close();
                throw new IllegalArgumentException("Opção inválida!");
            }
        } 
        catch (Exception e) 
        {
            System.out.println("Entrada inválida. Encerrando jogo.");
            sc.close();
            return;
        }

        // Cria jogador
        Player jogador = new Player(personagens.get(escolha));

        //Iniciando jogo
        jogo = new Game(jogador);
        jogo.iniciarJogo();
        sc.close();
    }
}