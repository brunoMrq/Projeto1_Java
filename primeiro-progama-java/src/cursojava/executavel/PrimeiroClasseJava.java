package cursojava.executavel;

public class PrimeiroClasseJava {
	
	/*main é um método auto executável em java*/
	public static void main(String[] args) {
		
		/*Escreve texto no console*/
		System.out.println("Hello Word !!!");
		System.out.println("É nois !!!");
		System.out.println("Blink Do");
		System.out.println("Verificando as merdas");
	
		int variavel;
		
		variavel = 1;
		
		System.out.println("O número é: " + variavel);
		
		double n = 7;
		double m = 3;
		double z = (m + n)/1;
				
		System.out.println("O número é: " + z);
		
		if (z <= 10 && m==2) {
			System.out.println(" O número é menor que 10");
		}
		else {
		System.out.println("Resultado Inválidos");
		}
	}
}
