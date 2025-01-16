package classe;

public class Data {
	int dia;
	int mes;
	int ano;
	
	Data(){
		/*this.dia = 1;
		this.mes = 1;
		this.ano = 1970;*/
		this(1,1,1970);
	}
	Data(int dia,int mes, int ano){
		this.dia = dia;
		this.mes = mes;
		this.ano = ano;
	}
	
	public String dataFormatada() {
		
		return String.format("%d/%d/%d",dia,mes,ano) ;
	}
	
	public void mostrarData() {
		System.out.println(dataFormatada());
	}

}
