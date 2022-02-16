package LaçoCondicional;

import java.util.Scanner;

public class Exercicio7 {

	public static void main(String[] args) {
		
		float base, altura;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite a base do triangulo");
		base = leia.nextFloat();
		
		System.out.println("Digite a altura do triangulo");
		altura = leia.nextFloat();
		
		if(base>0 && altura>0) {
			System.out.println("Área do triangulo: " + (base*altura)/2);
		}else {
			System.out.println("Valores inválidos");
		}
	}

}
