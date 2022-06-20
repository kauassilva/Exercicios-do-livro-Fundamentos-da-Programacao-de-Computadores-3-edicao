/**
@author kauas - 27/03/2022 Domingo
Livro: Fundamentos da Programação de Computadores
Capítulo 3, Exercício Resolvido 17, pág.45
*/

/*
Um trabalhador recebeu seu salário e o depositou em sua conta bancária. Esse
trabalhador emitiu dois chequees e agora deseja saber seu saldo atual. Sabe-se
que cada operação bancária de retirada paga CPMF de 0,38% e o saldo inicial da
conta está zerado.
*/
package capitulo_3.exercicios_resolvidos;

import java.util.Scanner;
import java.text.DecimalFormat;

public class ExercResolvido17 {

    public static void main(String[] args) {
        // Declaração de variáveis
        Scanner entrada = new Scanner(System.in);
        DecimalFormat casas = new DecimalFormat("0.00");
        float salario, cheque1, cheque2, saldo, cpmf1, cpmf2;
        
        // Coletar dados
        System.out.print("Digite seu salário: ");
        salario = entrada.nextFloat();
        System.out.println("Digite os valores dos dois cheques: ");
        cheque1 = entrada.nextFloat();
        cheque2 = entrada.nextFloat();
        
        // Operações referentes ao saldo
        cpmf1 = cheque1 * 0.0038F;
        cpmf2 = cheque2 * 0.0038F;
        saldo = salario - cheque1 - cheque2 - cpmf1 - cpmf2;
        
        // Exibir dados
        System.out.println("\nValor do CPMF do primeiro cheque: R$"+casas.format(cpmf1));
        System.out.println("Valor do CPMF do segundo cheque: R$"+casas.format(cpmf2));
        System.out.println("Saldo atual: R$"+casas.format(saldo));

        entrada.close();
    }
    
}
