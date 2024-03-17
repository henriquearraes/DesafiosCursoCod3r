import java.util.Scanner;

public class DesafioWhile {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		int QuantidadeDeNotas = 0;
		double nota = 0;
		double total = 0;
		
		while (nota!=-1) {
			System.out.print("Informe a nota (ou -1 p/ sair) : ");
			nota = teclado.nextDouble();
			
			if(nota<=10 && nota>=0) {
			total+=nota;
			QuantidadeDeNotas++;
			}else if (nota!= -1){
				System.out.println("Nota Inválida!");
			}
		}
				//CALCULAR A MÉDIA
					double media= total / QuantidadeDeNotas;
					System.out.println("Média  = "+media);

		teclado.close();
	}

}
