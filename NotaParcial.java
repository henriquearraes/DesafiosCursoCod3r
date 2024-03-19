import java.util.Locale;
import java.util.Scanner;

public class NotaParcial {

	public static void main(String[] args) {
		Locale.setDefault(new Locale ("en","US"));
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.print("Insira sua primeira nota: ");
		double nota1 = teclado.nextDouble();
		
		System.out.print("Insira sua segunda nota: ");
		double nota2=teclado.nextDouble();
		
		double media = (nota1+nota2)/2;
		
		if(media>=7 && media<=10) {
			System.out.println("Aprovado!");
		}else if (media <7 && media>=4) {
			System.out.println("Recuperação.");
		}else if(media>=0 && media<4) {
			System.out.println("Reprovado!");
		}else {
			System.out.println("Média inválida!");
		}
		
		teclado.close();

	}

}
