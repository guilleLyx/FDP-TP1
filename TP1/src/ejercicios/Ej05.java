package ejercicios;

import java.util.Scanner;

/* TP[1] Ejercicio 5
* Grupo Nro.: -
* Integrantes: Guille
* Enunciado:
* Realiz� un programa que permita ingresar valores del mismo tipo para las variables num1 y
num2. Una vez cargadas, mostrar ambas variables por pantalla, intercambi� sus valores (que
lo cargado en num1 quede en num2, y viceversa) y volv� a mostrarlas actualizadas. 
*/

public class Ej05 {

	private static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		int num1;
		int num2;
		int aux;

		System.out.println("Ingrese un n�mero entero");
		num1 = Integer.parseInt(input.nextLine());
		System.out.println("Ingrese un n�mero entero");
		num2 = Integer.parseInt(input.nextLine());
		System.out.println("num1 = " + num1);
		System.out.println("num2 = " + num2);
		aux = num1;
		num1 = num2;
		num2 = aux;
		System.out.println("");
		System.out.println("num1 = " + num1);
		System.out.println("num2 = " + num2);

		input.close();
	}

}
