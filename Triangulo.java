import java.util.Scanner;

public class Triangulo {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.printf("Digite a base do triângulo : ".replace(",","."));
		double base = teclado.nextDouble();
		
		System.out.printf("Digite o altura do triângulo : ".replace(",", "."));
		double altura = teclado.nextDouble();
		
		
		teclado.close();
		
		double areaTriangulo = (base*altura)/2;
		
		System.out.println("A área do triângulo é igual a : "+areaTriangulo);

	}

}
