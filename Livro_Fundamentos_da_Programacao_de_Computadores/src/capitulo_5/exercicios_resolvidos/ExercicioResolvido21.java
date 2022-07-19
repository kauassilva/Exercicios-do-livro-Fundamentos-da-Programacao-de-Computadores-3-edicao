/**
 * @author kauas - 16/07/2022 sabado
 * Livro: Fundamentos da Programação de Computadores
 * Capítulo 5, Exercício Resolvido 21, pág. 138
 */

/*
Faça um programa que receba vários números, calcule e mostre:

- A soma dos números digitados;
- A quantidade de números digitados;
- A média dos números digitados;
- O maior número digitado;
- O menor número digitado;
- a média dos números pares;
- A porcentagem de números ímpares entre todos os números digitados.

Finalize a entrada de dados com a digitação do número 30.000.
*/
package capitulo_5.exercicios_resolvidos;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class ExercicioResolvido21 {
    
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Locale localBR = new Locale("pt","BR");
        
        NumberFormat fmtNumero = NumberFormat.getNumberInstance(localBR);
        
        int qtdNumero, somaNumPar, qtdNumPar, mediaNumPar, qtdNumImpar;
        float numero, somaNumero, mediaNumero, maiorNumero, menorNumero, pctNumImpar;
        
        somaNumero = 0;
        qtdNumero = 0;
        mediaNumero = 0;
        somaNumPar = 0;
        qtdNumPar = 0;
        mediaNumPar = 0;
        qtdNumImpar = 0;
        pctNumImpar = 0;
        
        System.out.print("Digite um número: ");
        numero = entrada.nextFloat();
        
        if (numero == 30000) {
            maiorNumero = 0;
            menorNumero = 0;
        } else {
            maiorNumero = numero;
            menorNumero = numero;
        }
        
        // Estrutura de repetição referente a repetição das operações
        while (numero != 30000) {
            somaNumero = somaNumero + numero;
            qtdNumero++;
            mediaNumero = somaNumero / qtdNumero;
            
            
            if (maiorNumero < numero) {
                maiorNumero = numero;
            }
            if (menorNumero > numero) {
                menorNumero = numero;
            }
            
            if (numero%2 == 0) {
                somaNumPar = (int) (somaNumPar + numero);
                qtdNumPar++;
                mediaNumPar = somaNumPar / qtdNumPar;
            } else if (numero%2 > 0) {
                qtdNumImpar++;
                pctNumImpar = (qtdNumImpar * 100) / qtdNumero;
            }
            
            System.out.println("\nPara encerrar a entrada de dados digite 30.000");
            System.out.print("Digite o próximo número: ");
            numero = entrada.nextFloat();
        }
        
        System.out.println("\n\nSoma dos números               -> "+fmtNumero.format(somaNumero));
        System.out.println("Quantidade de números          -> "+fmtNumero.format(qtdNumero));
        System.out.println("Média dos números              -> "+fmtNumero.format(mediaNumero));
        System.out.println("Maior número                   -> "+fmtNumero.format(maiorNumero));
        System.out.println("Menor número                   -> "+fmtNumero.format(menorNumero));
        System.out.println("Média de números pares         -> "+fmtNumero.format(mediaNumPar));
        System.out.println("Porcentagem de números ímpares -> "+fmtNumero.format(pctNumImpar)+"%\n");
        
        entrada.close();
    }
}
