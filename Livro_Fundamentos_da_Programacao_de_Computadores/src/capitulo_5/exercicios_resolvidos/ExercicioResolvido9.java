/**
@author kauas - 17/06/2022 sexta
Livro: Fundamentos da Programação de Computadores
Capítulo 5, Exercício Resolvido 9, pág.124
*/

/*
Faça um programa que receba duas notas de seis alunos. Calcule e mostre:
- A média aritmética das duas notas de cada aluno; e
- A mensagem que está na tabela a seguir:
[imagem, pág.125]
- O total de alunos aprovados;
- O total de alunos de exame;
- O total de alunos reprovados;
- A média da classe.
*/
package capitulo_5.exercicios_resolvidos;

import java.text.DecimalFormat;
import java.util.Scanner;

public class ExercicioResolvido9 {
    
    public static void main(String[] args) {
        // Declaração de variáveis
        Scanner entrada = new Scanner(System.in);
        DecimalFormat casas = new DecimalFormat("0.00");
        float nota1, nota2, mediaAluno, somaClasse=0, mediaClasse=0;
        int qtdAprovado=0, qtdExame=0, qtdReprovado=0;
        String mensagem="";
        
        // Laço de repetição baseado na quantidade de alunos
        for (int i=1; i<=6; i++) {
            // Coletar dados
            System.out.print("\nDigite a primeira nota: ");
            nota1 = entrada.nextFloat();
            System.out.print("Digite a segunda nota: ");
            nota2 = entrada.nextFloat();

            // Operações referentes a média do aluno e classe
            mediaAluno = (nota1+nota2) / 2;
            somaClasse = somaClasse + mediaAluno;
            mediaClasse = somaClasse / 6;

            // Desvio condicional referente a quantidade de reprovados, exames e aprovados
            if (mediaAluno>=0 && mediaAluno<=3) {
                mensagem = "Reprovado";
                qtdReprovado++;
            } else if (mediaAluno>3 && mediaAluno < 7) {
                mensagem = "Exame";
                qtdExame++;
            } else if (mediaAluno >= 7) {
                mensagem = "Aprovado";
                qtdAprovado++;
            } else {
                System.out.println("Uma das notas são inválidas!");
                System.exit(0);
            }

            // Exibir dados
            System.out.println("\nMédia aritmética do aluno: "+casas.format(mediaAluno));
            System.out.println("Situação do aluno: "+mensagem);
        }
        
        // Exibir dados
        System.out.println("\nTotal de alunos aprovados: "+qtdAprovado);
        System.out.println("Total de alunos de exame: "+qtdExame);
        System.out.println("Total de alunos reprovados: "+qtdReprovado);
        System.out.println("Média da classe: "+casas.format(mediaClasse));
        
        entrada.close();
    }
}
