import Personagens.*;
import java.util.ArrayList;
import java.util.Scanner;
import InitGame.*;
import Musica.Musiquinha;

public class Main 
{
    public static void main(String[] args) 
    {
        //cria o objeto da class musica e bota pra toca
        Musiquinha musica = new Musiquinha();
        musica.tocar("battle_theme.wav");

        // Scanner pra pegar inputs e arraylist pra guardar personagens
        Game jogo;
        Scanner sc = new Scanner(System.in);
        ArrayList<Personagem> personagens = new ArrayList<>();

        // Sistema de combate

        // Criação dos personagens
        personagens.add(new Mago("Gandalf"));
        personagens.add(new Barbaro("Conan"));
        personagens.add(new Arqueiro("Legolas"));

        // Escolha do personagem e tratamento caso tente escolher algo fora dos parametros
        System.out.println("=== RPG de Texto ===");
        System.out.println("Escolha seu herói:");

        //Lista todas as opcoes de personagens que o player pode escolher
        for (int i = 0; i < personagens.size(); i++) 
        {
            System.out.println(i + " - " + personagens.get(i).getNome());
        }

        //Tratamento de erros:
        int escolha = -1;

        //Caso player escolha uma opcao negativa ou um valor maior que o numero de personagens possiveis -> vai dar error!
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

        // Iniciando jogo
        jogo = new Game(jogador);
        jogo.iniciarJogo();
        sc.close();
    }
}