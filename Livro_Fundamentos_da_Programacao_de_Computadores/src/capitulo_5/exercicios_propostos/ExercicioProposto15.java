/**
 * @author kauas - 29/07/2022 sexta
 * Livro: Fundamentos da Programação de Computadores
 * Capítulo 5, Exercício Proposto 15, pág. 148
 */

/*
Uma empresa fez uma pesquisa de mercado para saber se as pessoas gostaram ou não
de um novo produto lançado. Para isso, forneceu o sexo do entrevistado e sua
resposta (S - sim; ou N- não). Sabe-se que foram entrevistadas dez pessoas. Faça
um programa que calcule e mostre:

- O número de pessoas que responderam sim;
- O número de pessoas que responderam não;
- O número de mulheres que responderam sim; e
- A percentagem de homens que responderam não, entre todos os homens analisados.
*/
package capitulo_5.exercicios_propostos;

import java.util.Scanner;

public class ExercicioProposto15 {
    
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        int qtdPessoa, qtdSim, qtdNao, qtdFemSim, qtdMasc, qtdMascNao, pctMascNao;
        char sexo, resposta;

        qtdPessoa = 10;
        qtdSim = 0;
        qtdNao = 0;
        qtdFemSim = 0;
        qtdMasc = 0;
        qtdMascNao = 0;

        // Estrutura de repetição baseado na quantidade de pessoas que serão entrevistadas
        for (int i=1; i<=qtdPessoa; i++) {
            System.out.println("\nDados referentes a "+i+"ª pessoa");
            
            // Estrutura de repetição referente a dado inválido
            do {
                System.out.print("Digite o sexo (M - masculino / F - feminino): ");
                sexo = Character.toUpperCase(entrada.nextLine().charAt(0));
                
                if (sexo != 'M' && sexo != 'F') {
                    System.out.println("Sexo inválido, digite novamente!");
                }
            } while (sexo != 'M' && sexo != 'F');
            
            // Estrutura de repetição referente a dado inválido
            do {
                System.out.print("Digite a resposta (S - sim / N - não): ");
                resposta = Character.toUpperCase(entrada.nextLine().charAt(0));
                
                if (resposta != 'S' && resposta != 'N') {
                    System.out.println("Resposta inválida, digite novamente!");
                }
            } while (resposta != 'S' && resposta != 'N'); 
            
            if (resposta == 'S') {
                qtdSim++;
                
                if (sexo == 'F') {
                    qtdFemSim++;
                } else {
                    qtdMasc++;
                }
            } else {
                qtdNao++;
                
                if (sexo == 'M') {
                   qtdMasc++;
                   qtdMascNao++;
                }
            }
        }
        
        pctMascNao = (qtdMascNao * 100) / qtdMasc;
        
        System.out.println("\n\nNúmero de pessoas que responderam sim: "+qtdSim);
        System.out.println("Número de pessoas que responderam não: "+qtdNao);
        System.out.println("Número de mulheres que responderam sim: "+qtdFemSim);
        System.out.println("Percentagem de homens que responderam não, entre todos os homens: "+pctMascNao+"%\n");
        
        entrada.close();
    }
}
