/**
 * @author kauas - 26/07/2022 terça
 * Livro: Fundamentos da Programação de Computadores
 * Capítulo 5, Exercício Proposto 8, pág. 147
 */

/*
Faça um programa que receba a idade, o peso, a altura, a cor dos olhos 
(A - azul; P - preto; V - verde; e C - castanho) e a cor dos cabelos (P - preto;
C - castanho; L - louro; e R - ruivo) de seis pessoas, e que calcule e mostre:

- A quantidade de pessoas com idade superior a 50 anos e peso inferior a 60 kg;
- A média das idades das pessoas com altura inferior a 1,50 m;
- A porcentagem de pessoas com olhos azuis entre todas as pessoas analisadas; e
- A quantidade de pessoas ruivas e que não possuem olhos azuis.
*/
package capitulo_5.exercicios_propostos;

import java.util.Scanner;

public class ExercicioProposto8 {
    
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        int qtdPessoa, qtdPessIdadePeso, qtdIdade, qtdOlhoAzul, qtdPessRuiva, idade, somaIdade, mediaIdade, pctOlhoAzul;
        float peso, altura;
        char corOlho, corCabelo;
        
        qtdPessoa = 6;
        qtdPessIdadePeso = 0;
        qtdIdade = 0;
        qtdOlhoAzul = 0;
        qtdPessRuiva = 0;
        somaIdade = 0;
        
        // Estrutura de repetição baseado na quantidade de pessoas
        for (int i=1; i<=qtdPessoa; i++) {
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
            entrada.nextLine();
            
            // Estrutura de repetição referente a dado inválido
            do {                
                System.out.print("Cor dos olhos (A - azul / P - preto / V - verde / C - castanho): ");
                corOlho = Character.toUpperCase(entrada.nextLine().charAt(0));
                
                if (corOlho!='A' && corOlho!='P' && corOlho!='V' && corOlho!='C') {
                    System.out.println("Cor inválida, digite novamente!");
                }
            } while (corOlho!='A' && corOlho!='P' && corOlho!='V' && corOlho!='C');
            
            // Estrutura de repetição referente a dado inválido
            do {                
                System.out.print("Cor do cabelo (P - preto / C - castanho / L - louro / R - ruivo): ");
                corCabelo = Character.toUpperCase(entrada.nextLine().charAt(0));
                
                if (corCabelo!='P' && corCabelo!='C' && corCabelo!='L' && corCabelo!='R') {
                    System.out.println("Cor inválida, digite novamente!");
                }
            } while (corCabelo!='P' && corCabelo!='C' && corCabelo!='L' && corCabelo!='R');
            
            System.out.println("\n-------------------------------------------------------------------\n");
            
            if (idade > 50 && peso < 60) {
                qtdPessIdadePeso++;
            }
            
            if (altura < 1.5) {
                qtdIdade++;
                somaIdade = somaIdade + idade;
                
            }
            
            if (corOlho == 'A') {
                qtdOlhoAzul++;
            }
            
            if (corCabelo == 'R' && corOlho != 'A') {
                qtdPessRuiva++;
            }   
        }
        
        mediaIdade = somaIdade / qtdIdade;
        pctOlhoAzul = (qtdOlhoAzul * 100) / qtdPessoa;
        
        System.out.println("\nQuantidade de pessoas com idade superior a 50 anos e peso inferior a 60 kg: "+qtdPessIdadePeso);
        System.out.println("Média das idades das pessoas com altura inferior a 1,50 m: "+mediaIdade);
        System.out.println("Porcentagem de pessoas com olhos azuis entre todas as pessoas analisadas: "+pctOlhoAzul+"%");
        System.out.println("Quantidade de pessoas ruivas e que não possuem olhos azuis: "+qtdPessRuiva+"\n");
        
        entrada.close();
    }
}
