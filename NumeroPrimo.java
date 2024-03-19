import java.util.Scanner;

public class NumeroPrimo {

	public static void main(String[] args) {
		

		int contadorDeDivisores = 0;
		Scanner teclado = new Scanner(System.in);

		System.out.print("\nDigite um numero para verificar se é primo: ");
		int numero = teclado.nextInt();
		
		for (int i = 2; i < numero; i++) {
			if (numero % i == 0) {
				contadorDeDivisores++;
			}
		}

		if (contadorDeDivisores == 0) {
			System.out.println("\nO numero " + numero + " é primo.");
		} else {
			System.out.println("\nO numero " + numero + " não é primo.");
		}

		teclado.close();

	}

}
