/**
 * @author kauas - 16/07/2022 sabado
 * Livro: Fundamentos da Programação de Computadores
 * Capítulo 5, Exercício Resolvido 20, pág. 137
 */

/*
Faça um programa para ler o código, o sexo (M - masculino; F - feminino) e o
número de horas/aula dadas mensalmente pelos professores de uma universidade,
sabendo-se que cada hora/aula vale R$ 30,00. Emita uma listagem contendo o
código, o salário bruto e o salário líquido (levando em consideração os 
descontos explicados a seguir) de todos os professores. Mostre também a média
dos salários líquidos dos professores do sexo masculino e a média dos salário
dos professores do sexo feminino. Considere:

- desconto para homens, 10%, e, para mulheres, 5%;
- as informações terminarão quando for lido o código = 99999.
*/
package capitulo_5.exercicios_resolvidos;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class ExercicioResolvido20 {
    
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Locale localBR = new Locale("pt","BR");
        
        NumberFormat fmtDinheiro = NumberFormat.getCurrencyInstance(localBR);
        
        int codigo, numHoraAula, porcentagem, qtdMasculino, qtdFeminino;
        float valHoraAula, salBruto, salLiquido, desconto, somaSalMasculino, somaSalFeminino, mediaSalMasculino, mediaSalFeminino;
        char sexo;
        
        valHoraAula = 30;
        qtdMasculino = 0;
        qtdFeminino = 0;
        somaSalMasculino = 0;
        somaSalFeminino = 0;
        mediaSalMasculino = 0;
        mediaSalFeminino = 0;
        
        // Estrutura de repetição referente a repetição das operações
        do {
            System.out.print("\nDigite o código: ");
            codigo = entrada.nextInt();
            entrada.nextLine();
            
            // Estrutura de repetição referente a dado inválido
            do {
                System.out.print("M - masculino / F - Feminino: ");
                sexo = Character.toUpperCase(entrada.nextLine().charAt(0));
            } while (sexo != 'M' && sexo != 'F');
            
            System.out.print("Digite a quantidade de horas/aulas dadas mensalmente: ");
            numHoraAula = entrada.nextInt();
            
            salBruto = numHoraAula * valHoraAula;
            
            if (sexo == 'M') {
                porcentagem = 10;
                desconto = (salBruto * porcentagem) / 100;
                salLiquido = salBruto - desconto;
                qtdMasculino++;
                somaSalMasculino = somaSalMasculino + salLiquido;
                mediaSalMasculino = somaSalMasculino / qtdMasculino;
            } else {
                porcentagem = 5;
                desconto = (salBruto * porcentagem) / 100;
                salLiquido = salBruto - desconto;
                qtdFeminino++;
                somaSalFeminino = somaSalFeminino + salLiquido;
                mediaSalFeminino = somaSalFeminino / qtdFeminino;
            }
            
            System.out.println("\nCódigo -> "+codigo);
            System.out.println("Salário Bruto -> "+fmtDinheiro.format(salBruto));
            System.out.println("Desconto ("+porcentagem+"%) -> "+fmtDinheiro.format(desconto));
            System.out.println("Salário Líquido -> "+fmtDinheiro.format(salLiquido));
            
            System.out.print("\nPara encerrar o sistema digite '99999', caso contrário, qualquer número: ");
            codigo = entrada.nextInt();
            
        } while (codigo != 99999);
        
        System.out.println("\nMédia do salário líquido masculino -> "+fmtDinheiro.format(mediaSalMasculino));
        System.out.println("Média do salário líquido feminino -> "+fmtDinheiro.format(mediaSalFeminino));
        
        entrada.close();
    }
}
