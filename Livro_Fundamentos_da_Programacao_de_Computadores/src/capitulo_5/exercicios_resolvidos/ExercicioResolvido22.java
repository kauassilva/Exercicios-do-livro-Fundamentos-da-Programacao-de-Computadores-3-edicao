/**
 * @author kauas - 16/07/2022 sabado
 * Livro: Fundamentos da Programação de Computadores
 * Capítulo 5, Exercício Resolvido 22, pág. 140
 */

/*
Uma empresa  decidiu fazer um levantamento em relação aos candidatos que se
apresentarem para preenchimento de vagas em seu quadro de funcionários. Supondo
que você seja o programador dessa empresa, faça um programa que leia, para cada
candidato, a idade, o sexo (M ou F) e a experiência no serviço (S ou N). Para 
encerrar a entrada de dados, digite zero para a idade.

O programa também deve calcular e mostrar:

- O número de candidatos do sexo feminino;
- O número de candidatos do sexo masculino;
- A idade média dos homens que já têm experiência no serviço;
- A porcentagem dos homens com mais de 45 anos entre o total dos homens;
- O número de mulheres com idade inferior a 21 anos e com experiência no 
  serviço;
- A menor idade entre as mulheres que já tem experiência no serviço.
*/
package capitulo_5.exercicios_resolvidos;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class ExercicioResolvido22 {
    
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Locale localBR = new Locale("pt","BR");
        
        NumberFormat fmtNumero = NumberFormat.getNumberInstance(localBR);
        
        int idade, i, qtdFeminino, qtdMasculino, somaIdadeMasculino, mediaIdadeMasculino, qtdMascExperiencia;
        int qtdMascIdade, qtdFemIdadeExperiencia, menorIdadeFemExperiencia;
        float pctMascIdade;
        char sexo, experiencia;
        
        i = 1;
        qtdFeminino = 0;
        qtdMasculino = 0;
        somaIdadeMasculino = 0;
        mediaIdadeMasculino = 0;
        qtdMascExperiencia = 0;
        qtdMascIdade = 0;
        pctMascIdade = 0;
        qtdFemIdadeExperiencia = 0;
        menorIdadeFemExperiencia = 0;
        
        // Estrutura de repetição referente a dado inválido
        do {
            System.out.println("Caso queira encerrar o sistema digite 0 para a idade");
            System.out.print("Digite a idade do "+i+"º candidato: ");
            idade = entrada.nextInt();
            entrada.nextLine();
            
            menorIdadeFemExperiencia = idade;
            
            if ((idade < 16 && idade > 0) || idade < 0) {
                System.out.println("Idade inválida! Caso queira encerrar o sistema digite 0");
            }
        } while ((idade < 16 && idade > 0) || idade < 0);
        
        // Estrutura de repetição referente a repetição das operações baseado na idade
        while (idade != 0) {
            // Estrutura de repetição referente a dado inválido
            do {
                System.out.print("M - masculino / F - feminino: ");
                sexo = Character.toUpperCase(entrada.nextLine().charAt(0));
                
                if (sexo != 'M' && sexo != 'F') {
                    System.out.println("Sexo inválido!");
                }
            } while (sexo != 'M' && sexo != 'F');
            
            // Estrutura de repetição referente a dado inválido
            do {
                System.out.print("Possui experiência?\nS - sim / N - não: ");
                experiencia = Character.toUpperCase(entrada.nextLine().charAt(0));
                
                if (experiencia != 'S' && experiencia != 'N') {
                    System.out.println("Experiência inválida!");
                }
            } while (experiencia != 'S' && experiencia != 'N');
            
            if (sexo == 'F') {
                qtdFeminino++;
                
                if (experiencia == 'S') {
                    if (idade < 21) {
                        qtdFemIdadeExperiencia++;
                    }
                    
                    if (menorIdadeFemExperiencia > idade) {
                        menorIdadeFemExperiencia = idade;
                    }       
                }
            } else {
                qtdMasculino++;
                
                if (experiencia == 'S') {
                    qtdMascExperiencia++;
                    somaIdadeMasculino = somaIdadeMasculino + idade;
                    mediaIdadeMasculino = somaIdadeMasculino / qtdMascExperiencia; 
                }
                
                if (idade > 45) {
                    qtdMascIdade++;
                    pctMascIdade = (qtdMascIdade * 100) / qtdMasculino;
                }
            }
            
            i++;
            
            // Estrutura de repetição referente a dado inválido
            do {
                System.out.println("\nCaso queira encerrar o sistema digite 0 para a idade");
                System.out.print("Digite a idade do "+i+"º candidato: ");
                idade = entrada.nextInt();
                entrada.nextLine();

                if ((idade < 16 && idade > 0) || idade < 0) {
                    System.out.println("Idade inválida!");
                }
            } while ((idade < 16 && idade > 0) || idade < 0);
        }
        
        System.out.println("\n\nQuantidade de candidatos do sexo feminino: "+qtdFeminino);
        System.out.println("Quantidade de candidatos do sexo masculino: "+qtdMasculino);
        System.out.println("Média das idades dos homens que possuem experiência: "+mediaIdadeMasculino);
        System.out.println("Porcentagem de homens com mais de 45 anos entre todos os homens: "+fmtNumero.format(pctMascIdade)+"%");
        System.out.println("Quantidade de mulheres com menos de 21 anos e com experiência: "+qtdFemIdadeExperiencia);
        System.out.println("Menor idade entre mulheres que possuem experiência: "+menorIdadeFemExperiencia);
        
        
        entrada.close();
    }
}
