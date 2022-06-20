/**
@author kauas - 16/06/2022 quinta
Livro: Fundamentos da Programação de Computadores
Capítulo 5, Exercício Resolvido 6, pág.121
*/

/*
Uma empresa possui dez funcionários com as seguintes características: código,
número de horas trabalhadas no mês, turno de trabalho (M - matutino; V - 
vespertino; ou N - noturno), categoria (O - operário; ou G - gerente), valor da
hora trabalhada. Sabendo-se que essa empresa deseja informatizar sua folha de
pagamento, faça um programa que:

a) Leia as informações dos funcionários, exceto o valor da hora trabalhada, não
permitindo que sejam informados turnos e nem categorias inexistentes. Trabalhe
sempre com a digitação de letras maiúsculas.
b) Calcule o valor da hora trabalhada, conforme a tabela a seguir. Adote o valor
de R$ 450,00 (mudei para 1212,00) para o salário mínimo.

[imagem, pág. 121] (mudei as porcentagens)

c) Calcule o salário inicial dos funcionários com base no valor da hora
trabalhada e no número de horas trabalhadas.
d) Calcule o valor do auxílio alimentação recebido pelo funcionário de acordo
com seu salário inicial, conforme a tabela a seguir.

[imagem, pág. 122]

e) Mostre o código, número de horas trabalhadas, valor da hora trabalhada,
salário inicial, auxílio alimentação e salário final (salário inicial + auxílio
alimentação).
*/
package capitulo_5.exercicios_resolvidos;

import java.text.DecimalFormat;
import java.util.Scanner;

public class ExercicioResolvido6 {
    
    public static void main(String[] args) {
        // Declaração de variáveis
        Scanner entrada = new Scanner(System.in);
        DecimalFormat casas = new DecimalFormat("0.00");
        int codigo, numHora;
        char codTurno, codCategoria;
        float vlrHora, salMinimo, salInicial, pctSalMinimo, pctAuxilio, vlrAuxilio, salFinal;
        
        // Inicializar variáveis
        salMinimo = 1200;
        pctSalMinimo = 0;
        vlrHora = 0;
        salInicial = 0;
        vlrAuxilio = 0;
        
        // Laço de repetição baseado na quantidade de funcionários
        for (int i=1; i<=10; i++) {
            // Coletar dados
            System.out.print("\nDigite o código do funcionário: ");
            codigo = entrada.nextInt();
            System.out.print("Digite a quantidade de horas trabalhadas no mês: ");
            numHora = entrada.nextInt();
            entrada.nextLine();
            System.out.print("Digite o turno do funcionário\nM - matutino\nV - vespertino\nN - noturno\n<< ");
            codTurno = Character.toUpperCase(entrada.nextLine().charAt(0));
            System.out.print("Digite a categoria do funcionário\nO - operário\nG - gerente\n<< ");
            codCategoria = Character.toUpperCase(entrada.nextLine().charAt(0));
        
            // Desvio condicional referente a dado inválido
            if (codTurno!='M' && codTurno!='V' && codTurno!='N') {
                System.out.println("\nO turno escolhido não existe!");
                System.exit(0);

            } else if (codCategoria!='O' && codCategoria!='G') {
                System.out.println("\nA categoria digitada não existe!");
                System.exit(0);

            } else {
                // Desvio condicional referente ao código do turno
                if (codCategoria == 'G') {
                    // Desvio condicional referente ao valor da hora
                    if (codTurno == 'N') {
                        pctSalMinimo = 1.7F;
                        vlrHora = (salMinimo * pctSalMinimo) / 100;
                    } else {
                        pctSalMinimo = 1.2F;
                        vlrHora = (salMinimo * pctSalMinimo) / 100;
                    }
                } else {
                    // Desvio condicional referente ao valor da hora
                    if (codTurno == 'N') {
                        pctSalMinimo = 0.8F;
                        vlrHora = (salMinimo * pctSalMinimo) / 100;
                    } else {
                        pctSalMinimo = 0.5F;
                        vlrHora = (salMinimo * pctSalMinimo) / 100;
                    }
                }

                salInicial = vlrHora * numHora;

                // Desvio condicional referente ao valor do auxílio
                if (salInicial < 1200) {
                    pctAuxilio = 20;
                    vlrAuxilio = (salInicial * pctAuxilio) / 100;
                } else if (salInicial>=1200 && salInicial<=2400) {
                    pctAuxilio = 15;
                    vlrAuxilio = (salInicial * pctAuxilio) / 100;
                } else {
                    pctAuxilio = 5;
                    vlrAuxilio = (salInicial * pctAuxilio) / 100;
                }

                salFinal = salInicial + vlrAuxilio;

                // Exibir dados
                System.out.println("\nCódigo do funcionário: "+codigo);
                System.out.println("Número de horas trabalhadas: "+numHora);
                System.out.println("Valor da hora trabalhada: R$ "+casas.format(vlrHora));
                System.out.println("Salário inicial: R$ "+casas.format(salInicial));
                System.out.println("Auxílio alimentação: R$ "+casas.format(vlrAuxilio));
                System.out.println("Salário final: R$ "+casas.format(salFinal));
                
                entrada.close();
            } 
        }
    }
}
