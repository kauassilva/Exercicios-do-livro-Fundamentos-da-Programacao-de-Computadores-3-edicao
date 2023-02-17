import java.util.Scanner;

/**
 * @author kauas - 17/02/2023 Sexta
 * Livro: Fundamentos da Programação de Computadores
 * Capítulo 6, Exercício Proposto 22, pág. 185
 */

/*
Faça um programa que simule um controle bancário. Para tanto, devem ser lidos os códigos de dez
contas e seus respectivos saldos. Os códigos devem ser armazenados em um vetor de números inteiros
(não pode haver mais de uma conta com o mesmo código) e os saldos devem ser armazenados em um
vetor de números reais. O saldo deverá ser cadastrado na mesma posição do código. Por exemplo, se
a conta 504 foi armazenada na quinta posição do vetor de códigos, seu saldo deverá ficar na quinta
posição do vetor de saldos. Depois de fazer a leitura dos valores, deverá aparecer o seguinte menu na
tela:

1. Efetuar depósito
2. Efetuar saque
3. Consultar o ativo bancário, ou seja, o somatório dos saldos de todos os clientes
4. Finalizar o programa

- para efetuar depósito, deve-se solicitar o código da conta e o valor a ser depositado. Se a conta não
  estiver cadastrada, deverá aparecer a mensagem 'Conta não encontrada' e voltar ao menu. Se a conta
  existir, atualizar seu saldo;
- para efetuar saque, deve-se solicitar o código da conta e o valor a ser sacado. Se a conta não
  estiver cadastrada, deverá aparecer a mensagem 'Conta não encontrada' e voltar ao menu. Se a conta
  existir, verificar se o seu saldo é suficiente para cobrir o saque. (Estamos supondo que a conta não
  possa ficar com saldo negativo.) Se o saldo for suficiente, realizar o saque e voltar ao menu. Caso
  contrário, mostrar a mensagem 'Saldo insuficiente' e voltar ao menu;
- para consultar o ativo bancário, deve-se somar o saldo de todas as contas do banco. Depois de
  mostrar esse valor, voltar ao menu;
- o programa só termina quando for digitada a opção 4 - Finalizar o programa.
*/

public class ExercicioResolvido22 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int[] codigos = new int[10];
        double[] saldos = new double[10];
        boolean repetido, existe;
        int op;
        int codigoAtual;
        double valor;


        // ========== Loop para preencher o vetor de códigos ==========
        repetido = false;
        System.out.println();
        for (int i=0; i<codigos.length; i++) {
            System.out.print("Digite o código da "+(i+1)+"ª conta: ");
            codigos[i] = scanner.nextInt();

            // Verifica se o código já existe
            for (int j=0; j<i; j++) {
                if (codigos[i] == codigos[j]) {
                    repetido = true;
                    break; // Para quando achar o primeiro código repetido
                }
            }

            if (repetido) {
                System.out.println("\nCódigo já existe. Digite novamente.");
                i--;
                repetido = false;
            }
        }


        // ========== Loop para preencher o vetor de saldos ==========
        System.out.println();
        for (int i=0; i<saldos.length; i++) {
            do {
                System.out.print("Digite o saldo da "+(i+1)+"ª conta: R$ ");
                saldos[i] = scanner.nextDouble();

                if (saldos[i] < 0) {
                    System.out.println("\nSaldo inválido. Digite novamente.");
                }
            } while (saldos[i] < 0);
        }


        // ========== Loop do menu ==========
        do {
            do {
                System.out.println("\n\n----- MENU -----");
                System.out.println("1. Efetuar depósito");
                System.out.println("2. Efetuar saque");
                System.out.println("3. Consultar o ativo bancário");
                System.out.println("4. Finalizar o programa");
                System.out.print("Sua escolha: ");
                op = scanner.nextInt();

                if (op < 1 || op > 4) {
                    System.out.println("\nOpção inválida. Digite novamente.");
                }
            } while (op < 1 || op > 4);
            
            existe = false;
            switch (op) {
                // Opção: Efetuar depósito
                case 1:
                    System.out.println("\n\n----- Efetuar depósito ------");
                    System.out.print("Digite o código da conta: ");
                    codigoAtual = scanner.nextInt();

                    // Loop para verificar o código da conta
                    for (int i=0; i<codigos.length; i++) {
                        // Caso o código exista
                        if (codigoAtual == codigos[i]) {
                            valor = 0;
                            do {
                                System.out.print("Digite o valor a ser depositado: R$ ");
                                valor = scanner.nextDouble();
                                
                                if (valor <= 0) {
                                    System.out.println("\nNão é possível fazer um depósito com este valor. Digite novamente.\n");
                                }
                            } while (valor <= 0);
                            
                            saldos[i] += valor;
                            existe = true;
    
                            System.out.println("\nNovo saldo: R$ "+saldos[i]);
                        }
                    }

                    // Caso o código não exista
                    if (existe == false) {
                        System.out.println("\nConta não encontrada");
                    }
                    System.out.println("-----------------------------");

                    break;
                // Opção: Efetuar saque
                case 2:
                    System.out.println("\n\n----- Efetuar saque -----");
                    System.out.print("Digite o código da conta: ");
                    codigoAtual = scanner.nextInt();

                    // Loop para verificar o código da conta
                    for (int i=0; i<codigos.length; i++) {
                        // Caso a conta exista
                        if (codigoAtual == codigos[i]) {
                            do {
                                System.out.print("Digite o valor a ser sacado: R$ ");
                                valor = scanner.nextDouble(); 
    
                                if (valor <= 0) {
                                    System.out.println("\nValor inválido para o saque. Digite novamente.\n");
                                }
                            } while (valor <= 0);
    
                            // Caso a quantia seja maior que o saldo
                            if (valor > saldos[i]) {
                                System.out.println("\nSaldo insuficiente para a quantia desejada");
                            }
                            // Caso a quantia seja menor ou igual ao saldo
                            else {
                                saldos[i] -= valor;
    
                                System.out.println("\nNovo saldo: R$ "+saldos[i]);
                            }

                            existe = true;
                        }
                    }
                    
                    // Caso a conta não exista
                    if (existe == false) {
                        System.out.println("\nConta não encontrada");
                    }
                    System.out.println("-------------------------");
                    
                    break;
                // Opção: Consultar o ativo bancário
                case 3:
                    System.out.println("\n\n----- Consultar o ativo bancário -----");

                    valor = 0;
                    // Soma todos os saldos do banco
                    for (int i=0; i<saldos.length; i++) {
                        valor += saldos[i];
                    }

                    System.out.println("Saldo do ativo bancário: R$ "+valor);
                    System.out.println("--------------------------------------");

                    break;
            }
        } while (op!=4);

    }
    
}
