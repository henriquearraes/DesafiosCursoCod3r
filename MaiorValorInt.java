package classes;

import java.util.Scanner;

public class MaiorValorInt {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int maiorValor = 0;
		int contador = 0;

		do {
			System.out.printf("\nDigite um numero: ");
			int valor = scanner.nextInt();

			if (valor > maiorValor) {
				maiorValor = valor;
			}

			contador++;
		} while (contador != 5);

		System.out.printf("O maior valor foi: " + maiorValor);
		scanner.close();

	}

}
