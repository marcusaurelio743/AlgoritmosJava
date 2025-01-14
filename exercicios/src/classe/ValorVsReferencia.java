package classe;

public class ValorVsReferencia {

	public static void main(String[] args) {
		//atribuição por valor
		double a = 2;
		double b = a;
		a++;
		b--;
		
		System.out.println(a+" "+b);
		
		Data d1 = new Data(13, 1, 2025);
		Data d2 = d1;//atribuição por referencia
		d1.dia = 31;
		d2.mes = 2;
		
		System.out.println(d1.dataFormatada());
		System.out.println(d2.dataFormatada());
		
		retornarDataPadrao(d1);
		
		System.out.println(d1.dataFormatada());
		System.out.println(d2.dataFormatada());
		
		int c = 5;
		alterarPrimitivo(c);
		System.out.println(c);

	}
	
	public static void retornarDataPadrao(Data d) {
		d.dia = 1;
		d.mes = 1;
		d.ano = 1970;
	}
	public static void alterarPrimitivo(int c) {
		c++;
	}

}
