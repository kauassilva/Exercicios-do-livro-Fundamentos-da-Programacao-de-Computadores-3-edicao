/**
@author kauas - 27/03/2022 Domingo
Livro: Fundamentos da Programação de Computadores
Capítulo 3, Exercício Resolvido 14, pág.44
*/

/*
Faça um programa que receba o ano de nascimento de uma pessoa e o ano atual, 
calcule e mostre:
a) A idade dessa pessoa;
b) Quantos anos ela terá em 2050.
*/
package capitulo_3.exercicios_resolvidos;

import java.util.Scanner;

public class ExercResolvido14 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int anoNasc, anoAtual, idade, idade2050;
        
        System.out.print("Digite o ano de nascimento: ");
        anoNasc = entrada.nextInt();
        System.out.print("Digite o ano atual: ");
        anoAtual = entrada.nextInt();
        
        idade = anoAtual - anoNasc;
        idade2050 = 2050 - anoNasc;
        
        System.out.println("A sua idade é "+idade+" anos");
        System.out.println("A sua idade no ano de 2050 é "+idade2050+" anos");

        entrada.close();
    }
    
}
