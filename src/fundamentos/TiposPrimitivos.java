package fundamentos;

public class TiposPrimitivos {
	public static void main(String[] args) {
		//Indormaçoes do funcionario
		
		// Tipos numéricos inteiros
		
		byte anosDeEmpresa = 23;
		short numeroDeVoos = 542;
		int id = 56545;
		long pontosAcomulados = 3_244_845_223L;
		
		// Tipos numéricos reais 
		float salario = 11_445_33;
		double vendasAcomuladas = 2_991_797_101_3D;
		
		// Tipo booleano
		
		boolean estaDeFerias = true; //false
		
		// Tipo caracter 
		char status = 'A';//ativo
		
		// Dias de empresa
		
		System.out.println(anosDeEmpresa * 365+ " Anos de Empresa");
		
		// Numero de viagens 
		
		System.out.println(numeroDeVoos / 2 + " Voos");
		
		// Pontos por real 
		
		System.out.println(pontosAcomulados / vendasAcomuladas +" Vendas acomuladas");
		
		// Id
		
		System.out.println("O funcionario de registro " + id + " Ganha -> "+ salario);
		
		// Booleano
		
		System.out.println("Férias? " + estaDeFerias);
		
		// Tipo de caracter 
		System.out.println("Status: " + status);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
