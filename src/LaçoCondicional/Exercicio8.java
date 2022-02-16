package LaçoCondicional;

import java.util.Scanner;

public class Exercicio8 {

	public static void main(String[] args) {
		
		float valor;
		
		Scanner leia = new Scanner(System.in);
		
		valor = leia.nextFloat();
		
		if(valor>100) {
			System.out.println(valor);
		}else {
			valor = 0;
			System.out.println(valor);
		}

	}

}
