
public class Recursividade {

	public static int FatorialNaoRecursivo(int n) {
		
		if (n == 0) {
			return 1;
		}
		
		int total = 1;
		
		for (int j = n; j>1; j--) {
			total *= j;
		}
		
		return total;
	}
	
public static int Fatorial(int n) {
		
		if (n == 0) {
			return 1;
		}
		
		return n * Fatorial(n-1);
	}
}
