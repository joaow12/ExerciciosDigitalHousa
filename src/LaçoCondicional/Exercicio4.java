package LaçoCondicional;

import java.util.Scanner;

public class Exercicio4 {
	
	public static void main(String[] args) {
		
		int num;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite um número");
		num = leia.nextInt();
		
		if(num>0) {
			System.out.println("Número positivo");
		}else {
			if(num<0) {
				System.out.println("Número negativo");
			}
		}
		
		if(num%2 == 0) {
			System.out.println("Número par");
		}else {
			System.out.println("Número impar");
		}
	}
}
