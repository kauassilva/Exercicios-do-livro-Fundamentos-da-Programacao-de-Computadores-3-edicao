/**
@author kauas - 14/04/2022 Quinta
Livro: Fundamentos da Programação de Computadores
Capítulo 4, Exercício Resolvido 12, pág.72
*/

/*
Faça um programa que receba o código correspondente ao cargo de um funcionário e
seu salário atual e mostre o cargo, o valor do aumento e seu novo salário. Os
cargos estão na tabela a seguir.
[imagem, pág. 72]
*/
package capitulo_4.exercicios_resolvidos;

import java.text.DecimalFormat;
import java.util.Scanner;

public class ExercResolvido12 {
    
    public static void main(String[] args) {
        // Declaração de variáveis
        Scanner entrada = new Scanner(System.in);
        DecimalFormat casas = new DecimalFormat("0.00");
        int id;
        float salAtual, salNovo, aumento;
        
        // Coletar dados
        System.out.print("Digite o código correspondente ao seu cargo: ");
        id = entrada.nextInt();
        System.out.print("Digite o seu salário atual: ");
        salAtual = entrada.nextFloat();
        
        // Desvio condicional referente ao salário com aumento
        switch (id) {
            case 1 -> {
                aumento = salAtual * 0.5F;
                salNovo = salAtual + aumento;
                System.out.println("\nSeu cargo é de Escrituário(a)\nSeu aumento de 50% corresponde a R$ "+casas.format(aumento)+"\nSeu novo salário é de R$ "+casas.format(salNovo));
            }
            case 2 -> {
                aumento = salAtual * 0.35F;
                salNovo = salAtual + aumento;
                System.out.println("\nSeu cargo é de Secretário(a)\nSeu aumento de 35% corresponde a R$ "+casas.format(aumento)+"\nSeu novo salário é de R$ "+casas.format(salNovo));
            }
            case 3 -> {
                aumento = salAtual * 0.2F;
                salNovo = salAtual + aumento;
                System.out.println("\nSeu cargo é de Caixa\nSeu aumento de 20% corresponde a R$ "+casas.format(aumento)+"\nSeu novo salário é de R$ "+casas.format(salNovo));
            }
            case 4 -> {
                aumento = salAtual * 0.1F;
                salNovo = salAtual + aumento;
                System.out.println("\nSeu cargo é de Gerente\nSeu aumento de 10% corresponde a R$ "+casas.format(aumento)+"\nSeu novo salário é de R$ "+casas.format(salNovo));
            }
            case 5 -> System.out.println("\nSeu cargo é de Escrituário\nNão há aumento");
            default -> System.out.println("Não existe cargo com este código");
        }

        entrada.close();
    }
}
