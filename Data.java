package classes;

public class Data {

	int dia;
	int mes;
	int ano;
	
	String dataNascimento() {
		return String.format( dia+"/"+mes+"/"+ano+".");
	}
	String imprimirData() {
		return String.format("Sua data de nascimento é: "+dataNascimento()); 
	}
	Data(){
		dia=01;
		mes=01;
		ano=1970;
	}
	 Data (int diaNiver, int mesNiver, int anoNiver) {
		dia=diaNiver;
		mes=mesNiver;
		ano=anoNiver;
	}
}
