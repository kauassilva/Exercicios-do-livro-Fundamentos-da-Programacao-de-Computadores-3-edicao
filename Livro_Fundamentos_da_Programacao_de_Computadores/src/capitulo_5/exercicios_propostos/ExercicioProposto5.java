/**
 * @author kauas - 25/07/2022 segunda
 * Livro: Fundamentos da Programação de Computadores
 * Capítulo 5, Exercício Proposto 5, pág. 147
 */

/*
Faça um programa que mostre a tabuada dos números de 1 a 10.
*/
package capitulo_5.exercicios_propostos;

public class ExercicioProposto5 {
    
    public static void main(String[] args) {        
        int resultado;
        
        // Estrutura de repetição referente ao primeiro número da multiplicação
        for (int i=1; i<=10; i++) {
            System.out.println("");
            
            // Estrutura de repetição referente ao segundo número da multiplicação
            for (int j=0; j<=10; j++) {
                resultado = i * j;
                System.out.println(i+" x "+j+" = "+resultado);
            }
        }
        
        System.out.println("");
    }
}
