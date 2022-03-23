package ejercicios;

import java.util.Scanner;

/* TP[1] Ejercicio 2
* Grupo Nro.: -
* Integrantes: Guille
* Enunciado:
* Realizá un programa que permita ingresar 3 notas pertenecientes a tres trimestres distintos
para cierto alumno de nivel secundario. Debe calcularse y mostrarse la nota promedio.
*/

public class Ej02 {

	private static Scanner input = new Scanner(System.in);

	final static int NOTA_MINIMA_PERMITIDA = 0;
	final static int NOTA_MAXIMA_PERMITIDA = 10;
	final static int CANT_NOTAS = 3;

	public static void main(String[] args) {

		double nota1;
		double nota2;
		double nota3;

		do {
			System.out.println("Ingrese una nota");
			nota1 = Double.parseDouble(input.nextLine());
			if (nota1 < NOTA_MINIMA_PERMITIDA || nota1 > NOTA_MAXIMA_PERMITIDA) {
				System.out.println("La nota ingresada es errona");
			}
		} while (nota1 < NOTA_MINIMA_PERMITIDA || nota1 > NOTA_MAXIMA_PERMITIDA);

		do {
			System.out.println("Ingrese una nota");
			nota2 = Double.parseDouble(input.nextLine());
			if (nota2 < NOTA_MINIMA_PERMITIDA || nota2 > NOTA_MAXIMA_PERMITIDA) {
				System.out.println("La nota ingresada es errona");
			}
		} while (nota2 < NOTA_MINIMA_PERMITIDA || nota2 > NOTA_MAXIMA_PERMITIDA);

		do {
			System.out.println("Ingrese una nota");
			nota3 = Double.parseDouble(input.nextLine());
			if (nota3 < NOTA_MINIMA_PERMITIDA || nota3 > NOTA_MAXIMA_PERMITIDA) {
				System.out.println("La nota ingresada es errona");
			}
		} while (nota3 < NOTA_MINIMA_PERMITIDA || nota3 > NOTA_MAXIMA_PERMITIDA);

		System.out.println("El promedio de las " + CANT_NOTAS + " notas es de " + (nota1 + nota2 + nota3) / CANT_NOTAS);

		input.close();
	}

}
