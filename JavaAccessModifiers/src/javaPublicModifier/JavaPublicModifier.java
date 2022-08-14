package javaPublicModifier;

public class JavaPublicModifier {

	public static void main(String[] args) {
		
		JavaPublicModifier jpm = new JavaPublicModifier();
		jpm.addition(10, 20);

	}
	
	public void addition(int a, int b) {
		int i = a;
		int j = b;
		
		System.out.println("summation = " + (i+j) );
	}

}
