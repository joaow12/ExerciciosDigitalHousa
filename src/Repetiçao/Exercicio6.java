package Repeti�ao;

import java.util.Scanner;

public class Exercicio6 {

	public static void main(String[] args) {
		
	int num, soma = 0;
	float media = 0;
		
	Scanner leia = new Scanner(System.in);
	
	do {
		System.out.println("Digite um n�mero");
		
		num = leia.nextInt();
		
		if(num%3 == 0 && num!= 0) {
			soma += num;
			media++;
		}
		
	}while(num != 0);

	System.out.printf("A m�dia dos n�meros multiplos de 3 �: %2.2f", soma/media);
	
	}

}
