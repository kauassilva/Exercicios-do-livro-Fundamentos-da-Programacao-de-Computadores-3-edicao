/**
@author kauas - 27/03/2022 Domingo
Livro: Fundamentos da Programação de Computadores
Capítulo 3, Exercício Resolvido 18, pág.46
*/

/*
Pedro comprou um saco de ração com peso em quilos. Ele possui dois gatos, para
os quais fornece a quantidade de ração em gramas. A quantidade diária de ração
fornecida para cada gato é sempre a mesma. Faça um programa que receba o peso do
saco de ração e a quantidade de ração fornceida para cada gato, calcule e mostre
quanto restará de ração no saco após cinco anos.
*/
package capitulo_3.exercicios_resolvidos;

import java.util.Scanner;

public class ExercResolvido18 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        float pesoSaco, pesoFinal, quantRacaoGato1, quantRacaoGato2;
        
        System.out.print("Digite o peso do saco de ração em quilos: ");
        pesoSaco = entrada.nextFloat();

        System.out.println("Digite a quantidade de ração em gramas para cada gato por ano: ");
        quantRacaoGato1 = entrada.nextInt();
        quantRacaoGato2 = entrada.nextInt();
        
        quantRacaoGato1 = quantRacaoGato1 / 1000;
        quantRacaoGato2 = quantRacaoGato2 / 1000;
        pesoFinal = pesoSaco - 5 * (quantRacaoGato1 + quantRacaoGato2);
        
        System.out.println("Após 5 anos, restára um total de "+pesoFinal+"kg no saco");

        entrada.close();
    }
    
}
