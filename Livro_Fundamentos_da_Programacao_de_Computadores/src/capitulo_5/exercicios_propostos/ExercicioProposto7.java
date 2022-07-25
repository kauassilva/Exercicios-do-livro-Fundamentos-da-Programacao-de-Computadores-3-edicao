/**
 * @author kauas - 25/07/2022 segunda
 * Livro: Fundamentos da Programação de Computadores
 * Capítulo 5, Exercício Proposto 7, pág. 147
 */

/*
Faça um programa que receba a idade, a altura e o peso de cinco pessoas, calcule
e mostre:

- A quantidade de pessoas com idade superior a 50 anos;
- A média das alturas das pessoas com idade entre 10 e 20 anos;
- A porcentagem de pessoas com peso inferior a 40 kg entre todas as pessoas
  analisadas.
*/
package capitulo_5.exercicios_propostos;

import java.text.NumberFormat;
import java.util.Scanner;

public class ExercicioProposto7 {
    
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        NumberFormat fmtNumero = NumberFormat.getNumberInstance();
        
        int qtdPessoas, idade, qtdIdade50, qtdIdade1020, qtdPeso40;
        float altura, peso, somaAltura, mediaAltura, pctPessoa;
        
        qtdPessoas = 5;
        qtdIdade50 = 0;
        somaAltura = 0;
        qtdIdade1020 = 0;
        qtdPeso40 = 0;
        
        //  Estrutura de repetição baseado na quantidade de pessoas
        for (int i=1; i<=qtdPessoas; i++) {
            System.out.println("Dados referentes a "+i+"ª pessoa");
            
            // Estrutura de repetição referente a dado inválido
            do {
                System.out.print("Digite a idade: ");
                idade = entrada.nextInt();
                
                if (idade < 0) {
                    System.out.println("Idade inválida, digite novamente!");
                }
            } while (idade < 0);
            
            // Estrutura de repetição referente a dado inválido
            do {
                System.out.print("Digite a altura em metros: ");
                altura = entrada.nextFloat();
                
                // O menor bebê nascido sobrevivente media 23 centímetros
                if (altura < 0.23) {
                    System.out.println("Altura inválida, digite novamente");
                }
            } while (altura < 0.23);
            
            // Estrutura de repetição referente a dado inválido
            do {
                System.out.print("Digite o peso em quilogramas: ");
                peso = entrada.nextFloat();
                
                // O menor bebê nascido sobrevivente pesava 245 gramas
                if (peso < 0.245) {
                    System.out.println("Peso inválido, digite novamente!");
                }
            } while (peso < 0.245);
            
            
            if (idade > 50) {
                qtdIdade50++;
            } else if (idade >= 10 && idade <= 20) {
                qtdIdade1020++;
                somaAltura = somaAltura + altura;
            }
            
            if (peso < 40) {
                qtdPeso40++;
            }
            
            System.out.println("");
        }
        
        mediaAltura = somaAltura / qtdIdade1020;
        pctPessoa = (qtdPeso40 * 100) / qtdPessoas;
        
        System.out.println("\nQuantidade de pessoas com idade superior a 50 anos: "+qtdIdade50);
        System.out.println("Média das alturas das pessoas com idade entre 10 e 20 anos: "+fmtNumero.format(mediaAltura));
        System.out.println("Porcentagem de pessoas com peso inferior a 40 kg entre todas as pessoas: "+fmtNumero.format(pctPessoa)+"%");
        System.out.println("");
        
        entrada.close();
    }
}
