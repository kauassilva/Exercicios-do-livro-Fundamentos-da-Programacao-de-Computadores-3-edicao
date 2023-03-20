package capitulo_12.exercicios_resolvidos.exercicio_resolvido1;

import java.util.Scanner;

public class Main {
  
  public static void main(String[] args) {
    
    Scanner entrada = new Scanner(System.in);
    Tipo tipos[] = new Tipo[2];
    
    tipos[0] = new Tipo();
    tipos[0].setCodTipo(1);
    tipos[0].setPercTipo(10);

    tipos[1] = new Tipo();
    tipos[1].setCodTipo(2);
    tipos[1].setPercTipo(20);

    String descAux;
    double precoAux;
    int tipoAux;
    
    Produto p = new Produto();

    System.out.print("\nDigite a descrição do produto: ");
    descAux = entrada.next();
    p.setDescricao(descAux);

    System.out.print("\nDigite o preço do produto: R$ ");
    precoAux = entrada.nextDouble();
    p.setPreco(precoAux);

    System.out.println("\nDigite o tipo do produto: ");
    tipoAux = entrada.nextInt();
    while (tipoAux!=1 && tipoAux!=2) {
      System.out.println("\nTipo inválido. Digite novamente: ");
      tipoAux = entrada.nextInt();
    }
    p.setTipo(tipos[tipoAux-1]);
    
    entrada.close();

    System.out.println("\nPreço final: R$ "+p.calcPrecoFinal());

  }

}
