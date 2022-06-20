/**
 * @author kauas - 02/05/2022 segunda
 * Livro: Fundamentos da Programação de Computadores
 * Capítulo 4, Exercício Proposto 17, pág.92
 */

/*
Faça um programa que verifique a validade de uma senha fornecida pelo usuário.
A senha é 4531. O programa deve mostrar uma mensagem de permissão de acesso ou
não.
 */
package capitulo_4.exercicios_propostos;

import java.util.Scanner;

public class ExercProposto17 {

    public static void main(String[] args) {
        // Declaração de variáveis
        Scanner entrada = new Scanner(System.in);
        String password, username;

        // Coletar dados
        System.out.print("\nDigite o nome de usuário: ");
        username = entrada.nextLine();
        System.out.print("Digite a senha: ");
        password = entrada.nextLine();

        // Desvio condicional referente ao acesso
        if (password.equals("4531")) {
            // Exibir dados
            System.out.println("\nAcesso permitido.");
            System.out.println("Olá " + username + "\n");
        } else {
            System.out.println("\nAcesso negado, senha inválida!\n");
        }

        entrada.close();
    }
}
