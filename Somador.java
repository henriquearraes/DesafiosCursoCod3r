import java.util.Scanner;

public class Somador {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		int SomadorDeNumeros = 0;
		int numero = 0;
		
		while(numero>=0) {
			System.out.printf("\nDigite um número inteiro (ou negativo"
					+ " para sair): ");
			numero = teclado.nextInt();
			
			if(numero>=0) {
				SomadorDeNumeros+=numero;
				System.out.println("Soma até o momento: "+SomadorDeNumeros);
				
	
			}else if (numero<0) {
				System.out.println("\nObrigado por usar nosso Somador"
						+ ".\nO valor total deu: "+SomadorDeNumeros);
				break;
			}
		}
		
		teclado.close();

	}

}
