/**
 * @author kauas - 19/02/2023 Domingo
 * Livro: Fundamentos da Programação de Computadores
 * Capítulo 6, Exercício Proposto 5, pág. 190
 */

/*
Uma escola deseja saber se existem alunos cursando, simultaneamente, as disciplinas Lógica e Linguagem de
Programação. Coloque os números da matrículas dos alunos que cursam Lógica em um vetor, quinze alunos.
Coloque os números das matrículas dos alunos que cursam Linguagem de Programação em outro vetor, dez
alunos. Mostre o número das matrículas que aparecem nos dois vetores.
*/

package capitulo_6.exercicios_propostos;

import java.util.Scanner;

import javax.swing.plaf.TreeUI;

public class ExercicioProposto5 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int[] matriculasLogica = new int[15];
        int[] matriculasProgramacao = new int[10];
        boolean repetido;

        // Preenche o vetor de matrículas dos alunos da disciplina de Lógica
        repetido = false;
        System.out.println();
        for (int i=0; i<matriculasLogica.length; i++) {
            System.out.print("Digite o número de matrícula do "+(i+1)+"º aluno de Lógica: ");
            matriculasLogica[i] = scanner.nextInt();

            // Verifica se uma matrícula em Lógica já foi inserida antes
            for (int j=0; j<i; j++) {
                if (matriculasLogica[i] == matriculasLogica[j]) {
                    repetido = true;
                    break;
                }
            }

            // Caso a matrícula em Lógica já tenha sido inserida antes
            if (repetido) {
                System.out.println("\nA matrícula "+matriculasLogica[i]+" já foi inserida. Digite novamente.\n");
                i--;
                repetido = false;
            }
        }

        // Preenche o vetor de matrículas dos alunos da disciplina de Linguagem de Programação
        repetido = false;
        System.out.println();
        for (int i=0; i<matriculasProgramacao.length; i++) {
            System.out.print("Digite o número de matrícula do "+(i+1)+"º aluno de Linguagem de Programação: ");
            matriculasProgramacao[i] = scanner.nextInt();

            // Verifica se uma matrícula em Linguagem de Programação já foi inserida antes
            for (int j=0; j<i; j++) {
                if (matriculasProgramacao[i] == matriculasProgramacao[j]) {
                    repetido = true;
                    break;
                }
            }

            // Caso a matrícula em Linguagem de Programação já tenha sido inserida antes
            if (repetido) {
                System.out.println("\nA matrícula "+matriculasProgramacao[i]+" já foi inserida. Digite novamente.\n");
                i--;
                repetido = false;
            }
        }

        // Verifica se existe aluno com as duas disciplinas
        repetido = false;
        System.out.println();
        for (int i=0; i<matriculasLogica.length; i++) {
            for (int j=0; j<matriculasProgramacao.length; j++) {
                if (matriculasLogica[i] == matriculasProgramacao[j]) {
                    System.out.println("O aluno da matrícula "+matriculasLogica[i]+" aparece nas duas disciplinas");
                    repetido = true;
                }
            }
        }

        if (!repetido) {
            System.out.println("\nNão há alunos matrículados em ambas as disciplinas simultaneamente");
        }

    }
    
}
