package La�oCondicional;

import java.util.Scanner;

public class Exercicio5 {

	public static void main(String[] args) {
		
		float indice;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite o ind�ce de polui��o");
		
		indice = leia.nextFloat();
		
		if(indice>=0.05 && indice<=0.25) {
			System.out.println("Pouli��o Aceitavel");
		}else {
			if(indice>= 0.3 && indice<0.4) {
				System.out.println("Industrias do 1� grupo devem suspender suas atividades");
			}else {
				if(indice>=0.4 && indice<0.5) {
					System.out.println("Industrias do 1� e 2� grupos devem suspender suas atividades");
				}else {
					if(indice>=0.5) {
						System.out.println("Todos os grupos devem suspender suas atividades");
					}else {
						System.out.println("Valor inv�lido");
					}
				}
			}
		}
	}

}
