package Combate;

import java.util.Scanner;

import Personagens.*;

public class CombateSistema 
{
    public boolean combate(Player jogador, Personagem inimigo, Scanner sc)
    {
        //Para o combate acontecer, o player e o inimgo tem que estar vivos
        while (jogador.estaVivo() && inimigo.estaVivo()) 
        {
            //Listando as ações que o player pode fazer
            System.out.println("\nSua vez! Escolha uma ação:");
            System.out.println("1 - Atacar");
            System.out.println("2 - Habilidade Especial");
            System.out.println("3 - Usar Item");
            int acao = sc.nextInt();
            sc.nextLine();

            //Caso escolha atacar
            if (acao == 1) 
            {
                jogador.atacar(inimigo);
            }

            //Usar habilidade especila -> ULT
            else if (acao == 2) 
            {
                ((Habilidades.HabilidadeEspecial) jogador.getPersonagem()).usarULT(inimigo);
            }

            //Usar item
            else if (acao == 3) 
            {
                //O player escolhe o item e usa
                jogador.mostrarInventario();
                System.out.println("Escolha o item:");
                int itemIndice = sc.nextInt();
                sc.nextLine();
                jogador.usarItem(itemIndice);
            }

            //Caso a acao nao seja reconhecida
            else 
            {
                System.out.println("Ação inválida!");
            }

            //Caso o inimigo morra
            if (!inimigo.estaVivo()) 
            {
                System.out.println("Você derrotou o inimigo!");
                return false;
            }

            System.out.println("\nVez do inimigo!");

            // Jogador eh um Player, que por sua vez tem um personagem -> Parametro de atacar
            inimigo.atacar(jogador.getPersonagem());

            //Caso o player morra
            if (!jogador.estaVivo()) 
            {
                System.out.println("Você foi derrotado!");
                return true;
            }
        }
        return true;
    }
}
