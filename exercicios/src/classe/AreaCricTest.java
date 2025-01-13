package classe;

public class AreaCricTest {
	public static void main(String[] args) {
		AreaCirc a = new AreaCirc(10);
		//a.pi = 10;
		
		AreaCirc a2 = new AreaCirc(5);
		//a2.pi = 5;
		
		System.out.println(a2.area());
		System.out.println(a.area());
		System.out.println(AreaCirc.area(100));
	
	}

}
