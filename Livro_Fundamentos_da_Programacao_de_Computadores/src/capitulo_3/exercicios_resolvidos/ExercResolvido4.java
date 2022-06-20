/**
@author kauas - 27/03/2022 Domingo
Livro: Fundamentos da Programação de Computadores
Capítulo 3, Exercício Resolvido 4, pág.39
*/

/*
Faça um programa que receba o salário de um funcionário, calcule e mostre o novo
salário, sabendo-se que este sofreu um aumento de 25%.
*/
package capitulo_3.exercicios_resolvidos;

import java.util.Scanner;
import java.text.DecimalFormat;

public class ExercResolvido4 {

    public static void main(String[] args) {
        // Declaração de variáveis
        Scanner entrada = new Scanner(System.in);
        DecimalFormat casas = new DecimalFormat("0.00");
        float salario, aumento, salarioAumentado;
        
        // Coletar dado
        System.out.print("Digite o salário: ");
        salario = entrada.nextFloat();
        
        // Operações referentes ao salário com aumento
        aumento = salario * 0.25F;
        salarioAumentado = salario + aumento;
        
        // Exibir dados
        System.out.println("\nO seu salário atual é R$"+casas.format(salario));
        System.out.println("O seu aumento de 25% é R$"+casas.format(aumento));
        System.out.println("O seu salário com o aumento é R$"+casas.format(salarioAumentado));

        entrada.close();
    }
    
}
