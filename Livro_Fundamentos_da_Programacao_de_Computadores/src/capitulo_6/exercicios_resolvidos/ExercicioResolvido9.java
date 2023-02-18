/**
 * @author kauas - 27/01/2023 Sexta
 * Livro: Fundamentos da Programação de Computadores
 * Capítulo 6, Exercício Resolvido 9, pág. 168
 */

/*
Faça um programa que efetue reserva de passagens aéreas de uma companhia. O programa deverá
ter informações sobre os voos (número, origem e destino) e o número de lugares disponíveis para
doze aviões (um vetor para cada um desses dados). Depois da leitura, o programa deverá
apresentar um menu com as seguintes opções:

- consultar;
- efetuar reserva; e
- sair.

Quando a opção escolhida for Consultar, deverá ser disponibilizado mais um menu com as seguintes
opções:

- por número do voo;
- por origem; e
- por destino.

Quando a opção escolhida for Efetuar reserva, deverá ser perguntado o número do voo em que a
pessoa deseja viajar. O programa deverá dar as seguintes respostas:

- reserva confirmada - caso exista o voo e lugar disponível, dando baixa nos lugares disponíveis;
- voo lotado - caso não exista lugar disponível nesse voo;
- voo inexistente - caso o código do voo não exista.

A opção Sair é a única que permite encerrar a execução do programa. Sendo assim, após cada
operação de consulta ou reserva, o programa volta ao menu principal.
*/

import java.util.Scanner;

public class ExercicioResolvido9 {
  
  public static void main (String[] args) {

    Scanner scanner = new Scanner(System.in);

		int vooQtd = 12;

		int[] vooNum = new int[vooQtd];
		int[] vooLugarDisp = new int[vooQtd];
		String[] vooOrigem = new String[vooQtd];
		String[] vooDestino = new String[vooQtd];

    int opcao1, opcao2;
		int numVoo;
		int i;
		String localVoo;

		// ========== Loop para preencher os dados dos voos ==========
		for (i=0; i<vooQtd; i++) {
			System.out.println("\n--- Inserir dados do voo ("+(i+1)+"/"+vooQtd+") ---\n");

			// validar número do voo
			do { 
				System.out.print("Digite o número do voo: ");
				vooNum[i] = scanner.nextInt();
				scanner.nextLine();

				if (vooNum[i] < 0) {
					System.out.println("\nNúmero inválido!\n");
				}
			} while (vooNum[i] < 0);

			System.out.print("Digite o local de origem do voo: ");
			vooOrigem[i] = scanner.nextLine();

			System.out.print("Digite o local de destino do voo: ");
			vooDestino[i] = scanner.nextLine();

			// validar quantidade de lugares no voo
			do { 
				System.out.print("Digite a quantidade de lugares disponíveis no voo: ");
				vooLugarDisp[i] = scanner.nextInt();

				if (vooLugarDisp[i] < 0) {
					System.out.println("\nQuantidade inválida\n");
				}
			} while (vooLugarDisp[i] < 0);
		}



		do {
			// validar opção do menu principal
			do {
				System.out.println("\n\n--- Menu principal ---");
				System.out.println("1 - Consultar voo\n2 - Reserva voo\n3 - Sair");
				System.out.print("Sua resposta: ");
				opcao1 = scanner.nextInt();

				if (opcao1>3 || opcao1<1) {
					System.out.println("\nOpção inválida!");
				}
			} while (opcao1>3 || opcao1<1);

			// ========== Opção Consultar voo ==========
			if (opcao1 == 1) {
				// validar opção 2
				do {
					System.out.println("\n\n--- Escolha um filtro ---");
					System.out.println("1 - Número do voo\n2 - Local de origem do voo\n3 - Local de destino do voo");
					System.out.print("Sua resposta: ");
					opcao2 = scanner.nextInt();
					scanner.nextLine();

					if (opcao2>3 || opcao2<1) {
						System.out.println("\nOpção inválida!");
					}
				} while (opcao2>3 || opcao2<1);

				// Processo do filtro: 1 - Número do voo
				if (opcao2 == 1) {
					System.out.print("\nDigite o número de voo: ");
					numVoo = scanner.nextInt();

					i = 0;
					while (i<=vooQtd && vooNum[i]!=numVoo) {
						i++;
					}

					if (i > vooQtd) {
						System.out.println("\n\nVoo inexistente!");
					} else {
						System.out.println("\n\nNúmero do voo: "+vooNum[i]);
						System.out.println(vooOrigem[i]+" -> "+vooDestino[i]);
						System.out.println("Quantidade de lugares disponíveis: "+vooLugarDisp[i]);
					}
				}

				// Processo do filtro: 2 - Local de origem do voo
				if (opcao2 == 2) {
					System.out.print("\nDigite o local de origem: ");
					localVoo = scanner.nextLine();

					for (i=0; i<vooQtd; i++) {
						if (localVoo.equalsIgnoreCase(vooOrigem[i])) {
							System.out.println("\n\nNúmero do voo: "+vooNum[i]);
							System.out.println(vooOrigem[i]+" -> "+vooDestino[i]);
							System.out.println("Quantidade de lugares disponíveis: "+vooLugarDisp[i]);
						}
					}
				}

				// Processo do filtro: 3 - Local de destino do voo
				if (opcao2 == 3) {
					System.out.print("\nDigite o local de destino: ");
					localVoo = scanner.nextLine();

					for (i=0; i<vooQtd; i++) {
						if (localVoo.equalsIgnoreCase(vooDestino[i])) {
							System.out.println("\n\nNúmero do voo: "+vooNum[i]);
							System.out.println(vooOrigem[i]+" -> "+vooDestino[i]);
							System.out.println("Quantidade de lugares disponíveis: "+vooLugarDisp[i]);
						}
					}
				}
			}
			
			// ========== Opção Reservar voo ==========
			if (opcao1 == 2) {
				System.out.print("\n\nDigite o número do voo desejado: ");
				numVoo = scanner.nextInt();

				i=0;
				while (i<=vooQtd && vooNum[i] != numVoo) {
					i++;
				}

				if (i > vooQtd) {
					System.out.println("\n\nNúmero de voo não encontrado!");
				} else {
					if (vooLugarDisp[i] <= 0) {
						System.out.println("\n\nVoo lotado!");
					} else {
						vooLugarDisp[i] =- 1;
						System.out.println("Reserva confirmada!");
					}
				}
			}
		} while (opcao1 != 3);

  }
}
