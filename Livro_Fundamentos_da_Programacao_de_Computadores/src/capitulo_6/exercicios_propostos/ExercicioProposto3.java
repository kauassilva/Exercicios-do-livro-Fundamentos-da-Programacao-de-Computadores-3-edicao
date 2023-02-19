/**
 * @author kauas - 18/02/2023 Sábado
 * Livro: Fundamentos da Programação de Computadores
 * Capítulo 6, Exercício Proposto 3, pág. 190
 */

/*
Faça um programa para controlar o estoque de mercadorias de uma empresa. Inicialmente, o programa
deverá preencher dois vetores com dez posições cada, onde o primeiro corresponde ao código do produto e o
segundo, ao total desse produto em estoque. Logo após, o programa deverá ler um conjunto indeterminado
de dados contendo o código de um cliente e o código do produto que ele deseja comprar, juntamente com a
quantidade. Código do cliente igual a zero indica fim do programa. O programa deverá verificar:

- se o código do produto solicitado existe. Se existir, tentar atender ao pedido; caso contrário, exibir
  mensagem 'Código inexsistente';
- cada pedido feito por um cliente só pode ser atendido integralmente. Caso isso não seja possível,
  escrever a mensagem 'Não temos estoque suficiente dessa mercadoria'. Se puder atendê-lo, escrever
  a mensagem 'Pedido atendido. Obrigado e volte sempre';
- efetuar a atualização do estoque somente se o pedido for atendido integralmente;
- no final do programa, escrever os códigos dos produtos com seus respectivos estoques já atualizados.
*/

package capitulo_6.exercicios_propostos;

import java.util.Scanner;

public class ExercicioProposto3 {
    
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int[] codigos = new int[2];
        int[] totalEstoque = new int[codigos.length];
        int codCliente, codProduto, qtdProduto;
        boolean existe;


        // ========== Preencher os dados dos produtos ==========
        System.out.println();
        for (int i=0; i<codigos.length; i++) {
            
            // Loop para preencher o vetor de códigos
            do {
                System.out.print("Digite o "+(i+1)+"º código do produto: ");
                codigos[i] = scanner.nextInt();

                existe = false;
                for (int j=0; j<i; j++) {
                    if (codigos[i] == codigos[j]) {
                        existe = true;
                    }
                }

                if (existe == true) {
                    System.out.println("\nO código deste produto já existe. Digite novamente\n");
                }
            } while (existe == true);

            // Loop para preencher o vetor de quantidade de produtos
            do {
                System.out.print("Digite o total deste produto em estoque: ");
                totalEstoque[i] = scanner.nextInt();

                if (totalEstoque[i] < 0) {
                    System.out.println("\nQuantidade inválida. Digite novamente.\n");
                }
            } while (totalEstoque[i] < 0);
        }


        // ========== Lê os dados de compra de um produto ==========
        do {        
            System.out.print("\n\nCódigo do cliente (0 para encerrar): ");
            codCliente = scanner.nextInt();

            // Caso o usuário não decida encerrar o sistema
            if (codCliente != 0) {
                // Verifica se o código do produto existe
                do {
                    System.out.print("Código do produto desejado: ");
                    codProduto = scanner.nextInt();
    
                    existe = false;
                    for (int i=0; i<codigos.length; i++) {
                        if (codProduto == codigos[i]) {
                            existe = true;

                            do {
                                System.out.print("Quantidade que deseja comprar: ");
                                qtdProduto = scanner.nextInt();
                
                                if (qtdProduto <= 0) {
                                    System.out.println("\nQuantidade inválida. Digite novamente.\n");
                                }
                            } while (qtdProduto <= 0);

                            // Verifica se o estoque possui a quantidade desejada do produto escolhido
                            if (qtdProduto <= totalEstoque[i]) {
                                totalEstoque[i] -= qtdProduto;
                                System.out.println("\nPedido atendido. Obrigado e volte sempre.");
                            } else {
                                System.out.println("\nNão temos estoque suficiente dessa mercadoria.");
                            }

                            break;
                        }
                    }
    
                    // Caso o código do produto não exista
                    if (!existe) {
                        System.out.println("\nCódigo inexistente\n");
                    }
                } while (existe == false);
            }    
        } while (codCliente != 0);

        System.out.println("\nEstoques atualizados: ");

        for (int i=0; i<codigos.length; i++) {
            System.out.println("Código: "+codigos[i]+" - Estoque: "+totalEstoque[i]);
        }

    }

}
