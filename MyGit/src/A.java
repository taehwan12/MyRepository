
public class A {

	public A() {
		int a = 23, b = 15;
		int result = a + b;
		System.out.println("Sum = " + result);
		System.out.println("This is the master branch");
		System.out.println("(Changed in devB branch and merged) Sum = " + result);
		
		//branch devC���� a, b�� c, d�� �����Ͽ� �浹 �ذ� �� merge
		int c = -15, d = -7;
		int result2 = c + d;
		System.out.println("(Changed in devC branch) Sum = " + result2);
	}

}
