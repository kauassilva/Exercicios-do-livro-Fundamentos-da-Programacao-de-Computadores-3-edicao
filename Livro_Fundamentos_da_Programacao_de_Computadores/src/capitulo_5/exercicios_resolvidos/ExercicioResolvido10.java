/**
@author kauas - 17/06/2022 sexta
Livro: Fundamentos da Programação de Computadores
Capítulo 5, Exercício Resolvido 10, pág.126
*/

/*
Em um campeonato de futebol existem cinco times e cada um possui onze jogadores.
Faça um programa que receba a idade, o peso e a altura de cada um dos jogadores,
calcule e mostre:

- A quantidade de jogadores com idade inferior a 18 anos;
- A média das idades dos jogadores de cada time;
- A média das alturas de todos os jogadores do campeonato; e
- A porcentagem de jogadores com mais de 80 kg entre todos os jogadores do
campeonato.
*/
package capitulo_5.exercicios_resolvidos;

import java.text.DecimalFormat;
import java.util.Scanner;

public class ExercicioResolvido10 {
    
    public static void main(String[] args) {
        // Declaração de variáveis
        Scanner entrada = new Scanner(System.in);
        DecimalFormat casas = new DecimalFormat("0.00");
        int idade, qtdJgdIdade=0, somaIdade=0, mediaIdade, qtdJgdPeso=0;
        float peso, altura, somaAltura=0, mediaAltura, pctJgdPeso=0;
        
        // Laço de repetição baseado na quantidade de times
        for (int i=1; i<=5; i++) {
            System.out.println("\n\n======= TIME nº"+i+" =======");
            
            // Laço de repetição baseado na quantidade de jogadores
            for (int j=1; j<=11; j++) {
                // Coletar dados
                System.out.println("\n----- JOGADOR nº"+j+" -----");
                System.out.print("\nDigite a idade do jogador: ");
                idade = entrada.nextInt();
                System.out.print("Digite o peso do jogador em kg: ");
                peso = entrada.nextFloat();
                System.out.print("Digite a altura do jogador em m: ");
                altura = entrada.nextFloat();
                
                // Desvio condicional referente a quantidade de jogadores menores de idade
                if (idade < 18) {
                    qtdJgdIdade++;
                }
                
                // Operações referentes a soma de idade e altura
                somaIdade = somaIdade + idade;
                somaAltura = somaAltura + altura;
                
                // Desvio condicional referente a quantidade de jogadores que pesam mais de 80 Kg
                if (peso > 80) {
                    qtdJgdPeso++;
                }
            }
            
            // Operação referente a média de idade
            mediaIdade = somaIdade / 11;
            
            // Exibir dados
            System.out.println("\nMédia das idades dos jogadores do time nº"+i+": "+mediaIdade);
        }
        
        // Operações referentes a média de altura e percentagem de jogadores com mais de 80 Kg
        mediaAltura = somaAltura / 55;
        pctJgdPeso = qtdJgdPeso * 100 / 55;
        
        // Exibir dados
        System.out.println("\nQuantidades de jogadores menores de idade: "+qtdJgdIdade);
        System.out.println("Média das alturas dos jogadores do campeonato: "+casas.format(mediaAltura));
        System.out.println("Porcentagem de jogadores com mais de 80 kg do campeonato: "+pctJgdPeso+"%\n");
        
        entrada.close();
    }
}
