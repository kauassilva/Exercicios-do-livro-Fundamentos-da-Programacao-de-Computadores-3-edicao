/**
 * @author kauas - 27/08/2022 Sábado
 * Livro: Fundamentos da Programação de Computadores
 * Capítulo 6, Exercício Proposto 2, pág. 159
 */

/*
Uma pequena loja de artesanato possui apenas um vendedor e comercializa dez tipos de objetos. O
vendedor recebe, mensalmente, salário de R$ 545,00, acrescido de 5% do valor total de suas vendas.
O valor unitário dos objetos deve ser informado e armazenado em um vetor; a quantidade vendida de
cada peça deve ficar em outro vetor, mas na mesma posição. Crie um programa que receba os preços
e as quantidades vendidas, armazenando-os em seus respectivos vetores (ambos com tamanho dez).
Depois, determine e mostre:

* Um relatório contendo: quantidade vendida, valor unitário e valor total de cada objeto. Ao final,
  deverão ser mostrados o valor geral das vendas e o valor da comissão que será paga ao vendedor; e
* O valor do objeto mais vendido e sua posição no vetor (não se preocupe com empates).
*/

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class ExercicioResolvido2 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Locale localBR = new Locale("pt", "br");
        
        NumberFormat fmtDinheiro = NumberFormat.getCurrencyInstance(localBR);
        
        int qtdObjeto, porcentagem, objtMaisVendido, posicao;
        float valorTotalObjeto, valorVenda, valorComissao, valor;
        
        qtdObjeto = 10;
        valorVenda = 0;
        porcentagem = 5;
        objtMaisVendido = 0;
        valor = 0;
        posicao = 0;
        
        float valorObjeto[] = new float[qtdObjeto];
        int qtdVendida[] = new int[qtdObjeto];       
        
        // Estrutura de repetição para preenchimento do vetor de valor unitário e a quantidade vendida
        for (int i=0; i<qtdObjeto; i++) {
            System.out.print("Digite o valor unitário do Objeto "+(i+1)+": ");
            valorObjeto[i] = entrada.nextFloat();
            
            System.out.print("Digite a quantidade vendida do Objeto "+(i+1)+": ");
            qtdVendida[i] = entrada.nextInt();
            
            System.out.println();
        }
        
        for (int i=0; i<qtdObjeto; i++) {
            valorTotalObjeto = qtdVendida[i] * valorObjeto[i];
            valorVenda += valorTotalObjeto;
            
            if (objtMaisVendido < qtdVendida[i]) {
                objtMaisVendido = qtdVendida[i];
                valor = valorObjeto[i];
                posicao = i;
            }
            
            System.out.println("--- Dados do Objeto "+(i+1)+" ---");
            System.out.println("Quantidade vendida: "+qtdVendida[i]);
            System.out.println("Valor unitário: "+fmtDinheiro.format(valorObjeto[i]));
            System.out.println("Valor total: "+fmtDinheiro.format(valorTotalObjeto));
            
            System.out.println();
        }
        
        
        valorComissao = (valorVenda * porcentagem) / 100;
        
        System.out.println("\n--- Relatório Final ---\n");
        System.out.println("Valor da comissão ("+porcentagem+"%): "+fmtDinheiro.format(valorComissao));
        System.out.println("Valor do objeto mais vendido: "+fmtDinheiro.format(valor));
        System.out.println("Posição do objeto mais vendido: "+posicao);
        
        System.out.println();
        
        entrada.close();
    }
}
