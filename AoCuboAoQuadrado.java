import java.util.Scanner;

public class AoCuboAoQuadrado {

	public static void main(String[] args) {
		
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.printf("Digite o primeiro número a ser elevado: ");
		double num1 = teclado.nextDouble();
		
		
		teclado.close();
		
		double quadrado = Math.pow(num1, 2);
		double cubo = Math.pow(num1, 3);
		
		System.out.println("\nO valor ao quadrado é : "+quadrado+"\nO valor ao cubo é: "+cubo);

	}

}
