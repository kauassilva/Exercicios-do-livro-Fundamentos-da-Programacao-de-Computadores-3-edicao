/**
 * @author kauas - 28/07/2022 quinta
 * Livro: Fundamentos da Programação de Computadores
 * Capítulo 5, Exercício Proposto 13, pág. 148
 */

/*
Faça um programa que receba a idade e o peso de quinze pessoas, e que calcule e
mostre as médias dos pesos das pessoas da mesma faixa etária. As faixas etárias
são: de 1 a 10 anos, de 11 a 20 anos, de 21 a 30 anos e de 31 anos para cima.
*/
package capitulo_5.exercicios_propostos;

import java.text.NumberFormat;
import java.util.Scanner;

public class ExercicioProposto13 {
    
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        NumberFormat fmtNumero = NumberFormat.getNumberInstance();
        int idade, qtdPessoa, qtdPessFaixa1, qtdPessFaixa2, qtdPessFaixa3, qtdPessFaixa4;
        float peso, somaPesoFaixa1, somaPesoFaixa2, somaPesoFaixa3, somaPesoFaixa4, mediaPesoFaixa1, mediaPesoFaixa2, mediaPesoFaixa3, 
                mediaPesoFaixa4;
        
        qtdPessoa = 15;
        qtdPessFaixa1 = 0;
        qtdPessFaixa2 = 0;
        qtdPessFaixa3 = 0;
        qtdPessFaixa4 = 0;
        somaPesoFaixa1 = 0;
        somaPesoFaixa2 = 0;
        somaPesoFaixa3 = 0;
        somaPesoFaixa4 = 0;
        
        // Estrutura de repetição baseado na quantidade de pessoas
        for (int i=1; i<=qtdPessoa; i++) {
            System.out.println("\nDados referentes a "+i+"ª pessoa");
            
            // Estrutura de repetição referente a dado inválido
            do {
                System.out.print("Digite a idade: ");
                idade = entrada.nextInt();
                
                if (idade <= 0) {
                    System.out.println("Idade inválida, digite novamente!");
                }
            } while (idade <= 0);
            
            // Estrutura de repetição referente a dado inválido
            do {
                System.out.print("Digite o peso em quilogramas: ");
                peso = entrada.nextFloat();
                
                if (peso < 0.245) {
                    System.out.println("Peso inválido, digite novamente!");
                }
            } while (peso < 0.245);
            
            if (idade >= 1 && idade <= 10) {
                qtdPessFaixa1++;
                somaPesoFaixa1 += peso;
            } else if (idade >= 11 && idade <= 20) {
                qtdPessFaixa2++;
                somaPesoFaixa2 += peso;
            } else if (idade >= 21 && idade <= 30) {
                qtdPessFaixa3++;
                somaPesoFaixa3 += peso;
            } else {
                qtdPessFaixa4++;
                somaPesoFaixa4 += peso;
            }
        }
        
        mediaPesoFaixa1 = somaPesoFaixa1 / qtdPessFaixa1;
        mediaPesoFaixa2 = somaPesoFaixa2 / qtdPessFaixa2;
        mediaPesoFaixa3 = somaPesoFaixa3 / qtdPessFaixa3;
        mediaPesoFaixa4 = somaPesoFaixa4 / qtdPessFaixa4;
        
        System.out.println("\n\nPeso médio das pessoas da faixa etária de 1 a 10 anos: "+fmtNumero.format(mediaPesoFaixa1)+" kg");
        System.out.println("Peso médio das pessoas da faixa etária de 11 a 20 anos: "+fmtNumero.format(mediaPesoFaixa2)+" kg");
        System.out.println("Peso médio das pessoas da faixa etária de 21 a 30 anos: "+fmtNumero.format(mediaPesoFaixa3)+" kg");
        System.out.println("Peso médio das pessoas da faixa etária de 31 anos para cima: "+fmtNumero.format(mediaPesoFaixa4)+" kg\n");
        
        entrada.close();
    }
}
