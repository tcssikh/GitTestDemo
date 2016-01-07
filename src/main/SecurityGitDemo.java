package main;

public class SecurityGitDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int a = 100, b = 100;
		System.out.println("sum of a and b is" + add(a, b));
	}

	public static int add(int a, int b) {
		System.out.println("Entered to add method");
		return a + b;
	}
}
