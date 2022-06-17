/**
@author kauas - 16/04/2022 Quinta
Livro: Fundamentos da Programação de Computadores
Capítulo 4, Exercício Resolvido 14, pág.76
*/

/*
Faça um programa que receba o salário inicial de um funcionário, calcule e
mostre o novo salário, acrescido de bonificação e de auxílio escola.
[imagem, pág. 76]
*/
package capitulo_4.exercicios_resolvidos;

import java.text.DecimalFormat;
import java.util.Scanner;

public class ExercResolvido14 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		DecimalFormat casas = new DecimalFormat("0.00");
		int porcentagem = 0;
		float salInicial, salNovo, bonificacao, auxEscola;

		System.out.print("Digite o salário: ");
		salInicial = entrada.nextFloat();

		if (salInicial <= 0) {
			System.out.println("Salário inválido");
		} else {
			if (salInicial < 500) {
				porcentagem = 5;
				bonificacao = (salInicial * porcentagem) / 100;
			} else if (salInicial >= 500 && salInicial <= 1200) {
				porcentagem = 12;
				bonificacao = (salInicial * porcentagem) / 100;
			} else {
				bonificacao = 0;
			}

			if (salInicial < 600) {
				auxEscola = 150;
			} else {
				auxEscola = 100;
			}

			salNovo = salInicial + bonificacao + auxEscola;

			System.out.println("\nBonificação (" + porcentagem + "%): R$ " + casas.format(bonificacao));
			System.out.println("Auxálio Escola:    R$ " + casas.format(auxEscola));
			System.out.println("Salário novo:      R$ " + casas.format(salNovo));
		}

		entrada.close();
	}
}
