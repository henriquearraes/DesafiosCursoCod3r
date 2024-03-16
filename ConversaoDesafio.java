package fundamentos;

import java.util.Scanner;

public class ConversaoDesafio {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.printf("Informe o primeiro salário: ");
		String valor1= entrada.next().replace(",", ".");
	
		System.out.printf("Informe o segundo salário: ");
		String valor2= entrada.next().replace(",", ".");
		
		System.out.printf("Informe o terceiro salário: ");
		String valor3= entrada.next().replace(",", ".");
		
		double salario1 = Double.parseDouble(valor1);
		double salario2 = Double.parseDouble(valor2);
		double salario3 = Double.parseDouble(valor3);
		
		double media = (salario1+salario2+salario3)/3;
		
		entrada.close();
		System.out.print("\n");
		System.out.println("A média salarial nos últimos 3 meses é: "+media);
		

	}

}
