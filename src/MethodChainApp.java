
public class MethodChainApp {

	public static void main(String[] args) {
		methodA();

	}
	
	private static void methodA() {
		System.out.println("Method A");
		methodB();
	}

	private static void methodB() {
		System.out.println("Method B");
		try {
			methodC();
		} catch (Exception e) {
			System.out.println("Method B caught exception");
			e.printStackTrace();
		}
	}
	
	private static void methodC() throws Exception {
		System.out.println("Method C");
		methodD();
	}
	
	private static void methodD() throws Exception{
		System.out.println("Method D");
		throw new Exception ("methodD exception");
	}
}
