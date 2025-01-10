package fundamentos;

public class TipoString {
	public static void main(String[] args) {
		System.out.println("Olá pessoa".charAt(2));
		String s = "Boa tarde";
		System.out.println(s.concat("!!!!"));
		System.out.println(s.startsWith("Boa"));
		System.out.println(s.toLowerCase().startsWith("boa"));
		System.out.println(s.length());
		System.out.println(s.endsWith("tarde"));
		System.out.println(s.equals("boa tarde"));
		System.out.println(s.equalsIgnoreCase("boa tarde"));
		
		var nome = "Jose";
		var sobrenome = "santos";
		var idade = 27;
		var salario = 30003.12;
		String frase = String.format("O %s %s tem a idade %d e possui um salario de R$ %.2f",nome,sobrenome,idade,salario);
		System.out.println(frase);
		System.out.println();
	}

}
