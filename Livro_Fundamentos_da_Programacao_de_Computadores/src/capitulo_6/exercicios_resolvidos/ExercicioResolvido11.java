/**
 * @author kauas - 02/02/2023 Quinta
 * Livro: Fundamentos da Programação de Computadores
 * Capítulo 6, Exercício Resolvido 11, pág. 172
 */

/*
Faça um programa que receba a temperatura média de cada mês do ano, armazenando-se em um vetor.
Calcule e mostre a maior e a menor temperatura do ano e em que mês ocorreram (mostre o mês por
extenso: 1 - janeiro, 2 - fevereiro...). Desconsidere empates.
*/


import java.util.Scanner;

public class ExercicioResolvido11 {
	
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int[] tempMes = new int[12];
        String[] mes = {"janeiro","fevereiro","março","abril","maio","junho","julho","agosto","setembro","outubro","novembro","dezembro"};
        int i, maxMes, minMes;
        int maxTemp, minTemp;


        // ========== Loop para preencher a temperatura média dos meses ==========
        System.out.println();
        for (i=0; i<12; i++) {
            System.out.print("Digite a temperatura média do mês de "+mes[i]+": ");
            tempMes[i] = scanner.nextInt();
        }


        // ========== Loop para definir a maior e menor temperatura do ano e o respectivo mês ==========
        maxTemp = tempMes[0];
        minTemp = tempMes[0];
        maxMes = 0;
        minMes = 0;

        for (i=1; i<12; i++) {
            if (tempMes[i] > maxTemp) {
                maxTemp = tempMes[i];
                maxMes = i;
            }

            if (tempMes[i] < minTemp) {
                minTemp = tempMes[i];
                minMes = i;
            }
        }

        System.out.println("\nMaior temperatura do ano: "+maxTemp+"° em "+mes[maxMes]);
        System.out.println("Menor temperatura do ano: "+minTemp+"° em "+mes[minMes]);

    }
}
