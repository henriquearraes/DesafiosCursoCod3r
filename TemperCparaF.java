import java.util.Scanner;

public class TemperCparaF {

	public static void main(String[] args) {
		
		final double fator = 32;
		final double ajuste = 1.8;
		
		Scanner teclado = new Scanner(System.in);
		System.out.printf("Digite a temperatura em Celsius a ser convertida para Fahrenheit: ");
		double celsius=teclado.nextDouble();
		
		teclado.close();
		double fahrenheit = (celsius*ajuste)+fator;
		
		System.out.printf("Conversão de Celsius para Fahrenheit: "+fahrenheit);
		

	}

}
