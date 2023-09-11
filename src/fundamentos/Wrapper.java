package fundamentos;

public class Wrapper {
	public static void main(String[] args) {

		

		// Byte

		Byte b = 100;

		Short s = 1000;

		// Integer.parseInt(entrada.next())
		Integer i = 10000; // int

		Long l = 100000L;

		System.out.println(b.byteValue());

		System.out.println(s.toString());

		System.out.println(i);
		
		Float f = 121F;
		System.out.println(f);
		
		Double d = 1234D;
		System.out.println(d);
		
		Boolean bo = Boolean.parseBoolean("true");
		System.out.println(bo);
		System.out.println(bo.toString().toUpperCase());
		
		Character c = '#';
		System.out.println(c.toString());
		

	}

}
