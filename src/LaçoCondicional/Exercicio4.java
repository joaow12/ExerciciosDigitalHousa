package La�oCondicional;

import java.util.Scanner;

public class Exercicio4 {
	
	public static void main(String[] args) {
		
		int num;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite um n�mero");
		num = leia.nextInt();
		
		if(num>0) {
			System.out.println("N�mero positivo");
		}else {
			if(num<0) {
				System.out.println("N�mero negativo");
			}
		}
		
		if(num%2 == 0) {
			System.out.println("N�mero par");
		}else {
			System.out.println("N�mero impar");
		}
	}
}
