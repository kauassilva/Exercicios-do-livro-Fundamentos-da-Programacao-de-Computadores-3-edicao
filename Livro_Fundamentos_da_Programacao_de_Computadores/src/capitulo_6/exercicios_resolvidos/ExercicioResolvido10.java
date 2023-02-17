/**
 * @author kauas - 01/02/2023 Quarta
 * Livro: Fundamentos da Programação de Computadores
 * Capítulo 6, Exercício Proposto 10, pág. 171
 */

/*
Faça um programa para corrigir provas de múltipla escolha. Cada prova tem oito questões e cada
questão vale um ponto. O primeiro conjunto de dados a ser lido é o gabarito da prova. Os outros
dados são os números dos alunos e as respostas que deram às questões. Existem dez alunos matriculados.
Calcule e mostre:

- o número e a nota de cada aluno; e
- a porcentagem de aprovação, sabendo-se que a nota mínima é 6.
*/


import java.util.Scanner;

public class ExercicioResolvido10 {
  
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		int qtdQuestao = 8;
		int qtdAluno = 10;
		int qtdAprovado = 0;
		int notaMin = 6;
		int i, j, z;
		double pctAprovado = 0;
		int[] numAluno = new int[qtdAluno];
		int[] nota = new int[qtdAluno];
		char[] gabarito = new char[qtdQuestao];
		char resposta;


		// ========== Loop para o preenchimento do gabarito ==========
		System.out.println("\n--- Dados do Gabarito ---");

		for (i=0; i<qtdQuestao; i++) {
			System.out.print("Alternativa correta da questão "+(i+1)+": ");
			gabarito[i] = scanner.nextLine().charAt(0);
		}
		

		// ========== Loop para preenchimento das alternativas dos alunos ==========
		for (i=0; i<qtdAluno; i++) {
			System.out.println("\n\n--- Dados do Aluno ---");
			System.out.print("Digite o número do aluno: ");
			numAluno[i] = scanner.nextInt();
			scanner.nextLine();
			z=0;

			for (j=0; j<qtdQuestao; j++) {
				System.out.print("Digite a alternativa da questão "+(j+1)+" do aluno "+numAluno[i]+": ");
				resposta = scanner.nextLine().charAt(0);

				if (resposta == gabarito[j]) {
					z++;
				}
			}

			nota[i] = z;
		}


		// ========== Loop para calcular a porcentagem de alunos aprovados ==========
		for (i=0; i<qtdAluno; i++) {
			if (nota[i] >= notaMin) {
				qtdAprovado++;
			}
		}
		pctAprovado = (qtdAprovado*100)/qtdAluno;


		// ========== Loop para exibir o número e a nota do aluno ==========
		for (i=0; i<qtdAluno; i++) {
			System.out.println("\nNúmero do aluno: "+numAluno[i]);
			System.out.println("Nota do aluno: "+nota[i]);
		}

		System.out.println("\nPorcentagem de alunos aprovados: "+pctAprovado+"%\n");

	}

}
