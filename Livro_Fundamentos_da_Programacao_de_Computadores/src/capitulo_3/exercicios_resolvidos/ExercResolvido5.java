/**
@author kauas - 27/03/2022 Domingo
Livro: Fundamentos da Programação de Computadores
Capítulo 3, Exercício Resolvido 5, pág.39
*/

/*
Faça um algoritmo que receba o salário de um funcionário e o percentual, calcule
e mostre o valor do aumento e o novo salário.
*/
package capitulo_3.exercicios_resolvidos;

import java.util.Scanner;
import java.text.DecimalFormat;

public class ExercResolvido5 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        DecimalFormat casas = new DecimalFormat("0.00");
        float salario, percentual, aumento, salarioAumentado;
        
        System.out.print("Digite o salário: ");
        salario = entrada.nextFloat();
        System.out.print("Digite o percentual: ");
        percentual = entrada.nextFloat();
        
        aumento = salario * (percentual/100);
        salarioAumentado = salario + aumento;
        
        System.out.println("O seu salário é R$"+casas.format(salario));
        System.out.println("O seu aumento de "+percentual+"% é R$"+casas.format(aumento));
        System.out.println("O seu salário com o aumento é R$"+casas.format(salarioAumentado));

        entrada.close();
    }
    
}
