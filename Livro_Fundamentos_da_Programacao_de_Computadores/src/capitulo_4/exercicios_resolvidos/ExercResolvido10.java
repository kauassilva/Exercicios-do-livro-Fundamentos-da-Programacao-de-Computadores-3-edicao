/**
@author kauas - 14/04/2022 Quinta
Livro: Fundamentos da Programação de Computadores
Capítulo 4, Exercício Resolvido 10, pág.70
*/

/*
Faça um programa que determine a data cronologicamente maior entre duas datas
fornecidas pelo usuário. Cada data deve ser composta por três valores inteiros,
em que o primeiro representa o dia, segundo, o mês, terceiro, o ano.
*/
package capitulo_4.exercicios_resolvidos;

import java.util.Scanner;

public class ExercResolvido10 {
    
    public static void main(String[] args) {
        // Declaração de variáveis
        Scanner entrada = new Scanner(System.in);
        int dia1, mes1, ano1, dia2, mes2, ano2;
        
        // Coletar dados
        System.out.print("Digite o número de um dia: ");
        dia1 = entrada.nextInt();
        System.out.print("Digite o número de um mês: ");
        mes1 = entrada.nextInt();
        System.out.print("Digite um ano: ");
        ano1 = entrada.nextInt();
        System.out.print("\nDigite o número de um dia: ");
        dia2 = entrada.nextInt();
        System.out.print("Digite o número de um mês: ");
        mes2 = entrada.nextInt();
        System.out.print("Digite um ano: ");
        ano2 = entrada.nextInt();
        
        // Exibir dados
        System.out.println("\nPrimeira data: "+dia1+"/"+mes1+"/"+ano1);
        System.out.println("Segunda data: "+dia2+"/"+mes2+"/"+ano2);
        
        // Desvio condicional referente a maior data
        if (ano1 > ano2) {
            System.out.println("\nA maior data: "+dia1+"/"+mes1+"/"+ano1);
        } else if (ano1 < ano2) {
            System.out.println("\nA maior data: "+dia2+"/"+mes2+"/"+ano2);
        } else {
            if (mes1 > mes2) {
                System.out.println("\nA maior data: "+dia1+"/"+mes1+"/"+ano1);
            } else if (mes1 < mes2) {
                System.out.println("\nA maior data: "+dia2+"/"+mes2+"/"+ano2);
            } else {
                if (dia1 > dia2) {
                    System.out.println("\nA maior data: "+dia1+"/"+mes1+"/"+ano1);
                } else {
                    System.out.println("\nA maior data: "+dia2+"/"+mes2+"/"+ano2);
                }
            }
        }

        entrada.close();
    }
}
