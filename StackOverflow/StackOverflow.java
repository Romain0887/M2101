public class StackOverflow {
	public int recursive(int n) {
		if(n <= 0) {
			return 0;
		}
		else {
			return 1 + recursive(n-1);
		}
	}

	public static void main (String[] args) {
		int n1 = 1000;
		int n2 = 10000000;

		recursive(n1);
		recursive(n2);
	}
}
