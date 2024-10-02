package fibonacci;

import java.util.Scanner;

public class Fibonaci {

	public static boolean verificar(int num) {
		if (num < 0) {
			return false;
		}
		int a = 0, b = 1;

		while (a <= num) {
			if (a == num) {
				return true;
			}
			int temp = a + b;
			a = b;
			b = temp;
		}

		return false;
	}

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		String continuar = "s";

		while (continuar.equalsIgnoreCase("s")) {
			System.out.print("Digite um número: ");
			int numero = scanner.nextInt();

			if (verificar(numero)) {
				System.out.println("O número " + numero + " PERTENCE à sequência de Fibonacci.");
			} else {
				System.out.println("O número " + numero + " NÃO pertence à sequência de Fibonacci.");
			}

			System.out.print("\nDeseja verificar outro número? (s/n): ");
			continuar = scanner.next();
		}
	}
}
