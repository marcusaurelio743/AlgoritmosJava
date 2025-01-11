package fundamentos;

import java.util.Scanner;

public class DesafioSemana {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Informe a semana");
		String semana = sc.nextLine();
		
		if(semana.equalsIgnoreCase("domingo")) {
			System.out.println("1");
		}else if(semana.equalsIgnoreCase("segunda")) {
			System.out.println("2");
		}else if(semana.equalsIgnoreCase("terça")) {
			System.out.println("3");
		}else if(semana.equalsIgnoreCase("quarta")) {
			System.out.println("4");
		}else if(semana.equalsIgnoreCase("quinta")) {
			System.out.println("5");
		}else if(semana.equalsIgnoreCase("sexta")) {
			System.out.println("6");
		}else if(semana.equalsIgnoreCase("sabado")) {
			System.out.println("7");
		}
		
		sc.close();
	}

}
