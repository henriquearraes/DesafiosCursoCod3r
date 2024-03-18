import java.util.Scanner;

public class ParImpar {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.print("Digite um número de 0 a 10: ");
		int numero = teclado.nextInt();
		
		if (numero>=0 && numero<=10) {
			if(numero %2==0) {
				System.out.println("O número "+numero+" é par.");
			}else {
				System.out.println("O número "+numero+" é ímpar.");
			}
				
			
		}else {
			System.out.println("Seu número "+numero+" não está entre 0 e 10.\nPor favor, tente novamente.");
		}
		
		teclado.close();
	}
}
