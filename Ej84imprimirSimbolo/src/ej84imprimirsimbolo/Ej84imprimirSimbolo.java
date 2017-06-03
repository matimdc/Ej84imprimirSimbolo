/*
8.4) Escribir la función imprimirSimbolo, que imprime por consola n veces un carácter en
la misma línea. Tanto n como el carácter se reciben como parámetro.
 */
package ej84imprimirsimbolo;

import java.util.Scanner;

/**
 *
 * @author Matias
 */
public class Ej84imprimirSimbolo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Scanner teclado = new Scanner(System.in);
        System.out.println("cantidad de N veces: ");
        int num = teclado.nextInt();

        System.out.println("Escriba el carácter: ");
        char opcion = entrada.nextLine().charAt(0);

        imprimirSimbolo(num, opcion);
    }

    public static void imprimirSimbolo(int nVeces, char caracter) {

        for (int i = 0; i < nVeces; i++) {

            System.out.print(caracter + " ");

        }

        System.out.print("");

    }

}
