package Repetiçao;

import java.util.Scanner;

public class Exercicio6 {

	public static void main(String[] args) {
		
	int num, soma = 0;
	float media = 0;
		
	Scanner leia = new Scanner(System.in);
	
	do {
		System.out.println("Digite um número");
		
		num = leia.nextInt();
		
		if(num%3 == 0 && num!= 0) {
			soma += num;
			media++;
		}
		
	}while(num != 0);

	System.out.printf("A média dos números multiplos de 3 é: %2.2f", soma/media);
	
	}

}
