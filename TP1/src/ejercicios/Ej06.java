package ejercicios;

import java.util.Scanner;

/* TP[1] Ejercicio 6
* Grupo Nro.: -
* Integrantes: Guille
* Enunciado:
* Realizá un programa que permita ingresar el monto total de las ventas realizadas por un
vendedor durante el mes, de quien se sabe que gana un sueldo fijo de 44000 pesos más el 16
por ciento del monto total vendido. Con tales datos debes calcular y mostrar el importe a
cobrar por el vendedor.
*/

public class Ej06 {

	private static Scanner input = new Scanner(System.in);
	final static double COMISION_PORCENTAJE = 0.16;
	final static int SUELDO_FIJO = 44000;

	public static void main(String[] args) {

		double ventaTotalRealizada;
		double importeACobrar;

		do {
			System.out.println("Ingrese el monto total de las ventas realizadas por un vendedor durante el mes");
			ventaTotalRealizada = Double.parseDouble(input.nextLine());
			if (ventaTotalRealizada < 0) {
				System.out.println("Monto ingresado incorrecto.");
			}
		} while (ventaTotalRealizada < 0);
		importeACobrar = SUELDO_FIJO + ventaTotalRealizada * COMISION_PORCENTAJE;
		System.out.println("El importe a cobrar por el vendedor es de $" + importeACobrar);

		input.close();
	}

}
