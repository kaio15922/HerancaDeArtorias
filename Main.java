import Personagens.*;
import java.util.ArrayList;
import java.util.Scanner;
import Combate.CombateSistema;
import Inimigos.Goblin;
import Inimigos.Inimigo;
import Itens.PocaoAtaque;
import Itens.PocaoDefesa;
import Itens.PocaoVida;

public class Main 
{
    public static void main(String[] args) 
    {
        //cria o objeto da class musica e bota pra toca
        Musica musica = new Musica();
        musica.tocar("battle_theme.wav");

        // Scanner pra pegar inputs e arraylist pra guardar personagens
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
        Personagem jogador = personagens.get(escolha);

        // Cria inimigo
        Inimigo inimigo = new Goblin("Goblin Selvagem");

        PocaoAtaque poçaoAtk = new PocaoAtaque("Poção de Ataque", "Aumenta o ataque em 10", 10);
        PocaoDefesa poçaoDef = new PocaoDefesa("Poção de Defesa", "Aumenta a defesa em 5", 5);
        PocaoVida poçaoVida = new PocaoVida("Poção de Vida", "Recupera 30 de vida", 30);

        jogador.adicionarItem(poçaoVida);
        jogador.adicionarItem(poçaoDef);
        jogador.adicionarItem(poçaoAtk);

        System.out.println("Você escolheu: " + jogador.getNome());
        
        boolean morreu;

        morreu = combate.combate(jogador, inimigo, sc);
        if(morreu)
        {
            return;
        }

        sc.close();
    }
}