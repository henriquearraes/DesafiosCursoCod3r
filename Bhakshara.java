import java.util.Scanner;


public class Bhakshara {

	public static void main(String[] args) {
		
		System.out.println("Vamos utilizar Bhaskara agora, a fórmula é: ax2 + bx + c = 0");
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.printf("Digite o valor de A: ".replace(",", "."));
		int a = teclado.nextInt();
		
		System.out.printf("\nDigite o valor de B: ".replace(",", "."));
		int b = teclado.nextInt();
		
		System.out.printf("\nDigite o valor de C : ".replace(",", "."));
		int c = teclado.nextInt();
		
		int delta = (b * b) - (4 * a * c);
		
		teclado.close();

		System.out.printf("\nSua operação é : "+a+"x2 + "+b+"x + "+c+" = 0.");
		
		System.out.println("\nNo delta é: "+delta);
		
		double x1 = (-b + Math.sqrt(delta)) / (2 * a);

		System.out.printf("O x1 da equação é: %.2f", x1);

		double x2 = (-b - Math.sqrt(delta)) / (2 * a);

		System.out.printf("\nO x2 da equação é: %.2f" ,x2);
		
		
	}

}
