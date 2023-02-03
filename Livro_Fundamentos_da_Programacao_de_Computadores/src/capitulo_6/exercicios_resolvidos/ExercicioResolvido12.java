/**
 * @author kauas - 02/01/2023 Quinta
 * Livro: Fundamentos da Programação de Computadores
 * Capítulo 6, Exercício Proposto 12, pág. 174
 */

/*
Faça um programa que preencha um vetor com os modelos de cinco carros (exemplos de modelos: Fusca,
Gol, Vectra etc). Carregue outro vetor com o consumo desses carros, isto é, quantos quilômetros cada um
deles faz com um litro de combustível. Calcule e mostre:

- o modelo de carro mais econômico; e
- quantos litros de combustível cada um dos carros cadastrados consome para percorrer uma
  distância de 1.000 km.
*/

package capitulo_6.exercicios_resolvidos;

import java.util.Scanner;

public class ExercicioResolvido12 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int qtdCarro = 5;
        int[] consumo = new int[qtdCarro];
        int[] consumo1000 = new int[qtdCarro];
        String[] carros = new String[qtdCarro];
        int consumoEconomico;
        String modeloEconomico;
        int i;


        // ========== Loop para preencher os dados dos veículos ==========
        System.out.println();
        for (i=0; i<qtdCarro; i++) {
            System.out.print("\nDigite um modelo de veículo ("+(i+1)+"/"+qtdCarro+"): ");
            carros[i] = scanner.nextLine();
            
            System.out.print("Quantos quilômetros o "+carros[i]+" faz com um litro de gasolina: ");
            consumo[i] = scanner.nextInt();
            scanner.nextLine();
        }


        // ========== Loop para descobrir o veículo mais econômico ==========
        consumoEconomico = 0;
        modeloEconomico = "";
        for (i=0; i<qtdCarro; i++) {
            if (consumo[i] > consumoEconomico) {
                consumoEconomico = consumo[i];
                modeloEconomico = carros[i];
            }
        }


        // ========== Loop para descobrir quanto consome cada veículo em 1000 km ==========
        for (i=0; i<qtdCarro; i++) {
            consumo1000[i] = 1000/consumo[i];
        }

        System.out.println("\n\n------------------------------------------------");
        System.out.println("\nCarro mais econômico: "+modeloEconomico);
        System.out.println("\n--- Simulação de 1.000 km ---");

        for (i=0; i<qtdCarro; i++) {
            System.out.println("O "+carros[i]+" consumiria "+consumo1000[i]+" litros");
        }

    }

}