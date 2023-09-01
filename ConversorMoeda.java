package MetodoStaticConverterDolarReal;

public class ConversorMoeda {
	
	public static double dolar = 3.10;
	
	static double quantidadeDolar;
	
	public static double converter() {
		return  quantidadeDolar * dolar + (quantidadeDolar * dolar * 6 / 100);
		
	}
	

}
