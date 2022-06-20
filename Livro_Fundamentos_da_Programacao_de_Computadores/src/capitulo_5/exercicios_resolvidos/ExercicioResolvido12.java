/**
@author kauas - 17/06/2022 sexta
Livro: Fundamentos da Programação de Computadores
Capítulo 5, Exercício Resolvido 12, pág.127
*/

/*
Em uma fábrica trabalham homens e mulheres divididos em três classes:

- Trabalhadores que fazem até 30 peças por mês - classe 1;
- Trabalhadores que fazem de 31 a 50 peças por mês - classe 2;
- Trabalhadores que fazem mais de 50 peças por mês - classe 3;

A classe 1 recebe salário mínimo. A classe 2 recebe salário mínimo mais 3% deste
salário por peça, acima das 30 peças iniciais. A classe 3 recebe o salário
mínimo mais 5% deste salário por peça, acima das 30 peças iniciais.

Faça um programa que receba o número do operário,o número de peças fabricadas no
mês, o sexo do operário, e que também calcule e mostre:

- O número do operário e seu salário;
- O total da folha de pagamento da fábrica;
- O número total de peças fabricadas no mês;
- A média de peças fabricadas pelos homens;
- A média de peças fabricadas pelas mulheres; e
- O número do operário ou operária de maior salário.

A fábrica possui 15 operários.
*/
package capitulo_5.exercicios_resolvidos;

import java.text.DecimalFormat;
import java.util.Scanner;

public class ExercicioResolvido12 {
    
    public static void main(String[] args) {
        // Declaração de variáveis
        Scanner entrada = new Scanner(System.in);
        DecimalFormat casas = new DecimalFormat("0.00");
        int codOperario, numPecas, numPecasTotal, porcentagem, diferenca, somaPecaMasculino, somaPecaFeminino, qtdOperario, codMaiorSalario;
        float salMinimo, salario, folhaPagamento, mediaPecaMasculino, mediaPecaFeminino, maiorSalario;
        char sexo;
        String alerta1, alerta2;
        
        // Inicialização de variáveis
        qtdOperario = 15;
        salMinimo = 1212;
        folhaPagamento = 0;
        numPecasTotal = 0;
        somaPecaMasculino = 0;
        somaPecaFeminino = 0;
        mediaPecaMasculino = 0;
        mediaPecaFeminino = 0;
        maiorSalario = 0;
        codMaiorSalario = 0;
        alerta1 = "";
        alerta2 = "";
        
        // Laço de repetição baseado na quantidade de operários
        for (int i=1; i<=qtdOperario; i++) {
            System.out.print("\nDigite o código do(a) operário(a): ");
            codOperario = entrada.nextInt();
            System.out.print("Digite o número de peças fabricadas no mês pelo(a) operário(a): ");
            numPecas = entrada.nextInt();
            entrada.nextLine();
            System.out.print("Digite o sexo do operário(a)\nM - masculino\nF - feminino\n<< ");
            sexo = Character.toUpperCase(entrada.nextLine().charAt(0));

            // Desvio condicional para obter o salário
            if (numPecas >= 0 && numPecas <= 30) {
                salario = salMinimo;
            } else if (numPecas > 30 && numPecas < 51) {
                porcentagem = 3;
                diferenca = numPecas - 30;
                salario = salMinimo + (diferenca * (salMinimo * porcentagem / 100));
            } else if (numPecas > 50) {
                porcentagem = 5;
                diferenca = numPecas - 30;
                salario = salMinimo + (diferenca * (salMinimo * porcentagem / 100));
            } else {
                salario = 0;
                alerta1 = "Foi informado um valor inválido de número de peças fabricadas por mês para um ou mais operários!";
                System.out.println("\nQuantidade de peças inválidas!");
            }

            folhaPagamento = folhaPagamento + salario;
            numPecasTotal = numPecasTotal + numPecas;
            
            // Desvio condicional para coletar dados relacionados ao sexo
            switch (sexo) {
                case 'M' -> {
                    somaPecaMasculino = somaPecaMasculino + numPecas;
                    mediaPecaMasculino = (float) somaPecaMasculino / qtdOperario;
                }
                case 'F' -> {
                    somaPecaFeminino = somaPecaFeminino + numPecas;
                    mediaPecaFeminino = (float) somaPecaFeminino / qtdOperario;
                }
                default -> {
                    alerta2 = "Foi informado um valor inválido do sexo para um ou mais operários!";
                    System.out.println("\nSexo inválido!");
                }
            }
            
            // Desvio condicional para obter o código do operário com o maior salário
            if (maiorSalario < salario) {
                codMaiorSalario = codOperario;
            }

            System.out.println("\nOperário: "+codOperario);
            System.out.println("Salário: R$ "+casas.format(salario));
        }
        
        // Desvio condicional para informar se foi informado algum dado inválido
        if (!"".equals(alerta1) && !"".equals(alerta2)) {
            System.out.println("\n\n"+alerta1);
            System.out.println(alerta2);
        } else if (!"".equals(alerta1)) {
            System.out.println("\n\n"+alerta1);
        } else if (!"".equals(alerta2)) {
            System.out.println("\n\n"+alerta2);
        }
        
        // Exibir dados
        System.out.println("\nFolha de pagamento da fábrica: "+casas.format(folhaPagamento));
        System.out.println("Quantidade de peças fabricadas no mês: "+numPecasTotal+"\n");
        System.out.println("Média de peças fabricadas no mês pelos homens: "+casas.format(mediaPecaMasculino));
        System.out.println("Média de peças fabricadas no mês pelas mulheres: "+casas.format(mediaPecaFeminino));
        System.out.println("O código do funcionário com maior salário: "+codMaiorSalario);
    }
}
