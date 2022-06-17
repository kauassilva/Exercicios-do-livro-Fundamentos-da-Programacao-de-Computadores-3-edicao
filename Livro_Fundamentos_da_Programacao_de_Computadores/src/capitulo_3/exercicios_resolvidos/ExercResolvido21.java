/**
@author kauas - 27/03/2022 Domingo
Livro: Fundamentos da Programação de Computadores
Capítulo 3, Exercício Resolvido 21, pág.47
*/

/*
Uma pessoa deseja pregar um quadro em uma parede. Faça um programa para calcular
e mostrar a que distância a escada deve estar da parede. A pessoa deve fornecer
o tamanho da escada e a altura em que deseja pregar o quadro.
Lembre-se de que o tamanho da escada deve ser maior que a altura que se deseja
alcançar
[imagem no livro| pág.48]
*/
package capitulo_3.exercicios_resolvidos;

import java.util.Scanner;
import java.text.DecimalFormat;

public class ExercResolvido21 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        DecimalFormat casas = new DecimalFormat("0.00");
        float tamEscada, altQuadro, distEscada;
        
        System.out.print("Digite o tamanho em metros da escada: ");
        tamEscada = entrada.nextFloat();
        System.out.print("Digite a altura em metros que deseja pregar o quadro (Deve ser menor que o tamanho da escada): ");
        altQuadro = entrada.nextFloat();
        
        distEscada = (float) (Math.pow(tamEscada,2) - Math.pow(altQuadro,2));
        distEscada = (float) Math.sqrt(distEscada); // raíz quadrada
        
        System.out.println("A distância que a escada deve estar é "+casas.format(distEscada)+" metros");

        entrada.close();
    }
    
}
