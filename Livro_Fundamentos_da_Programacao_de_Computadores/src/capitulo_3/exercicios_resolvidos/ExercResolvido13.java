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

public class ExercResolvido13 {

    public static void main(String[] args) {
        // Declaração de variáveis
        Scanner entrada = new Scanner(System.in);
        float pes, polegadas, jardas, milhas;
        
        // Coletar dado
        System.out.print("Digite um valor em pés: ");
        pes = entrada.nextFloat();
        
        // Operações referentes a polegadas, jardas e milhas
        polegadas = pes * 12;
        jardas = pes / 3;
        milhas = jardas / 1760;
        
        // Exibir dados
        System.out.println("Pés: "+pes);
        System.out.println("Polegadas: "+polegadas);
        System.out.println("Jardas: "+jardas);
        System.out.println("Milhas: "+milhas);

        entrada.close();
    }
}
