package fundamentos;

import java.util.Locale;
import java.util.Scanner;

public class ConversaoStringInteiro {
	/*criar um programa que o usuario
	 * informa o salario de 2 funcionarios no formato 11.20,45 
	 * some esses dois valores e tire a media 
	*/
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe o 1 salário");
		String salario1 = sc.nextLine();
		salario1 = salario1.replace(".", "").replace(",", ".");
		System.out.println("Informe o 2 salário");
		String salario2 = sc.nextLine().replace(".", "").replace(",", ".");
		
		Double salario1Converter = Double.valueOf(salario1);
		Double salario2Converter = Double.valueOf(salario2);
		System.out.println("Media do salario informado é "+(salario1Converter+salario2Converter)/2);
		
		sc.close();
		
	}

}
