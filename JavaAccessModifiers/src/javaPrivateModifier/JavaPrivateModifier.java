package javaPrivateModifier;

public class JavaPrivateModifier {

	public static void main(String[] args) {
		
		multiply(2, 5);

	}
	
	private static void multiply(int a,int b) {
		System.out.println("Multiplied value = " + (a*b));
	}

}
