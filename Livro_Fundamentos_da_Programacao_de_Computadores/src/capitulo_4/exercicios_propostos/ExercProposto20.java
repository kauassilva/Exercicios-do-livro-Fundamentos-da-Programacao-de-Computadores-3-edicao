/**
@author kauas - 02/05/2022 segunda
Livro: Fundamentos da Programação de Computadores
Capítulo 4, Exercício Proposto 20, pág.92
*/

/*
Faça um programa que receba a idade de um nadador e mostre sua categoria, sua
categoria, uasndo as regras a seguir. Para idade inferior a 5, deverá mostrar
mensagem.
[imagem, pág. 92]
*/
package capitulo_4.exercicios_propostos;

import java.util.Scanner;

public class ExercProposto20 {
  
  public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);
    int idade;
    String categoria;

    System.out.print("\nDigite a idade do nadador: ");
    idade = entrada.nextInt();

    if (idade >= 0) {
      if (idade < 5) {
        categoria = "Não há categoria para menores de 5 anos!";
      } else if (idade>=5 && idade<=7) {
        categoria = "Infantil";
      } else if (idade>=8 && idade<=10) {
        categoria = "Juvenil";
      } else if (idade>=11 && idade<=15) {
        categoria = "Adolescente";
      } else if (idade>=16 && idade<=30) {
        categoria = "Adulto";
      } else {
        categoria ="Sênior";
      }

      System.out.println("\nCategoria: "+categoria+"\n");
    } else {
      System.out.println("\nIdade, inválida!\n");
    }

    entrada.close();
  }
}
