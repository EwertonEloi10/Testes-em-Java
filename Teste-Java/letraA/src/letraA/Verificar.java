package letraA;
import java.util.Scanner;

public class Verificar {

	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		
		 System.out.print("Digite uma string: ");
	        String input = leitor.nextLine();
	        
	        int contador = 0;

	     
	        for (int i = 0; i < input.length(); i++) {
	            char letra = input.charAt(i);
	           
	            if (letra == 'a' || letra == 'A') {
	                contador++;
	            }
	        }

	     
	        if (contador > 0) {
	            System.out.println("letra 'a' aparece " + contador + " vez.");
	        } else {
	            System.out.println("A letra 'a' não está presente na string.");
	        }

		
		

	}

}
