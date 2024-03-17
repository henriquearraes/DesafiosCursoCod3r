import java.util.Scanner;

public class DesafioCalculadora {

	public static void main(String[] args) {
		
		
		Scanner teclado=new Scanner(System.in);
		
		System.out.printf("Digite o primeiro número: ".replace(",", "."));
		double num1=teclado.nextDouble();
		
		System.out.printf("Digite o segundo número: ".replace(",", "."));
		double num2=teclado.nextDouble();
		
		System.out.printf("Informe a operação: ");
		String op=teclado.next();
		
		//Lógica 
		double resultado = "+".equals(op) ? num1+num2 : 0;
		resultado = "-".equals(op) ? num1-num2 : resultado;
		resultado = "*".equals(op) ? num1*num2 : resultado;
		resultado = "/".equals(op) ? num1/num2 : resultado;
		resultado = "%".equals(op) ? num1%num2 : resultado;
		teclado.close();
		System.out.printf(num1+" "+op+" "+num2+" = "+resultado);
		

	}

}
