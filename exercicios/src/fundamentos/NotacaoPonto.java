package fundamentos;

public class NotacaoPonto {
	public static void main(String[] args) {
		String s = "Bom dia x"; 
		 s =  s.replace("x", "senhora");
		 s = s.toUpperCase();
		 s = s.concat("!!!!");
		System.out.println(s);
		
		String y = "bom dia x".replace("x", "amanda").toUpperCase().concat("!!!");
		System.out.println(y);
	}

}
