package Repetiçao;

import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		
		int idade, sexo, opcao, contHAg = 0, contC = 0, contOC = 0, contMN = 0, contN = 0, contCMenor = 0, cont = 0;
		
		Scanner leia = new Scanner(System.in);
		
		while(cont != 3) {
			
			System.out.println("Digite o sua idade");
			
			idade = leia.nextInt();
			
			System.out.println("Digtie o seu sexo (1 - Feminino / 2 - Masculino / 3 - Outros)");
			
			sexo = leia.nextInt();
			
			while(sexo != 1 && sexo != 2 && sexo != 3) {
				System.out.println("Digite uma opção valida (1, 2 ou 3)");
				sexo = leia.nextInt();
			}
			
			System.out.println("Escolha sua opção (1 - Pessoa calma / 2 - Pessoa nervosa / 3 Pessoa agressiva");
			
			opcao = leia.nextInt();
			
			while(opcao != 1 && opcao != 2 && opcao != 3) {
				System.out.println("Digite uma opção valida (1, 2 ou 3)");
				opcao = leia.nextInt();
			}
			
			if(opcao == 1) {
				contC++;
			}
			if(sexo == 1 && opcao == 2) {
				contMN++;
			}
			if(sexo == 2 && opcao == 3) {
				contHAg++;
				}
			if(sexo == 3 && opcao == 1) {
				contOC++;
				}
			if(opcao == 2 && idade>40) {
				contN++;
				}
			if(opcao == 1 && idade<18) {
				contCMenor++;
				}

			cont++;
		}
		
		System.out.println("Número de pessoas calmas: " + contC + "\nNúmero de mulheres nervosas: " + contMN + "\nNúmero de homens agressivos: " + contHAg + "\nNúmero de outros calmos: " + 
		contOC + "\nNúmero de pessoas nervosas com mais de 40 anos: " + contN + "\nNúmero de pessoas calmas com menos de 18 anos: " + contCMenor);
		
	}

}
