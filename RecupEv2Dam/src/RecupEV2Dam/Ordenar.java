package RecupEV2Dam;

import java.util.Scanner;

public class Ordenar {

	public static void main(String[] args) {

		int numero1, nume2;

		String mensaje;

		Scanner teclado = new Scanner(System.in);

		System.out.print("Introduce el primer numero:   ");

		numero1 = teclado.nextInt();

		System.out.print("Introduce el segundo numero:   ");

		nume2 = teclado.nextInt();

		if (numero1 == nume2) {

			mensaje = "Los dos números son iguales";

		} else if (numero1 > nume2) {

			mensaje = "El numero " + numero1 + " es mayor que " + nume2;

		} else {

			mensaje = "El numero " + nume2 + " es mayor que " + numero1;

		}

		System.out.print(mensaje);

		teclado.close();

	}

}
