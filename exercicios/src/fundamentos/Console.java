package fundamentos;

import java.util.Scanner;

public class Console {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("digite o seu nome");
		 String nome = sc.nextLine();
		 System.out.println("digite o seu sobrenome");
		 String sobrenome = sc.nextLine();
		 System.out.println("digite o sua idade");
		 int idade = sc.nextInt();
		 System.out.printf(" %s %s , tem %d anos ",nome,sobrenome,idade);
		 
		 
		
		sc.close();
	}

}
