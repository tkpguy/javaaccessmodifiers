package javaProtectedModifier;

public class JavaProtectedModifier {

	public static void main(String[] args) {
			
		subtract(15, 10);

	}
	
	protected static void subtract(int i, int j) {
		System.out.println("Subtracted value = "+(i-j));
	}

}
