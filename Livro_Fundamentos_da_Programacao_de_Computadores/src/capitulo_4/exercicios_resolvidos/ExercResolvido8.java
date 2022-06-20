/**
@author kauas - 14/04/2022 Quinta
Livro: Fundamentos da Programação de Computadores
Capítulo 4, Exercício Resolvido 8, pág.67
*/

/*
Faça um programa que mostre o menu de opções a seguir, receba a opção do usuário
e os dados necessários para executar cada operação.

Menu de opções:
1. Somar dois números.
2. Raiz quadrada de um número.
Digite a opção desejada:
*/
package capitulo_4.exercicios_resolvidos;

import java.util.Scanner;

public class ExercResolvido8 {
    
    public static void main(String[] args) {
        // Declaração de variáveis
        Scanner entrada = new Scanner(System.in);
        int opcao;
        float num1, num2, soma, raiz;
        
        // Coletar dado
        System.out.print("----- MENU -----\n[1] - Somar dois números\n[2] - Raiz quadrada de um número\n<< ");
        opcao = entrada.nextInt();
        
        // Desvio condicional referente a opção
        switch (opcao) {
            case 1:
                System.out.println("Digite dois números: ");
                num1 = entrada.nextFloat();
                num2 = entrada.nextFloat();
                
                soma = num1 + num2;
                
                System.out.println(num1+" + "+num2+" = "+soma);
                break;
            case 2:
                System.out.print("Digite um número: ");
                num1 = entrada.nextFloat();
                
                raiz = (float) Math.sqrt(num1);
                
                System.out.println("Raiz: "+raiz);
                break;
            default:
                System.out.println("Não existe essa opção");
                break;
        }

        entrada.close();
    }
}
