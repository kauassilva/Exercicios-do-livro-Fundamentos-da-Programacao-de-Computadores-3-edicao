/**
@author kauas - 18/04/2022 Segunda
Livro: Fundamentos da Programação de Computadores
Capítulo 4, Exercício Resolvido 21, pág.82
*/

/*
Faça um programa que receba:
- O código do estado de origem da carga de um caminhão, supondo que a
  digitação do código seja sempre válida, isto é, um número inteiro
  entre 1 e 5;
- O peso da carga do caminhão em toneladas;
- O código da carga, supondo que a digitação do código seja sempre
  válida, isto é, um número inteiro entre 10 e 40 

Tabelas:
[imagem, pág. 83]

Calcule e mostre:
- O peso da carga do caminhão em quilos;
- O preço da carga do caminhão;
- O valor do imposto, sabendo que o imposto é cobrado sobre o preço da
  carga do caminhão e depende do estado de origem;
- O valor total transportado pelo caminhão, preço da carga mais imposto.
*/
package capitulo_4.exercicios_resolvidos;

import java.text.DecimalFormat;
import java.util.Scanner;

public class ExercResolvido21 {
  
  public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);
    DecimalFormat casas = new DecimalFormat("0.00");
    int idEstado, idCarga, porcentagem=0;
    float peTonelada, peQuilo, prCarga=0, prTransportado=0, imposto=0;

    System.out.print("\nDigite o código do Estado de origem da carga: ");
    idEstado = entrada.nextInt();
    System.out.print("Digite o peso da carga em toneladas (t): ");
    peTonelada = entrada.nextFloat();
    System.out.print("Digite o código da carga: ");
    idCarga = entrada.nextInt();

    peQuilo = peTonelada * 1000;

    if (idCarga>9 && idCarga<41) {
      if (idCarga>=10 && idCarga<=20) {
        prCarga = peQuilo * 100;
      } else if (idCarga>=21 && idCarga<=30) {
        prCarga = peQuilo * 250;
      } else if (idCarga>=31 && idCarga<=40) {
        prCarga = peQuilo * 340;
      }
    } else {
      System.out.println("\nCódigo da carga, inválido!");
    }

    switch (idEstado) {
      case 1:
        porcentagem = 35;
        imposto = (prCarga*porcentagem) / 100;
        prTransportado = prCarga + imposto;
        break;
      case 2:
        porcentagem = 25;
        imposto = (prCarga*porcentagem) / 100;
        prTransportado = prCarga + imposto;
        break;
      case 3:
        porcentagem = 15;
        imposto = (prCarga*porcentagem) / 100;
        prTransportado = prCarga + imposto;
        break;
      case 4:
        porcentagem = 5;
        imposto = (prCarga*porcentagem) / 100;
        prTransportado = prCarga + imposto;
        break;
      case 5:
        porcentagem = 0;
        imposto = (prCarga*porcentagem) / 100;
        prTransportado = prCarga + imposto;
        break;
      default:
        System.out.println("\nCódigo de Estado, inválido!");
    }

    System.out.println("\n"+peTonelada+" t -> "+peQuilo+" Kg");
    System.out.println("Preço da carga     -> R$ "+casas.format(prCarga));
    System.out.println("Imposto ("+porcentagem+"%)      -> R$ "+casas.format(imposto));
    System.out.println("Preço transportado -> R$ "+casas.format(prTransportado)+"\n");
    entrada.close();
  }
}
