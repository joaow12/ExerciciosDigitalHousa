package LaçoCondicional;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		
		int num1, num2, num3, num4, x = 1;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite o valor do 1° número");
		num1 = leia.nextInt();
		
		num1 = num1*num1;
		
		System.out.println("Digite o valor do 2° número");
		num2 = leia.nextInt();
		
		num2 = num2*num2;
		
		System.out.println("Digite o valor do 3° número");
		num3 = leia.nextInt();
		
		num3 = num3*num3;
		
		if(num3>=1000) {
			
			System.out.println("Quadrado dos números digitados: \n1° número: " + num1 + "\n2° número: " + num2 + "\n3° número: " + num3);
			
		}else {
		
			System.out.println("Digite o valor do 4° número");
			num4 = leia.nextInt();
			
			num4 = num4*num4;
			
			System.out.println("Quadrado dos números digitados: \n1° número: " + num1 + "\n2° número: " + num2 + "\n3° número: " + num3 + "\n4° número: " + num4);
		}
		

	}

}
