
public class TesteMultiCatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		metodo1();
	}
	public static void metodo1() {
		
		try {
			System.out.println(1/0);
		} catch(ArithmeticException ex) {
			ex.printStackTrace();
		} catch(NullPointerException ex) {
			ex.printStackTrace();    
		}
	}

}
