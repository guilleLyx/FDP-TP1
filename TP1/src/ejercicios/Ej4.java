package ejercicios;

import java.util.Scanner;

/* TP[1] Ejercicio 1
* Grupo Nro.: -
* Integrantes: Guille
* Enunciado:
* Realiz� un programa que permita ingresar el valor monetario de una hora de trabajo y la
cantidad de horas trabajadas por d�a por un trabajador. Debes mostrar el valor del salario
semanal, sabiendo que trabaja todos los d�as h�biles y la mitad de las horas del d�a h�bil los
s�bados. (Todas las horas valen lo mismo.)
*/

public class Ej4 {

	private static Scanner input = new Scanner(System.in);
	final static double DIAS_TRABAJADOS_X_SEMANA = 5.5;
	final static int HORAS_DIARIAS_MINIMAS_TRABAJADAS = 0;
	final static int HORAS_DIARIAS_MAXIMAS_TRABAJADAS = 24;
	final static int VALOR_HORA_MINIMO = 0;

	public static void main(String[] args) {
		double valorHora;
		int horasDiariasTrabajadas;

		do {
			System.out.println("Ingrese el valor de una hora");
			valorHora = Double.parseDouble(input.nextLine());
			if (valorHora <= VALOR_HORA_MINIMO) {
				System.out.println("El valor ingresado es incorrecto");
			}
		} while (valorHora <= VALOR_HORA_MINIMO);

		do {
			System.out.println("Ingrese la cantidad de horas trabajadas por d�a");
			horasDiariasTrabajadas = Integer.parseInt(input.nextLine());
			if (horasDiariasTrabajadas <= HORAS_DIARIAS_MINIMAS_TRABAJADAS
					|| horasDiariasTrabajadas >= HORAS_DIARIAS_MAXIMAS_TRABAJADAS) {
				System.out.println("El valor ingresado es incorrecto");
			}
		} while (horasDiariasTrabajadas <= HORAS_DIARIAS_MINIMAS_TRABAJADAS
				|| horasDiariasTrabajadas >= HORAS_DIARIAS_MAXIMAS_TRABAJADAS);

		System.out.println("El valor del salario semanal es de $"
				+ (valorHora * horasDiariasTrabajadas * DIAS_TRABAJADOS_X_SEMANA));

		input.close();
	}

}
