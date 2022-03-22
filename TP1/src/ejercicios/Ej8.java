package ejercicios;

import java.util.Scanner;

/* TP[1] Ejercicio 1
* Grupo Nro.: -
* Integrantes: Guille
* Enunciado:
* Realizá un programa que permita ingresar dos números naturales. Debes mostrar los
resultados para las 4 operaciones matemáticas básicas con los números ingresados.
*/

public class Ej8 {

	private static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		int numeroNatural1;
		int numeroNatural2;

		do {
			System.out.println("Ingrese un numero natural");
			numeroNatural1 = Integer.parseInt(input.nextLine());
			if (numeroNatural1 <= 0) {
				System.out.println("El numero ingresado no es un numero natural");
			}
		} while (numeroNatural1 <= 0);
		do {
			System.out.println("Ingrese un numero natural");
			numeroNatural2 = Integer.parseInt(input.nextLine());
			if (numeroNatural2 <= 0) {
				System.out.println("El numero ingresado no es un numero natural");
			}
		} while (numeroNatural2 <= 0);
		System.out.println(numeroNatural1 + " + " + numeroNatural2 + " = " + (numeroNatural1 + numeroNatural2));
		System.out.println(numeroNatural1 + " - " + numeroNatural2 + " = " + (numeroNatural1 - numeroNatural2));
		System.out.println(numeroNatural1 + " * " + numeroNatural2 + " = " + (numeroNatural1 * numeroNatural2));
		System.out.println(numeroNatural1 + " / " + numeroNatural2 + " = " + (numeroNatural1 / numeroNatural2));

		input.close();
	}
}
