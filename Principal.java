package MetodoStaticConverterDolarReal;

import java.util.Locale;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantidade de Dolar: ");
		ConversorMoeda.quantidadeDolar = sc.nextDouble();
		
		ConversorMoeda.converter();
		
		
		System.out.printf("Valor a pagar em Reais = %.2f%n", ConversorMoeda.converter());
		
		
		sc.close();

	}

}
