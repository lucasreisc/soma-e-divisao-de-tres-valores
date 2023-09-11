package fundamentos;

public class ConversaoTiposPrimitivosNumericos {

	public static void main(String[] args) {
		
		double a =1;
		System.out.println(a); // implicita
		
		float b = 1.0F;
		System.out.println(b);
		
		int c = 4;
		
		byte d = (byte)c; // explicita (CAST)
		System.out.println(d); 
		
		double e = 1;
		int f = (int)e; // explicita (CAST)
		System.out.println(f);
		
		
		
		
		
	}
}
