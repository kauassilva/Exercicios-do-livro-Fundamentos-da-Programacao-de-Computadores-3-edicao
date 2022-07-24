/**
 * @author kauas - 23/07/2022 sexta
 * Livro: Fundamentos da Programação de Computadores
 * Capítulo 5, Exercício Proposto 2, pág. 146
 */

/*
Uma companhia de teatro deseja montar uma série de espetáculos. A direção
calcula que, a R$ 5,00 o ingresso, serão vendidos 120 ingressos, e que as
depesas serao de R$ 200,00. Diminuindo-se em R$ 0,50 o preço dos ingressos,
espera-se que as vendas aumentem em 26 ingressos, fazendo-se variar esse preço
de R$ 5,00 a R$ 1,00, de R$ 0,50 em R$ 0,50. Escreva, ainda, para cada novo
preço de ingresso, o lucro máximo esperado, o preço do ingresso e a quantidade
de ingressos vendidos para a obtenção desse lucro.
*/
package capitulo_5.exercicios_propostos;

import java.text.NumberFormat;
import java.util.Locale;

public class ExercicioProposto2 {
    
    public static void main(String[] args) {
        Locale localBR = new Locale("pt","BR");
        
        NumberFormat fmtDinheiro = NumberFormat.getCurrencyInstance(localBR);
        
        float precoIngresso, despesa, lucro;
        int qtdIngresso;
        
        precoIngresso = 5;
        qtdIngresso = 120;
        despesa = 200;
        
        lucro = precoIngresso * qtdIngresso - despesa;
        
        while (precoIngresso >= 1) {
            System.out.println("Preço do ingresso: "+fmtDinheiro.format(precoIngresso));
            System.out.println("Qtd. esperada de ingressos vendidos: "+qtdIngresso);
            System.out.println("Despesa: "+fmtDinheiro.format(despesa));
            System.out.println("Lucro: "+fmtDinheiro.format(lucro));
            System.out.println("\n-------------------------------------\n");
            
            precoIngresso -= 0.5;
            qtdIngresso += 26;
            lucro = precoIngresso * qtdIngresso - despesa;
        }
    }
}
