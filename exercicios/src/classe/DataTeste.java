package classe;

public class DataTeste {

	public static void main(String[] args) {
		Data d1 = new Data();
		d1.dia = 12;
		d1.mes = 01;
		d1.ano = 2025;
		
		d1.mostrarData();
		
		Data d2 = new Data();
		d2.dia = 20;
		d2.mes = 10;
		d2.ano = 2015;
		
		d2.mostrarData();
		
		Data d3 = new Data();
		d3.mostrarData();
	}

}
