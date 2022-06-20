/**
@author kauas - 14/04/2022 Quinta
Livro: Fundamentos da Programação de Computadores
Capítulo 4, Exercício Resolvido 2, pág.62
*/

/*
Faça um programa que receba três notas de um aluno, calcule e mostre a média
aritmética e a mensagem constante na tabela a seguir. Aos alunos que ficaram 
para exame, calcule e mostre a nota que deverão tirar para serem aprovados,
considerando que a média exigida é 6,0
[imagem, pág. 62]
*/
package capitulo_4.exercicios_resolvidos;

import java.text.DecimalFormat;
import java.util.Scanner;

public class ExercResolvido2 {
    
    public static void main(String[] args) {
        // Declaração de variáveis
        Scanner entrada = new Scanner(System.in);
        DecimalFormat casas= new DecimalFormat("0.00");
        float nota1, nota2, nota3, media, notaExame;
        
        // Coletar dados
        System.out.println("Digite as três notas:");
        nota1 = entrada.nextFloat();
        nota2 = entrada.nextFloat();
        nota3 = entrada.nextFloat();
        
        // Operação referente a média
        media = (nota1 + nota2 + nota3) / 3;
        
        // Exibir dado
        System.out.println("Média: "+casas.format(media));
        
        // Desvio condicional referente a situação do aluno
        if (media>=0 && media<3) {
            System.out.println("Reprovado");
        } else if (media>=3 && media<7) {
            System.out.println("Exame");
            
            // Operação referente a nota exigida para aprovação
            notaExame = 12 - media;
            
            // Exibir dado
            System.out.println("Deve tirar nota "+casas.format(notaExame)+" para ser aprovado");
        } else if (media>=7 && media<=10) {
            System.out.println("Aprovado");
        } else {
            System.out.println("Algo inesperado ocorreu...");
        }

        entrada.close();
    }
}
