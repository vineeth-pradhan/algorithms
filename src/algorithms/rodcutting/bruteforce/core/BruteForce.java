package algorithms.rodcutting.bruteforce.core;

public class BruteForce {
	int[] price = {0, 1, 5, 8, 9, 10, 17, 17, 20, 24, 30, 32, 34, 36, 39, 43, 44, 44, 44, 44, 46, 46, 46, 46, 48, 48, 48, 48, 48, 48, 48, 48, 48, 54, 54, 54, 54, 54, 54, 54, 54,  54, 54, 54, 54,  54, 54, 54, 54,  54, 54, 54, 54};

	public int cutRod(int n) {
		int q = -11111111;
		if(n == 0) {
			return 0;
		}
		for(int i = 1; i <= n; i++) {
			q = max(q, price[i] + cutRod(n - i));
		}
		return q;
	}

	private int max(int a, int b) {
		return (a > b) ? a : b;
	}
}