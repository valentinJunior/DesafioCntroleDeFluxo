package contador;
import java.util.Scanner;
import parametrosInvalidos.ParametrosInvalidosException;

public class Contador {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int num1 = 0;
		int num2 = 0;
		
		System.out.println("*------------------------------------*");
		System.out.println("INFORME 2 NUMEROS PARA O PROCESSAMENTO");
		System.out.println("*------------------------------------*");
		System.out.println("INFORME O PRIMEIRO NUMERO ");
		num1 = scanner.nextInt();
		System.out.println("INFORME O SEGUNDO  NUMERO ");
		num2 = scanner.nextInt();
		System.out.println("*------------------------------------*");
		scanner.close();
		
		try {
			
			verificaParametros(num1, num2);
			
		}catch(ParametrosInvalidosException ex) {
			
			System.out.println("O segundo parâmetro deve ser maior que o primeiro");
			
		}
		
	}
	
	public static void verificaParametros(int num1, int num2) throws ParametrosInvalidosException {
		
		if (num1 == num2) {
			
			  throw new ParametrosInvalidosException();
			  
		} else {
			
			int subtraiParametros = num2 - num1;
			
			System.out.println(" SUBTRAÇÃO DOS NUMEROS: " + subtraiParametros);
			
			for (int contador = 0; contador <= subtraiParametros; contador ++) {
								
				System.out.println(" INPRIMINDO O PRIMEIRO PARAMETRO: " + num1);
				
				System.out.println(" INPRIMINDO O SEGUNDO  PARAMETRO: " + num2);
				
				System.out.println(" CONTADOR AGORA VALE: " + contador);
				
				System.out.println("*------------------------------------*");
			}
						
		}
	}

}
