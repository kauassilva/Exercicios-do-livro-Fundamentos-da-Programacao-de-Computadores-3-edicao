/**
 * @author kauas - 28/06/2022 Terça
 * Livro: Fundamentos da Programação de Computadores
 * Capítulo 5, Exercício Resolvido 17, pág. 135
 */

/*
Faça um programa que receba o salário de um funcionário chamado Carlos. Sabe-se
que outro funcionário, João, tem salário equivalente a um terço do salário de
Carlos. Carlos aplicará seu salário integralmente na caderneta de poupança, que
rende 2% ao mês, e João aplicará seu salário integralmente no fundo de renda
fixa, que rende 5% ao mês. O programa deverá calcular e mostrar a quantidade de
meses necessários para que o valor pertencente a João iguale ou ultrapasse o
valor pertencente a Carlos.
*/
package capitulo_5.exercicios_resolvidos;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class ExercicioResolvido17 {
    
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Locale localBR = new Locale("pt","BR");
        
        NumberFormat fmtDinheiro = NumberFormat.getCurrencyInstance(localBR);
        
        float salCarlos, salJoao;
        int qtdMeses;
        
        salCarlos = 0;
        qtdMeses = 0;
        
        // Estrutura de repetição referente a dado inválido
        do {
            System.out.print("Digite o salário de Carlos: ");
            salCarlos = entrada.nextFloat();
            
            if (salCarlos <= 0) {
                System.out.println("\nO valor para o salário é inválido!\n");
            }
        } while (salCarlos <= 0);
        
        salJoao = salCarlos / 3;
        
        // Estrutura de repetição referente a quantidade de meses necessários para que o valor de João seja maior de que Carlos
        while (salJoao <= salCarlos) {
            qtdMeses++;
            salCarlos = salCarlos + (salCarlos * 2 / 100);
            salJoao = salJoao + (salJoao * 5 / 100);
        }
        
        System.out.println("\nQuantidade de meses necessários para que o salário de João seja igual ou maior que o de Carlos: "+qtdMeses);
        System.out.println("Valor que Carlos pertence: "+fmtDinheiro.format(salCarlos));
        System.out.println("Valor que João pertence: "+fmtDinheiro.format(salJoao));
    }
}
