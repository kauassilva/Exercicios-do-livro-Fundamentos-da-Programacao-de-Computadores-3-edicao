/**
@author kauas - 31/03/2022 Quinta
Livro: Fundamentos da Programação de Computadores
Capítulo 3, Exercício Proposto 14, pág.51
*/

/*
Faça um programa que receba o ano de nascimento de uma pessoa e o ano atual,
calcule e mostre:
a) A idade dessa pessoa em anos;
b) A idade dessa pessoa em meses;
c) A idade dessa pessoa em dias;
d) A idade dessa pessoa em semanas;
*/
package capitulo_3.exercicios_propostos;

import java.util.Scanner;

public class ExercProposto14 {
    
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int anoNasc, anoAtual, idadeAnos;
        float idadeMes, idadeDias, idadeSem;
        
        System.out.print("Digite o ano de nascimento: ");
        anoNasc = entrada.nextInt();
        System.out.print("Digite o ano atual: ");
        anoAtual = entrada.nextInt();
        
        idadeAnos = anoAtual - anoNasc;
        idadeMes = idadeAnos * 12;
        idadeSem = idadeMes * 4.3452381F;
        idadeDias = idadeSem * 7;
        
        System.out.println("Idade em anos: "+idadeAnos);
        System.out.println("Idade em meses: "+idadeMes);
        System.out.println("Idade em semanas: "+idadeSem);
        System.out.println("Idade em dias: "+idadeDias);

        entrada.close();
    }
}
