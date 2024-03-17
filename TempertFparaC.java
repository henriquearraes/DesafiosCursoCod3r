import java.util.Scanner;

import javax.swing.JOptionPane;

public class TempertFparaC {

	public static void main(String[] args) {
		
		
		final double fator = 32.00;
		final double ajuste = 5.0/9.0;
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.printf("Digite a temperatura em ºF a ser convertida em °C: ");
		double fahrenheit=teclado.nextDouble();
		
		double celsius = (fahrenheit-fator)*ajuste;
		
		
		teclado.close();
		
		System.out.println("O valor em Celsius é : "+celsius);

	}

}
