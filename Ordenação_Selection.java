import java.util.Arrays;
import java.util.Random;

public class Ordenação_Selection {

	public static void main(String[] args) {
		
		int []j = gerarVetor(20);
		selectionSort(j);
		System.out.println(Arrays.toString(j));
	}
	
	public static void selectionSort(int []j ) {
		
		for (int b = 0; b < j.length; b++) {
			int menor = b;
			
			for (int t = b + 1; t < j.length; t++) {
				if (j[t] < j[menor])
					menor = t;
			}
			
			trocar(j, b, menor);
		}
	}

	private static void trocar(int[] j, int b, int menor) {
		
		int a = j[b];
		j[b] = j[menor];
		j[menor] = a;
		
	}

	public static int [] gerarVetor(int w) {
		
		int []j = new int[w];
		Random g = new Random();
		for (int b = 0; b < w; b++) {
			j[b] = g.nextInt(100);
		}
		
		return j;
	}
}
