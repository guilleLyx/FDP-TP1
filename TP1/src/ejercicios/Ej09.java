package ejercicios;

import java.util.Scanner;

/* TP[1] Ejercicio 1
* Grupo Nro.: -
* Integrantes: Guille
* Enunciado:
*Realizá un programa que permita ingresar dos números que representan las medidas en
grados de dos ángulos interiores de cierto triángulo. A partir de los valores de estos
dos ángulos el programa debe mostrar el valor en grados del ángulo restante. Recordá que la
suma de los ángulos interiores de todo triángulo es de 180º.
*/

public class Ej09 {

	private static Scanner input = new Scanner(System.in);
	final static int SUMA_ANGULOS_INTERIORES = 180;
	final static int ANGULO_MINIMO = 0;

	public static void main(String[] args) {
		double angulo1;
		double angulo2;
		double angulo3;

		do {

			do {
				System.out.println("Ingrese el valor de un angulo del triangulo");
				angulo1 = Double.parseDouble(input.nextLine());
				if (angulo1 <= ANGULO_MINIMO || angulo1 > SUMA_ANGULOS_INTERIORES) {
					System.out.println("El valore ingresado no corresponde al valor de un angulo");
				}
			} while (angulo1 <= ANGULO_MINIMO || angulo1 < SUMA_ANGULOS_INTERIORES);

			do {
				System.out.println("Ingrese el valor de otro angulo del triangulo");
				angulo2 = Double.parseDouble(input.nextLine());
				if (angulo2 <= ANGULO_MINIMO || angulo2 > SUMA_ANGULOS_INTERIORES) {
					System.out.println("El valore ingresado no corresponde al valor de un angulo");
				}
			} while (angulo2 <= ANGULO_MINIMO || angulo2 > SUMA_ANGULOS_INTERIORES);

			angulo3 = angulo1 + angulo2;
		} while (angulo3 >= SUMA_ANGULOS_INTERIORES);
		System.out.println("El valor del angulo restante es de " + angulo3 + "°");
		input.close();
	}

}
