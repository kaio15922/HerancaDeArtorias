package Combate;

import java.util.Scanner;

import Inimigos.Inimigo;
import Personagens.Personagem;

public class CombateSistema 
{
    public boolean combate(Personagem jogador, Inimigo inimigo, Scanner sc)
    {
        while (jogador.estaVivo() && inimigo.estaVivo()) 
        {
            System.out.println("\nSua vez! Escolha uma ação:");
            System.out.println("1 - Atacar");
            System.out.println("2 - Habilidade Especial");
            System.out.println("3 - Usar Item");
            int acao = sc.nextInt();

            if (acao == 1) 
            {
                jogador.atacar(inimigo);
            } 
            else if (acao == 2 && jogador instanceof Habilidades.HabilidadeEspecial) 
            {
                ((Habilidades.HabilidadeEspecial) jogador).usarULT(inimigo);
            } 
            else if (acao == 3) 
            {
                jogador.mostrarInventario();
                System.out.println("Escolha o item:");
                int itemIndice = sc.nextInt();
                jogador.usarItem(itemIndice);
            }
            else 
            {
                System.out.println("Ação inválida!");
            }

            if (!inimigo.estaVivo()) 
            {
                System.out.println("Você derrotou o inimigo!");
                return false;
            }

            System.out.println("\nVez do inimigo!");
            inimigo.atacar(jogador);

            if (!jogador.estaVivo()) 
            {
                System.out.println("Você foi derrotado!");
                return true;
            }
        }
        return true;
    }
}
