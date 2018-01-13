
public class ExceptionsApp {

	public static void main(String[] args) {
		String choice = "y";
		while (!choice.equalsIgnoreCase("n")) {
			
		
		int a = Console.getInt("Enter first #: ");
		int b = Console.getInt("Enter second #: ");
		try {
		System.out.println("Result = "+calculate(a, b));
		}
		catch (ArithmeticException ae) {
			System.out.println("Exception occurred...try again."); //will print in black
			System.err.println("Exception occred... try again"); //will print in red. calls more attention
			System.out.println("getMessag() = " +ae.getMessage());
			System.out.println("toString() = " + ae.toString());
			ae.printStackTrace(); 
			
		}
		choice = Console.getString("Continue?: ");
		}
	}

	private static double calculate(int a, int b) throws ArithmeticException {
		int result = a/b;
		return result;
	}
}
