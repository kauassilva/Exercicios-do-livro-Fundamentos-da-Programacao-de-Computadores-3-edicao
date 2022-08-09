/**
 * @author kauas - 09/08/2022 terça
 * Livro: Fundamentos da Programação de Computadores
 * Capítulo 5, Exercício Proposto 18, pág. 148
 */

/*
Foi feita uma pesquisa entre os habitantes de uma região. Foram coletados os dados
de idade, sexo (M/F) e salário. Faça um programa que calcule e mostre:

- A média dos salários do grupo;
- A maior e a menor idade do grupo;
- A quantidade de mulheres com salário até R$ 200,00 [alterei este valor para 1200];
- A idade e o sexo da pessoa que possui o menor salário.

Finalize a entrada de dados ao ser digitada uma idade negativa.
*/
package capitulo_5.exercicios_propostos;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class ExercicioProposto18 {
  
  public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);
    Locale localBR = new Locale("pt","BR");

    NumberFormat fmtDinheiro = NumberFormat.getCurrencyInstance(localBR);

    int i, idade, maiorIdade, menorIdade, qtdMulher, idadePessMenorSal;
    float salario, somaSalario, mediaSalario, menorSalario;
    char sexo, sexoPessMenorSal;

    i = 1;
    somaSalario = 0;
    qtdMulher = 0;
    menorSalario = 0;
    idadePessMenorSal = 0;
    sexoPessMenorSal = '\n';

    // Estrutura de repetição referente a idade inválida
    do {
      System.out.println("\nPara encerrar a entrada de dados, digite uma idade negativa!");
      System.out.print("Digite a idade do "+i+"º habitante: ");
      idade = entrada.nextInt();

      if (idade > 120) {
        System.out.println("\nCaramba... mais de 120 anos? Digite novamente com a idade verdadeira!\n");
      }
    } while (idade > 120);
    entrada.nextLine();

    maiorIdade = idade;
    menorIdade = idade;

    /* 
     * Estrutura de repetição para entrada e processo de dados
     * de quantidade de pessoas assistindo o respectivo canal
    */
    while (idade >= 0) {
      // Estrutura de repetição referente ao sexo inválido
      do {
        System.out.print("Digite o sexo do "+i+"º habitante (M - masculino / F - feminino): ");
        sexo = Character.toUpperCase(entrada.nextLine().charAt(0)); // m -> M || f -> F

        if (sexo != 'M' && sexo != 'F') {
          System.out.println("\nSexo inválido, digite novamente!\n");
        }
      } while (sexo != 'M' && sexo != 'F');

      // Estrutura de repetição referente ao salário inválido
      do {
        System.out.print("Digite o salário do "+i+"º habitante: ");
        salario = entrada.nextFloat();

        if (salario <= 0) {
          System.out.println("\nSalário inválido, digite novamente!\n");
        }
      } while (salario <= 0);

      menorSalario = salario;
      idadePessMenorSal = idade;
      sexoPessMenorSal = sexo;

      if (salario < menorSalario) {
        menorSalario = salario;
        idadePessMenorSal = idade;
        sexoPessMenorSal = sexo;
      }

      if (idade > maiorIdade) {
        maiorIdade = idade;
      }

      if (idade < menorIdade) {
        menorIdade = idade;
      }

      if (sexo == 'F' && salario <= 1200) {
        qtdMulher++;
      }

      somaSalario += salario;
      i++;

      // Estrutura de repetição referente a idade inválida
      do {
        System.out.println("\nPara encerrar a entrada de dados, digite uma idade negativa!");
        System.out.print("Digite a idade do "+i+"º habitante: ");
        idade = entrada.nextInt();

        if (idade > 120) {
          System.out.println("\nCaramba... mais de 120 anos? Digite novamente com a idade verdadeira!\n");
        }
      } while (idade > 120);
      entrada.nextLine();

      
    }

    i--;
    mediaSalario = somaSalario / i;

    System.out.println("\nMédia dos salários do grupo: "+fmtDinheiro.format(mediaSalario));
    System.out.println("Maior idade de todos: "+maiorIdade);
    System.out.println("Menor idade de todos: "+menorIdade);
    System.out.println("Quantidade de mulheres com salário até R$ 1200,00: "+qtdMulher);
    System.out.println("Menor salário: "+fmtDinheiro.format(menorSalario));
    System.out.println("Idade do habitante com o menor salário: "+idadePessMenorSal);
    System.out.println("Sexo do habitante com o menor salário: "+sexoPessMenorSal);
    System.out.println();

    entrada.close();
  }
}
