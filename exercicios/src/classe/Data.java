package classe;

public class Data {
	int dia;
	int mes;
	int ano;
	
	public String dataFormatada() {
		
		return String.format("%d/%d/%d",dia,mes,ano) ;
	}
	
	public void mostrarData() {
		System.out.println(dataFormatada());
	}

}
