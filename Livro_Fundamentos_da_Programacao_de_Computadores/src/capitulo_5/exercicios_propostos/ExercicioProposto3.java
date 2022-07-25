/**
 * @author kauas - 23/07/2022 sexta
 * Livro: Fundamentos da Programação de Computadores
 * Capítulo 5, Exercício Proposto 3, pág. 146
 */

/*
Faça um programa que receba a idade de oito pessoas, calcule e mostre:

a) a quantidade de pessoas em cada faixa etária;
b) a porcentagem de pessoas na primeira faixa etária com relação ao total de
   pessoas;
c) a porcentagem de pessoas na última faixa etária com relação ao total de
   pessoas.

[imagem, pág. 146]
*/
package capitulo_5.exercicios_propostos;

import java.text.NumberFormat;
import java.util.Scanner;

public class ExercicioProposto3 {
    
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        NumberFormat fmtNumero = NumberFormat.getNumberInstance();
        
        int idade, qtdPessoas, qtdFaixa1, qtdFaixa2, qtdFaixa3, qtdFaixa4, qtdFaixa5;
        float pctFaixa1, pctFaixa5;
        
        qtdPessoas = 8;
        qtdFaixa1 = 0;
        qtdFaixa2 = 0;
        qtdFaixa3 = 0;
        qtdFaixa4 = 0;
        qtdFaixa5 = 0;
        pctFaixa1 = 0;
        pctFaixa5 = 0;
        
        // Estrutura de repetição baseado na quantidade de pessoas
        for (int i=1; i<=qtdPessoas; i++) {
            // Estrutura de repetição referente a dado inválido
            do {
                System.out.print("Digite a idade da "+i+"ª pessoa: ");
                idade = entrada.nextInt();
                
                if (idade < 0) {
                    System.out.println("Idade inválida, digite novamente!");
                }
            } while (idade < 0);
            
            if (idade <= 15) {
                qtdFaixa1++;
            } else if (idade >= 16 && idade <= 30) {
                qtdFaixa2++;
            } else if (idade >= 31 && idade <= 45) {
                qtdFaixa3++;
            } else if (idade >= 46 && idade <= 60) {
                qtdFaixa4++;
            } else {
                qtdFaixa5++;
            }
            
            pctFaixa1 = qtdFaixa1 * 100 / qtdPessoas;
            pctFaixa5 = qtdFaixa5 * 100 / qtdPessoas;
        }
        
        System.out.println("\nQuantidade de pessoas na 1ª faixa etária: "+qtdFaixa1);
        System.out.println("Quantidade de pessoas na 2ª faixa etária: "+qtdFaixa2);
        System.out.println("Quantidade de pessoas na 3ª faixa etária: "+qtdFaixa3);
        System.out.println("Quantidade de pessoas na 4ª faixa etária: "+qtdFaixa4);
        System.out.println("Quantidade de pessoas na 5ª faixa etária: "+qtdFaixa5);
        System.out.println("Porcentagem de pessoas na 1ª faixa entre todas as pessoas: "+fmtNumero.format(pctFaixa1)+"%");
        System.out.println("Porcentagem de pessoas na 5ª faixa entre todas as pessoas: "+fmtNumero.format(pctFaixa5)+"%\n");
        
        entrada.close();
    }
}
