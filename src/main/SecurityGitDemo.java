package main;

public class SecurityGitDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int a = 200, b = 300;
		System.out.println("sum of a and b is" + add(a, b));
	}

	public static int add(int a, int b) {
		System.out.println("Entered to add method");
		return a + b;
	}
}
