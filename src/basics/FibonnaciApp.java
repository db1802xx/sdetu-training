package basics;

public class FibonnaciApp {

	public static void main(String[] args) {
		// Fibonnaci number is defined by the sum of the 2 previous fibonnaci numbers
		// fib(0) = 0
		// fib(1) = 1
		// fib(2) = fib(1) + fib(0) = 0 + 1 = 1
		// fib(3) = fib(2) + fib(1) = 1 + 1 = 2
		// fib(4) = fib(3) + fib(2) = 2 + 1 = 3
		// fib(5) = fib(4) + fib(3) = 3 + 2 = 5
	
		int n = 0;
		do {
			System.out.println("Fibonnaci number " + n + ": " + fib(n));
			// System.out.println("Factorial number " + n + ": " + fac(n));
			n++;
			try {
				Thread.sleep(500);
			} catch (Exception e) {
				e.printStackTrace();
			}
		} while (true);
	}
	
	public static double fib(int n) {
		if (n == 0) {
			return 0;
		}
		else if (n == 1) {
			return 1;
		}
		return ((fib(n-1) + fib(n-2)));
	}
	
	public static double fac(int n) {
		if (n == 0) {
			return 1;
		}
		return n * fac(n-1);
	}

}
