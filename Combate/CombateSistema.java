package Combate;

import java.util.Random;
import java.util.Scanner;

import Inimigos.*;
import Itens.*;
import Personagens.*;

public class CombateSistema 
{
    public boolean combate(Player jogador, Personagem inimigo, Scanner sc)
    {
        // Criando itens para drop
        PocaoAtaque poçaoAtk = new PocaoAtaque("Poção de Ataque", "Aumenta o ataque em 10", 10);
        PocaoDefesa poçaoDef = new PocaoDefesa("Poção de Defesa", "Aumenta a defesa em 5", 5);
        PocaoVida poçaoVida = new PocaoVida("Poção de Vida", "Recupera 30 de vida", 30);

        // Para o combate acontecer, o player e o inimgo tem que estar vivos
        while (jogador.estaVivo() && inimigo.estaVivo()) 
        {
            // Listando as ações que o player pode fazer
            try
            {
                Thread.sleep(1000);
                System.out.println("\nSua vez! Escolha uma ação:");
                System.out.println("1 - Atacar");
                System.out.println("2 - Habilidade Especial");
                System.out.println("3 - Usar Item");
                int acao = sc.nextInt();
                sc.nextLine();

                Thread.sleep(1000);
                // Caso escolha atacar
                if (acao == 1)
                {
                    jogador.atacar(inimigo);
                }

                // Usar habilidade especila -> ULT
                else if (acao == 2)
                {
                    ((Habilidades.HabilidadeEspecial) jogador.getPersonagem()).usarULT(inimigo);
                }

                // Usar item
                else if (acao == 3)
                {
                    try
                    {
                        // O player escolhe o item e usa
                        if(jogador.mostrarInventario())
                        {
                        System.out.println("Escolha o item:");
                        int itemIndice = sc.nextInt();
                        sc.nextLine();
                        jogador.usarItem(itemIndice);
                        }
                    }
                    catch(Exception e)
                    {
                        System.out.println("Moio");
                    }

                }

                // Caso a acao nao seja reconhecida
                else
                {
                    System.out.println("Ação inválida!");
                }

                // Caso o inimigo morra
                if (!inimigo.estaVivo())
                {
                    System.out.println("Você derrotou o inimigo!");

                    Random rand = new Random();
                    int num = rand.nextInt(1,4);
                    if(inimigo instanceof Goblin)
                    {
                        switch (num) 
                        {
                            case 1:
                                jogador.addItem(poçaoAtk);
                                break;
                            
                            case 2:
                                jogador.addItem(poçaoVida);
                                break;

                            case 3:
                                jogador.addItem(poçaoDef);
                                break;

                            default:
                                break;
                        }
                    }
                    if(inimigo instanceof Orc)
                    {
                        switch (num) 
                        {
                            case 1:
                                jogador.addItem(poçaoAtk);
                                jogador.addItem(poçaoAtk);
                                break;
                            
                            case 2:
                                jogador.addItem(poçaoVida);
                                jogador.addItem(poçaoVida);
                                break;

                            case 3:
                                jogador.addItem(poçaoDef);
                                jogador.addItem(poçaoDef);
                                break;

                            default:
                                break;
                        }
                    }
                    return false;
                }

                Thread.sleep(1000);
                System.out.println("\nVez do inimigo!");

                // Jogador eh um Player, que por sua vez tem um personagem -> Parametro de atacar
                inimigo.atacar(jogador.getPersonagem());

                // Caso o player morra
                if (!jogador.estaVivo())
                {
                    System.out.println("Você foi derrotado!");
                    return true;
                }
            }
            catch (InterruptedException e)
            {
                e.printStackTrace();
            }

        }
        return true;
    }
}
