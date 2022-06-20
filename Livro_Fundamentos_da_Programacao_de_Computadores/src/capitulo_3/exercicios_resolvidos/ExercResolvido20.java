/**
@author kauas - 27/03/2022 Domingo
Livro: Fundamentos da Programação de Computadores
Capítulo 3, Exercício Resolvido 20, pág.47
*/

/*
Faça um programa que receba a medida do Ângulo (em graus) formado por uma escada
apoiada no chão encostada na parede e a altura da parede onde está ponta da
escada. Calcule e mostre a medida dessa escada.
Observação: as funções trigonométricas implementadas nas linguagens de
programação trabalham com medidas de ângulos em radianos.
[imagem no livro| pág.47]
*/
package capitulo_3.exercicios_resolvidos;

import java.util.Scanner;
import java.text.DecimalFormat;

public class ExercResolvido20 {

    public static void main(String[] args) {
        // Declaração de variáveis
        Scanner entrada = new Scanner(System.in);
        DecimalFormat casas = new DecimalFormat("0.00");
        float angulo, altura, escada, radiano;
        
        // Coletar dados
        System.out.print("Digite o ângulo em graus da escada: ");
        angulo = entrada.nextFloat();
        System.out.print("digite a altura em metros da parede: ");
        altura = entrada.nextFloat();
        
        // Operações referentes a medida da escada
        radiano = (float) Math.toRadians(angulo); // Converte grau para radiano
        escada = (float) (altura / Math.sin(radiano)); // calcula o seno
        
        // Exibir dados
        System.out.println("\n"+angulo+"° em radianos, equivale a "+casas.format(radiano));
        System.out.println("A escada mede "+casas.format(escada)+" metros");

        entrada.close();
    }
    
}
