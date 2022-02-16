package Repetiçao;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		
		int menosVinte = 0, maiorCinquenta = 0, idade = 0;
		
		Scanner leia = new Scanner(System.in);
		
		while(idade!=-99) {
			System.out.println("Digite uma idade (para encerrar o programa digite -99)");
			idade = leia.nextInt();
			while(idade!=-99 && idade<0) {
				System.out.println("Idade inválida, digite uma idade positiva ou -99 para encerrar o programa");
			}
			if(idade<21) {
				menosVinte++;
			}else {
				if(idade>50) {
					maiorCinquenta++;
				}
			}
			
		}
		
		System.out.println("Você digitou " + menosVinte + " idades menores que 21, e digitou " + maiorCinquenta + " idades maiores que 50");
	}

}
