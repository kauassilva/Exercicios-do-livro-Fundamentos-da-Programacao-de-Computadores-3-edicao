import java.util.Scanner;

/**
 * @author kauas - 17/02/2023 Sexta
 * Livro: Fundamentos da Programação de Computadores
 * Capítulo 6, Exercício Proposto 23, pág. 186
 */

/*
Uma empresa possui ônibus com 48 lugares (24 nas janelas e 24 no corredor). Faça um programa que
utilize dois vetores para controlar as poltronas ocupadas no corredor e na janela. Considere que 0
representa poltrona desocupada e 1, poltrona ocupada.

[imagem, pág. 186]

Inicialmente todas as poltronas estarão livres. Depois disso, o programa deverá apresentar as seguintes
opções:

- vender passagem;
- mostrar mapa de ocupação do ônibus;
- encerrar.

Quando a opção escolhida for Vender Passagem, deverá ser perguntado se o usuário deseja janela ou
corredor e o número da poltrona. O programa deverá, então, dar uma das seguintes mensagens:

- Venda efetivada - se a poltrona solicitada estiver livre, marcando-a como ocupada.
- Poltrona ocupada - se a poltrona solicitada não estiver disponível para venda.
- Ônibus lotado - quando todas as poltronas já estiverem ocupadas.

Quando a opção escolhida for Mostrar Mapa de Ocupação de ônibus, deverá ser mostrada uma
listagem conforme a seguir:

[imagem, pág. 187]

Quando for escolhida a opção Encerrar, a execução do programa deverá ser finalizada.
*/

public class ExercicioResolvido23 {
    
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int qtdLugar = 24;
        int[] poltCorredor = new int[qtdLugar];
        int[] poltJanela = new int[qtdLugar];
        int op;
        int poltTipo;
        int lugar;
        boolean livre;

        // Preenche todas as poltronas como livre (0)
        for(int i=0; i<qtdLugar; i++) {
            poltCorredor[i] = 0;
            poltJanela[i] = 0;
        }

        // ========== Loop do MENU ==========
        do {
            // Valida opção do menu
            do {
                System.out.println("\n\n----- MENU -----");
                System.out.println("1 - Vender passagem");
                System.out.println("2 - Mostrar mapa de ocupação do ônibus");
                System.out.println("3 - Encerrar");
                System.out.print("Sua escolha: ");
                op = scanner.nextInt();

                if (op < 1 || op > 3) {
                    System.out.println("\nOpção inválida. Digite novamente.");
                }
            } while (op < 1 || op > 3);


            switch (op) {
                // ========== Opção: Vender passagem ==========
                case 1:
                    do {
                        System.out.println("\n\n----- Vender passagem -----");
                        System.out.println("1 - Poltrona da janela");
                        System.out.println("2 - Poltrona do corredor");
                        System.out.print("Sua escolha: ");
                        poltTipo = scanner.nextInt();

                        if (poltTipo != 1 && poltTipo !=2) {
                            System.out.println("\nOpção inválida. Digite novamente.");
                        }
                    } while (poltTipo != 1 && poltTipo !=2);


                    // ========== Poltronas da janela ==========
                    if (poltTipo == 1) {
                        System.out.println();
                        do {
                            System.out.print("Escolha o número da poltrona (1 a "+qtdLugar+"): ");
                            lugar = scanner.nextInt();

                            if (lugar < 1 || lugar > 24) {
                                System.out.println("\nLugar inválido. Digite novamente.\n");
                            }
                        } while (lugar < 1 || lugar > 24);

                        // Caso a poltrona esteja livre
                        livre = false;
                        if (poltJanela[lugar-1] == 0) {
                            System.out.println("\nVenda efetivada");
                            poltJanela[lugar-1] = 1;
                        } 
                        // Caso a poltrona esteja ocupada
                        else if (poltJanela[lugar-1] == 1) {
                            // Verifica se as poltronas da janela estão totalmente ocupadas
                            for (int i=0; i<qtdLugar; i++) {
                                if (poltJanela[i] == 0) {
                                    livre = true;
                                } 
                            }

                            // Caso as poltronas da janela não estejam totalmente ocupadas
                            if (livre == true) {
                                System.out.println("\nPoltrona ocupada");
                            } 
                            // Caso as poltronas da janela estejam totalmente ocupadas
                            else {
                                System.out.println("\nPoltronas da janela lotadas");
                            }
                        }
                    }


                    // ========== Poltronas do corredor ==========
                    else {
                        System.out.println();
                        do {
                            System.out.print("Escolha o número da poltrona (1 a "+qtdLugar+"): ");
                            lugar = scanner.nextInt();

                            if (lugar < 1 || lugar > 24) {
                                System.out.println("\nLugar inválido. Digite novamente.\n");
                            }
                        } while (lugar < 1 || lugar > 24);

                        // Caso a poltrona esteja livre
                        livre = false;
                        if (poltCorredor[lugar-1] == 0) {
                            System.out.println("\nVenda efetivada");
                            poltCorredor[lugar-1] = 1;
                        } 
                        // Caso a poltrona esteja ocupada
                        else if (poltCorredor[lugar-1] == 1) {
                            // Verifica se as poltronas do corredor estão totalmente ocupadas
                            for (int i=0; i<qtdLugar; i++) {
                                if (poltCorredor[i] == 0) {
                                    livre = true;
                                } 
                            }

                            // Caso as poltronas do corredor não estejam totalmente ocupadas
                            if (livre == true) {
                                System.out.println("\nPoltrona ocupada");
                            } 
                            // Caso as poltronas do corredor estejam totalmente ocupadas
                            else {
                                System.out.println("\nPoltronas do corredor lotadas");
                            }
                        }
                    }

                    System.out.println("---------------------------");
                    break;


                    
                // ========== Opção: Mostrar mapa de ocupação do ônibus ==========
                case 2:
                    System.out.println("\n----- Mapa de ocupação do ônibus -----");
                    // Exibi o mapa das poltronas da janela
                    System.out.println("\nPoltronas da Janela");
                    for (int i=0; i<qtdLugar; i++) {
                        if (poltJanela[i] == 0) {
                            System.out.println((i+1)+" - Livre");
                        } else {
                            System.out.println((i+1)+" - Ocupada");
                        }
                    }

                    // Exibi o mapa das poltronas do corredor
                    System.out.println("\nPoltronas do Corredor");
                    for (int i=0; i<qtdLugar; i++) {
                        if (poltCorredor[i] == 0) {
                            System.out.println((i+1)+" - Livre");
                        } else {
                            System.out.println((i+1)+" - Ocupada");
                        }
                    }

                    System.out.println("--------------------------------------");
                    break;
            }
        } while (op != 3);

    }

}
