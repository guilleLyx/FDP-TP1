package ejercicios;

import java.util.Scanner;

/* TP[1] Ejercicio 3
* Grupo Nro.: -
* Integrantes: Guille
* Enunciado:
* Realizá un programa que permita ingresar un número entero. Debe mostrarse el número
ingresado:
*a. Multiplicado por 5.
*b. Dividido por 2.
*/

public class Ej03 {

	private static Scanner input = new Scanner(System.in);

	final static int MULTIPLICADOR = 5;
	final static int DIVISOR = 2;

	public static void main(String[] args) {

		int numeroEntero;

		System.out.println("Ingrese un número entero");
		numeroEntero = Integer.parseInt(input.nextLine());
		System.out.println(numeroEntero + " * " + MULTIPLICADOR + " = " + numeroEntero * MULTIPLICADOR);
		System.out.println(numeroEntero + " / " + DIVISOR + " = " + numeroEntero / DIVISOR);

		input.close();
	}

}
