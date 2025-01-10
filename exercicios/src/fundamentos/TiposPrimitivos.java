package fundamentos;

public class TiposPrimitivos {
	public static void main(String[] args) {
		//informação de funcionario	
		//tipos numericos inteiros
		byte  anosdeEmpresa = 23;
		short numeroVoos = 542;
		int id = 5789323;
		long pontosAcumulados = 3_134_845_233L;
		
		//tipos flutuantes
		float salario = 11_445.44F;
		
		double vendasAcumuladas = 2_991_796_103.01;
		
		//tipos booleanos
		boolean estaFeria = false;
		//tipo caractere
		char status = 'A';
		
		//dias de empresa
		System.out.println("anos de empresa: "+anosdeEmpresa * 365);
		//numero de viagens
		System.out.println("Numero de voos: "+numeroVoos / 2);
		//pontos por real
		System.out.println("Pontos acumulados reais: "+pontosAcumulados / vendasAcumuladas);
		//id
		System.out.println("Informação funcionarios do id: "+id+"-> ganha: "+salario);
		//ferias
		System.out.println("está de ferias? "+estaFeria);
		System.out.println("Status: "+status);
	}

}
