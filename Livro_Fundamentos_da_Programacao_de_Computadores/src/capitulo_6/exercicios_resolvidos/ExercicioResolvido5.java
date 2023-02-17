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
  (todos os elementos de X que não existam em Y, sem repetições);

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

import java.util.Scanner;

public class ExercicioResolvido5 {
    
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        int tamanho, tamFinal, contUniao, contDiferenca, contInterseccao, j, k;
        
        tamanho = 10;
        tamFinal = tamanho*2;
        contUniao = 0;
        contDiferenca = 0;
        contInterseccao = 0;
        
        int[] vetorX = new int[tamanho];
        int[] vetorY = new int[tamanho];
        int[] vetorUniao = new int[tamFinal];
        int[] vetorDiferenca = new int[tamanho];
        int[] vetorSoma = new int[tamanho];
        int[] vetorProduto = new int[tamanho];
        int[] vetorInterseccao = new int[tamanho];
        
        
        
        // Preenchimento dos vetor X
        System.out.println("--- Vetor X ---\n");
        for (int i=0; i<tamanho; i++) {
            System.out.print("Digite um número inteiro para o índice "+i+": ");
            vetorX[i] = entrada.nextInt();
        }
        
        // Preenchimento do vetor Y
        System.out.println("\n--- Vetor Y ---\n");
        for (int i=0; i<tamanho; i++) {
            System.out.print("Digite um número inteiro para o índice "+i+": ");
            vetorY[i] = entrada.nextInt();
        }   
        
        
        
        // União dos vetores X e Y sem repetições
        for (int i=0; i<tamanho; i++) {
            j = 0;
            
            while (j < contUniao && vetorX[i] != vetorUniao[j]) {
                j++;
            }
            
            if (j >= contUniao) {
                vetorUniao[contUniao] = vetorX[i];
                contUniao++;
            }
        }
        
        for (int i=0; i<tamanho; i++) {
            j = 0;
            
            while (j < contUniao && vetorY[i] != vetorUniao[j]) {
                j++;
            }
            
            if (j >= contUniao) {
                vetorUniao[contUniao] = vetorY[i];
                contUniao++;
            }
        }
        
        System.out.println("\n--- União dos vetores ---\n");
        System.out.print("[");
        for (int i=0; i<contUniao; i++) {
            if (i != contUniao-1) {
                System.out.print(vetorUniao[i]+", ");
            } else {
                System.out.print(vetorUniao[i]+"]");
            }
        }
        
        
        
        // Diferença entre os vetores X e Y
        for (int i=0; i<tamanho; i++) {
            j = 0;
            
            while (j < tamanho && vetorX[i] != vetorY[j]) {
                j++;
            }
            
            if (j >= tamanho) {
                k = 0;
                
                while (k < contDiferenca && vetorX[i] != vetorDiferenca[k]) {
                    k++;
                }
                
                if (k >= contDiferenca) {
                    vetorDiferenca[contDiferenca] = vetorX[i];
                    contDiferenca++;
                }
            }
        }
        
        System.out.println("\n\n--- Diferença dos Vetores ---\n");
        System.out.print("[");
        for (int i=0; i<contDiferenca; i++) {
            if (i != contDiferenca-1) {
                System.out.print(vetorDiferenca[i]+", ");
            } else {
                System.out.print(vetorDiferenca[i]+"]");
            }
        }
        
        
        
        // Vetor de soma e produto entre os vetores X e Y
        for (int i=0; i<tamanho; i++) {
            vetorSoma[i] = vetorX[i] + vetorY[i];
            vetorProduto[i] = vetorX[i] * vetorY[i];
        }
        
        System.out.println("\n\n--- Soma dos vetores ---\n");
        System.out.print("[");
        for (int i=0; i<tamanho; i++) {
            if (i != tamanho-1) {
                System.out.print(vetorSoma[i]+", ");
            } else {
                System.out.print(vetorSoma[i]+"]");
            }
        }
        
        System.out.println("\n\n--- Produto dos vetores ---\n");
        System.out.print("[");
        for (int i=0; i<tamanho; i++) {
            if (i != tamanho-1) {
                System.out.print(vetorProduto[i]+", ");
            } else {
                System.out.print(vetorProduto[i]+"]");
            }
        }
        
        
        
        // Intersecção dos vetores X e Y
        for (int i=0; i<tamanho; i++) {
            j = 0;
            
            while (j < tamanho && vetorX[i] != vetorY[j]) {
                j++;
            }
            
            if (j < tamanho) {
                k = 0;
                
                while (k < contInterseccao && vetorX[i] != vetorInterseccao[k]) {
                    k++;
                }
                
                if (k >= contInterseccao) {
                    vetorInterseccao[contInterseccao] = vetorX[i];
                    contInterseccao++;
                }
            }
        }
        
        System.out.println("\n\n--- Intersecção dos vetores ---\n");
        System.out.print("[");
        for (int i=0; i<contInterseccao; i++) {
            if (i != contInterseccao-1) {
                System.out.print(vetorInterseccao[i]+", ");
            } else {
                System.out.print(vetorInterseccao[i]+"]");
            }
        }
        
        System.out.println("\n");
        
        entrada.close();
    }
}
