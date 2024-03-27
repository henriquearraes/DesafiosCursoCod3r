package classes;

import java.util.Scanner;

public class DataTeste {

	public static void main(String[] args) {
		
		Data d1 = new Data();
		
		System.out.println(d1.imprimirData());
		
		Data d2 = new Data(31, 12, 2020);

		System.out.println(d2.imprimirData());
	}
}
