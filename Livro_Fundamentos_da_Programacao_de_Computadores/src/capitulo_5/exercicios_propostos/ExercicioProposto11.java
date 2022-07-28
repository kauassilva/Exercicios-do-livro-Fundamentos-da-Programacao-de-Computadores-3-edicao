/**
 * @author kauas - 28/07/2022 quinta
 * Livro: Fundamentos da Programação de Computadores
 * Capítulo 5, Exercício Proposto 11, pág. 147
 */

/*
Faça um programa que receba o valor de um carro e mostre uma tabela com os
seguintes dados: preço final, quantidade de parcelas e valor da parcela.
Considere o seguinte:

- O preço final para compra à vista tem desconto de 20%;
- A quantidade de parcelas pode ser: 6, 12, 18, 24, 30, 36, 42, 48, 54 e 60; e
- Os percentuais de acréscimo encontram-se na tabela a seguir.
  [imagem, pág. 148]
*/
package capitulo_5.exercicios_propostos;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class ExercicioProposto11 {
    
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Locale localBR = new Locale("pt","BR");
        
        NumberFormat fmtDinheiro = NumberFormat.getCurrencyInstance(localBR);
        
        float valorCarro, valorParcela, precoFinal, porcentagem;
        
        valorParcela = 0;
        
        System.out.print("Digite o valor do carro: ");
        valorCarro = entrada.nextFloat();
        
        // Estrutura de repetição baseado na quantidade máxima de parcelas
        for (int i=0; i<=60; i+=6) {
            if (i==0) {
                porcentagem = 20;
                precoFinal = valorCarro - ((valorCarro * porcentagem) / 100);
            } else {
                porcentagem = i / 2;
                precoFinal = valorCarro + ((valorCarro * porcentagem) / 100);
                valorParcela = precoFinal / i;
            }
            System.out.println("\n-------------------------\n");
            System.out.println("Preço final: "+fmtDinheiro.format(precoFinal));
            System.out.println("Qtd. parcelas: "+i);
            System.out.println("Preço parcela: "+fmtDinheiro.format(valorParcela));
        }
        
        System.out.println("");
        
        entrada.close();
    }
}
