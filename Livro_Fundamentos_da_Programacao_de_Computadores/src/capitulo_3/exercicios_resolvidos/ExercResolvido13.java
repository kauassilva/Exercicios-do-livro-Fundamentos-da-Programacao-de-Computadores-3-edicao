/**
@author kauas - 27/03/2022 Domingo
Livro: Fundamentos da Programação de Computadores
Capítulo 3, Exercício Resolvido 13, pág.43
*/

/*
Sabe-se que:
1 Pé = 12 polegadas
1 jarda = 3 pés
1 milha = 1,760 jarda
Faça um programa que receba uma medida em pés, faça as conversões a seguir e
mostre os resultados.
a) Polegadas;
b) Jardas;
c) Milhas.
*/
package capitulo_3.exercicios_resolvidos;

import java.util.Scanner;
import java.text.DecimalFormat;

public class ExercResolvido13 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        DecimalFormat casas = new DecimalFormat("0.0000");
        float pes, polegadas, jardas, milhas;
        
        System.out.print("Digite um valor em pés: ");
        pes = entrada.nextFloat();
        
        polegadas = pes * 12;
        jardas = pes / 3;
        milhas = jardas / 1760;
        
        System.out.println("Pés: "+casas.format(pes));
        System.out.println("Polegadas: "+casas.format(polegadas));
        System.out.println("Jardas: "+casas.format(jardas));
        System.out.println("Milhas: "+casas.format(milhas));

        entrada.close();
    }
}
