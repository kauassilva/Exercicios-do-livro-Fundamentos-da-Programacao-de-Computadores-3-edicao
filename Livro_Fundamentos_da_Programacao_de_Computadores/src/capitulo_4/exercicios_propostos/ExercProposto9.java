/**
@author kauas - 23/04/2022 sábado
Livro: Fundamentos da Programação de Computadores
Capítulo 4, Exercício Proposto 9, pág.90
*/

/*
Um banco concederá um crédito especial aos seus clientes, de acordo com o saldo
médio no último ano. Faça um programa que receba o saldo médio de um cliente e
calcule o valor do crédito, de acordo com a tabela a seguir. Mostre o saldo
médio e o valor do crédito.
[imagem, pág.91]
*/
package capitulo_4.exercicios_propostos;

import java.text.DecimalFormat;
import java.util.Scanner;

public class ExercProposto9 {
    
    public static void main(String[] args) {
        // Declaração de variáveis
        Scanner entrada = new Scanner(System.in);
        DecimalFormat casas = new DecimalFormat("0.00");
        float salMedio, credito;
        
        // Coletar dado
        System.out.print("Digite o saldo médio: ");
        salMedio = entrada.nextFloat();
        
        // Desvio condicional referente a dado inválido
        if (salMedio > 0) {
            // Desvio condicional referente ao crédito
            if (salMedio > 400) {
                credito = salMedio + salMedio * 0.3F;
            } else if (salMedio<=400 && salMedio>300) {
                credito = salMedio + salMedio * 0.25F;
            } else if (salMedio<=300 && salMedio>200) {
                credito = salMedio + salMedio * 0.2F;
            } else {
                credito = salMedio + salMedio * 0.1F;
            }

            // Exibir dado
            System.out.println("\nCrédito: R$ "+casas.format(credito));
        } else {
            System.out.println("\nSaldo médio inválido");
        }
        
        entrada.close();
    }
}
