/**
 * @author kauas - 28/07/2022 quinta
 * Livro: Fundamentos da Programação de Computadores
 * Capítulo 5, Exercício Proposto 14, pág. 148
 */

/*
Cada espectador de um cinema reespondeu a um questionário no qual constava sua
idade e sua opinião em relação ao filme: ótimo - 3; bom - 2; regular - 1. Faça
um programa que receba a idade e a opinião de quinze espectadores, calcule e
mostre:

- A média das idades das pessoas que responderam ótimo;
- A quantidade de pessoas que responderam regular; e
- A percentagem de pessoas que responderam bom, entre todos os espectadores
  analisados.
*/
package capitulo_5.exercicios_propostos;

import java.util.Scanner;

public class ExercicioProposto14 {
    
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        int idade, opiniao, qtdEspectador, somaIdade, qtdOtimo, qtdRegular, qtdBom, mediaOtimo, pctBom;
        
        qtdEspectador = 15;
        qtdOtimo = 0;
        qtdRegular = 0;
        qtdBom = 0;
        somaIdade = 0;
        
        // Estrutura de repetição baseada na quantidade de espectadores
        for (int i=1; i<=qtdEspectador; i++) {
            System.out.println("\nDados referente ao "+i+"º espectador");
            
            // Estrutura de repetição referente a dado inválido
            do {
                System.out.print("Digite a idade: ");
                idade = entrada.nextInt();
                
                if (idade < 0 || idade > 122) {
                    System.out.println("Idade inválida, digite novamente!");
                }
            } while (idade < 0 || idade > 122);
            
            // Estrutura de repetição referente a dado inválido
            do {
                System.out.println("Qual a opinião em relação ao filme?");
                System.out.print("3 - ótimo / 2 - bom / 1 - regular: ");
                opiniao = entrada.nextInt();
                
                if (opiniao!=3 && opiniao!=2 && opiniao!=1) {
                    System.out.println("Opção inválida, digite novamente!");
                }
            } while (opiniao!=3 && opiniao!=2 && opiniao!=1);
            
            switch (opiniao) {
                case 3:
                    qtdOtimo++;
                    somaIdade += idade;
                    break;
                case 2:
                    qtdBom++;
                    break;
                default:
                    qtdRegular++;
                    break;
            }
        }
        
        mediaOtimo = somaIdade / qtdOtimo;
        pctBom = (qtdBom * 100) / qtdEspectador;
        
        System.out.println("\nMédia das idades das pessoas que responderam ótimo: "+mediaOtimo);
        System.out.println("Quantidade de pessoas que responderam regular: "+qtdRegular);
        System.out.println("Percentagem de pessoas que responderam bom, entre todos os espectadores: "+pctBom+"%\n");
        
        entrada.close();
    }
}
