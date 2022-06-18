/**
@author kauas - 18/06/2022 sábado
Livro: Fundamentos da Programação de Computadores
Capítulo 5, Exercício Resolvido 12, pág.129
*/

/*
Foi feita uma pesquisa para determinar o índice de mortalidade infantil em certo
período. Faça um programa que:

- Leia o número de crianças nascidas no período;
- Identifique o sexo (M ou F) e o tempo de vida de cada criança nascida.

O programa deve calcular e mostrar:

- A percentagem de crianças do sexo feminino mortas no período;
- A percentagem de crianças do sexo masculino mortas no período;
- A percentagem de crianças que viveram 24 meses ou menos no período.
*/
package capitulo_5.exercicios_resolvidos;

import java.util.Scanner;

public class ExercicioResolvido13 {
    
    public static void main(String[] args) {
        // Declaração de variáveis
        Scanner entrada = new Scanner(System.in);
        int numCrianca, qtdFeminino, qtdMasculino, tempoVida, qtdCrianca;
        float pctFeminino, pctMasculino, pctCrianca;
        char sexo;
        String alerta1, alerta2;
        
        // Inicialização de variáveis
        qtdMasculino = 0;
        qtdFeminino = 0;
        qtdCrianca = 0;
        pctFeminino = 0;
        pctMasculino = 0;
        pctCrianca = 0;
        alerta1 = "";
        alerta2 = "";
        
        System.out.print("Digite a quantidade de crianças nascidas em um período: ");
        numCrianca = entrada.nextInt();
        entrada.nextLine();
        
        // Laço de repetição para coleta de dados referentes as crianças
        for (int i=1; i<=numCrianca; i++) {
            System.out.print("\nDigite o sexo da "+i+"ª criança\nM - masculino\nF - feminino\n<< ");
            sexo = Character.toUpperCase(entrada.nextLine().charAt(0));
            System.out.print("Digite o tempo de vida em meses da "+i+"ª criança: ");
            tempoVida = entrada.nextInt();
            entrada.nextLine();
            
            // Desvio condicional para coleta de dados referentes ao sexo
            switch (sexo) {
                case 'F' -> {
                    qtdFeminino++;
                    pctFeminino = (qtdFeminino * 100) / numCrianca;
                }
                case 'M' -> {
                    qtdMasculino++;
                    pctMasculino = (qtdMasculino * 100) / numCrianca;
                }
                default -> {
                    alerta1 = "Foi informado um valor inválido do sexo para uma ou mais crianças!";
                    System.out.println("\nSexo inválido!");
                }
            }
            
            // Desvio condicional para coleta de dados referentes ao tempo de vida
            if (tempoVida >= 0 && tempoVida <= 24) {
                qtdCrianca++;
                pctCrianca = (qtdCrianca * 100) / numCrianca;
            } else if (tempoVida < 0) {
                alerta2 = "Foi informado um valor inválido do tempo de vida para uma ou mais crianças!";
                System.out.println("\nTempo de vida inválido!");
            }
        }
        
        // Desvio condicional para alerta de dados inválidos
        if (!"".equals(alerta1) && !"".equals(alerta2)) {
            System.out.println("\n\n"+alerta1);
            System.out.println(alerta2);
        } else if (!"".equals(alerta1)) {
            System.out.println("\n\n"+alerta1);
        } else if (!"".equals(alerta2)) {
            System.out.println("\n\n"+alerta2);
        }
        
        System.out.println("\nA percentagem de crianças do sexo feminino mortas no período: "+pctFeminino+"%");
        System.out.println("A percentagem de crianças do sexo masculino mortas no período: "+pctMasculino+"%");
        System.out.println("A percentagem de crianças que viveram até 24 meses no período: "+pctCrianca+"%\n");
    }
}
