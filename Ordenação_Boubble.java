
public class Ordenação_Boubble {

	public static void main(String[] args) {
		
		int v[] = {9, 2, 8, 11, 5, 6};
		int a;
		boolean c;
		
		for(int b = 0; b < v.length; ++b) {
			c = true;
			
			for(int j = 0; j < (v.length - 1); ++j) {
				
				if(v[j] > v[j + 1]) {
					a = v[j];
					v[j] = v[j + 1];
					v[j + 1] = a;
					c = false;
					
				}
			}
			
			if(c) {
				break;
			}
		}
		
		System.out.println("Ordem crescente -> " ); 
		
		for(int b = 0; b < v.length; ++b) {
			System.out.println(v[b]);
		}
	}
}
