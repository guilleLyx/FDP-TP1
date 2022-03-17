package ejercicios;

import java.util.Scanner;

/* TP[1] Ejercicio 1
* Grupo Nro.: -
* Integrantes: Guille
* Enunciado:
* Realizá un programa que permita ingresar el ancho y el largo de un terreno en metros y el
valor del metro cuadrado de tierra. Debe mostrarse el valor total del terreno y la cantidad de
metros de alambre para cercarlo completamente a tres alturas distintas.. 
*/

public class Ej7 {

	private static Scanner input = new Scanner(System.in);
	final static int DIFERENTES_ALTURAS = 3;

	public static void main(String[] args) {
		double anchoDelTerreno;
		double largoDelTerreno;
		double valorDelMetro;

		do {
			System.out.println("Ingrese el ancho del terreno en metros");
			anchoDelTerreno = Double.parseDouble(input.nextLine());
			if (anchoDelTerreno <= 0) {
				System.out.println("El valor ingresado es incorrecto");
			}
		} while (anchoDelTerreno <= 0);

		do {
			System.out.println("Ingrese el largo del terreno en metros");
			largoDelTerreno = Double.parseDouble(input.nextLine());
			if (largoDelTerreno <= 0) {
				System.out.println("El valor ingresado es incorrecto");
			}
		} while (largoDelTerreno <= 0);

		do {
			System.out.println("Ingrese el valor del metro cuadrado de tierra");
			valorDelMetro = Double.parseDouble(input.nextLine());
			if (valorDelMetro <= 0) {
				System.out.println();
			}
		} while (valorDelMetro <= 0);
		System.out.println("El valor del terreno es de $" + anchoDelTerreno * largoDelTerreno * valorDelMetro);
		System.out.println("La cantidad de alambres para cercarlo a " + DIFERENTES_ALTURAS
				+ " alturas diferentes es de " + (anchoDelTerreno + largoDelTerreno) * 2 + "mts");
		input.close();
	}

}