package LaçoCondicional;

import java.util.Scanner;

public class Exercicio1 {
	
	public static void main(String[] args) {
		
		int peso, excesso;
		float multa;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite o peso total");
		peso = leia.nextInt();
		
		if(peso>50) {
			excesso = peso-50;
			multa = excesso*4;
			System.out.println("Você teve " + excesso + "kg em excesso, por isso deve pagar uma multa de: " + multa + "R$");
		}else {
			excesso = 0;
			multa = 0;
			System.out.println("Você teve " + excesso + "kg em excesso, por isso deve pagar uma multa de: " + multa + "R$");
		}
	}

}
