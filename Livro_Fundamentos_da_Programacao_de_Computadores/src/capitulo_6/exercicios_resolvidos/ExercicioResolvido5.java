/**
 * @author kauas - 03/09/2022 Sábado
 * Livro: Fundamentos da Programação de Computadores
 * Capítulo 6, Exercício Proposto 5, pág. 162
 */

/*
Faça um programa que preencha dois vetores, X e Y, com dez números inteiros cada. Calcule e mostre
os seguintes vetores resultantes:

• A união de X com Y 
  (todos o elementos de X e de Y sem repetições);

  [imagem, pág. 162]  

• A diferença entre X e Y
  (todos os elementos que não existam em Y, sem repetições);

  [imagem, pág. 162]

• A soma entre X e Y
  (soma de cada elemento de X com o elemento de mesmo posição de Y);

  [imagem, pág. 162]

• O produto entre X e Y
  (multiplicação de cada elemento de X com o elemento de mesma posição em Y).

  [imagem, pág. 162]

• A intersecção entre X e Y
  (apenas os elementos que aparecem nos dois vetores, sem repetições).

  [imagem, pág. 163]
*/
package capitulo_6.exercicios_resolvidos;

import java.util.Scanner;

public class ExercicioResolvido5 {
    
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        int tamanho, tamFinal;
        
        tamanho = 10;
        tamFinal = tamanho*2;
        
        int[] vetorX = new int[tamanho];
        int[] vetorY = new int[tamanho];
        int[] vetorUniao = new int[tamFinal];
        
        System.out.println("--- Vetor X ---\n");
        for (int i=0; i<tamanho; i++) {
            System.out.print("Digite um número inteiro para o índice "+i+": ");
            vetorX[i] = entrada.nextInt();
        }
        
        System.out.println("\n--- Vetor Y ---\n");
        for (int i=0; i<tamanho; i++) {
            System.out.print("Digite um número inteiro para o índice "+i+": ");
            vetorY[i] = entrada.nextInt();
        }
        
        System.out.println("--- União dos vetores --- ");
        /*for (int i=0; i<tamFinal; i++) {
            int j = 0;
            
            while (j < ) {
                
            }
        }*/
        
        
        System.out.println();
        
        entrada.close();
    }
}
