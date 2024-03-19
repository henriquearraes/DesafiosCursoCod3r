import java.util.Scanner;

public class AnoBissexto {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Digite o ano: ");
		int ano=teclado.nextInt();
		
		boolean bissexto = ano%4==0 && ((ano%100)!=0 || ano%400==0);
		
		if (bissexto==true) {
			System.out.println("O ano "+ano+" é bissexto.");
		}else {
			System.out.println("O ano "+ano+" não é um ano bissexto.");
		}
		System.out.println("Fim.");
		teclado.close();

	}

}
