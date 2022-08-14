package packageAccessChecker;

import javaProtectedModifier.JavaProtectedModifier;

public class JPRMDiffPackSameProject {

	public static void main(String[] args) {
		
		JavaProtectedModifier jprm = new JavaProtectedModifier();
		// jprm.subtract();  --> As expected, the protected subtract method is not accessible without inheritance

	}

}
