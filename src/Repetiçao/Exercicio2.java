package Repetiçao;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		
		int inicio, par = 0, impar = 0;
		
		Scanner leia = new Scanner(System.in);
		
		for(int i=1; i<=10; i++) {
			System.out.println("Digite um número");
			inicio = leia.nextInt();
			
			if(inicio%2 == 0) {
				par++;
			}else {
				impar++;
			}
		}
		
		System.out.println("Quantidades de pares: " + par + "\nQuantidade de impares: " + impar);

	}

}
