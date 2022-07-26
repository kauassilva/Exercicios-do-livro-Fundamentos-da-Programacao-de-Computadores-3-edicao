/**
 * @author kauas - 26/07/2022 terça
 * Livro: Fundamentos da Programação de Computadores
 * Capítulo 5, Exercício Proposto 9, pág. 147
 */

/*
Faça um programa que receba dez idades, pesos e alturas, calcule e mostre:

- A média das idades das dez pessoas;
- A quantidade de pessoas com peso superior a 90 kg e altura inferior a 1,50 metros; e
- A porcentagem de pessoas com idade entre 10 e 30 anos entre as pessoas que medem mais de 1,90 m.
*/
package capitulo_5.exercicios_propostos;

import java.util.Scanner;

public class ExercicioProposto9 {
    
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        int qtdPessoa, idade, somaIdade, mediaIdade, qtdPessPesoAltura, qtdPessIdade, pctPessIdade;
        float peso, altura;
        
        qtdPessoa = 10;
        somaIdade = 0;
        qtdPessPesoAltura = 0;
        qtdPessIdade = 0;
        
        // Estrutura de repetição baseado na quantidade de pessoas
        for (int i=1; i<=qtdPessoa; i++) {
            System.out.println("Dados referentes a "+i+"ª pessoa");
            
            // Estrutura de repetição referente a dado inválido
            do {                
                System.out.print("Digite a idade: ");
                idade = entrada.nextInt();
                
                if (idade < 0) {
                    System.out.println("Idade inválida, digite novamente");
                }
            } while (idade < 0);
            
            // Estrutura de repetição referente a dado inválido
            do {
                System.out.print("Digite o peso em quilogramas: ");
                peso = entrada.nextFloat();
                
                // O menor bebê nascido sobrevivente pesava 245 gramas
                if (peso < 0.245) {
                    System.out.println("Peso inválido, digite novamente!");
                }
            } while (peso < 0.245);
            
            // Estrutura de repetição referente a dado inválido
            do {
                System.out.print("Digite a altura em metros: ");
                altura = entrada.nextFloat();
                
                // O menor bebê nascido sobrevivente media 23 centímetros
                if (altura < 0.23) {
                    System.out.println("Altura inválida, digite novamente");
                }
            } while (altura < 0.23);
            
            System.out.println("\n-----------------------------------\n");
            
            if (peso > 90 && altura < 1.5) {
                qtdPessPesoAltura++;
            }
            
            if (idade>=10 && idade<=30 && altura>1.9) {
                qtdPessIdade++;
            }
            
            somaIdade = somaIdade + idade;
        }
        
        mediaIdade = somaIdade / qtdPessoa;
        pctPessIdade = (qtdPessIdade * 100) / qtdPessoa;
        
        System.out.println("\nMédia das idades das "+qtdPessoa+" pessoas: "+mediaIdade);
        System.out.println("Quantidade de pessoas com peso superior a 90 kg e altura inferior a 1,50 m: "+qtdPessPesoAltura);
        System.out.println("Porcentagem de pessoas com idade entre 10 e 30 anos entre as pessoas que medem mais de 1,90 m: "+pctPessIdade+"%\n");
        
        entrada.close();
    }
}
