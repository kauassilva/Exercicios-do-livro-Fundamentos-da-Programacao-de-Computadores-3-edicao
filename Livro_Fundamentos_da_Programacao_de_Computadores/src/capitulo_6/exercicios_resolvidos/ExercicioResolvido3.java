/**
 * @author kauas - 01/09/2022 Quinta
 * Livro: Fundamentos da Programação de Computadores
 * Capítulo 6, Exercício Proposto 3, pág. 160
 */

/*
Faça um programa que preencha dois vetores de dez elementos numéricos cada um e mostre o vetor resultante
da intercalação deles.

[imagem, pág. 160]
*/

import java.text.NumberFormat;
import java.util.Scanner;

public class ExercicioResolvido3 {
    
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        NumberFormat fmtNumero = NumberFormat.getNumberInstance();
        
        int tamanho, tamFinal, j;
        boolean vetor = true;
        
        tamanho = 10;
        tamFinal = tamanho * 2;
        j = 0;
        
        Float[] vetNum1 = new Float[tamanho];
        Float[] vetNum2 = new Float[tamanho];
        Float[] vetNumFinal = new Float[tamFinal];
        
        // Estrutura de repetição para entrada dos números do primeiro vetor
        System.out.println("--- Vetor 1 ---\n");
        for (int i=0; i<tamanho; i++) {
            System.out.print("Digite o número do indíce "+i+" : ");
            vetNum1[i] = entrada.nextFloat();
        }
        
        //Estrutura de repetição para entrada dos números do segundo vetor
        System.out.println("\n--- Vetor 2 ---\n");
        for (int i=0; i<tamanho; i++) {
            System.out.print("Digite o número do indíce "+i+" : ");
            vetNum2[i] = entrada.nextFloat();
        }
               
        // Estrutura de repetição referente ao processo de intercalação dos vetores no vetor final
        for (int i=0; i<tamFinal; i++) {                
            if (vetor == true) {
                vetNumFinal[i] = vetNum1[j];
                vetor = false;
            } else {
                vetNumFinal[i] = vetNum2[j];
                vetor = true;
                j++;
            }  
        }
        
        // Estrutura de repetição para exibir o vetor final
        System.out.println("\n--- Vetor Resultante ---\n");
        System.out.print("[");
        for (int i=0; i<tamFinal; i++) {
            if (i != tamFinal-1) {
                System.out.print(fmtNumero.format(vetNumFinal[i])+", ");
            } else {
                System.out.print(fmtNumero.format(vetNumFinal[i]));
            }
        }
        System.out.println("]\n");
        
        entrada.close();
    }
    
}
