/* TP[1] Ejercicio 1
* Grupo Nro.: -
* Integrantes: Guille
* Enunciado:
* Realizá un programa que permita que el usuario ingrese su nombre. El programa debe emitir
una salida con un mensaje de bienvenida que incluya el nombre ingresado. [EC]
*/

package ejercicios;

import java.util.Scanner;

public class Ej1 {

	private static Scanner input = new Scanner(System.in); // Activo el proceso del Scanner, debe ir antes del main

	public static void main(String[] args) {
		System.out.println("Ingrese su nombre");
		String nombre = input.nextLine();
		System.out.println("Bienvenido amo " + nombre);
		input.close(); // Termino el proceso del Scanner para evitar consumir mucha memoria

	}
}
