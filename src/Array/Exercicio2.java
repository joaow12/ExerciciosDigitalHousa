package Array;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		
		int[] A = new int[8];
		int[] B = new int[8];
		int x;
		
		Scanner leia = new Scanner(System.in);
		
		for(int i = 0; i<8; i++) {
			System.out.println("Digite um número: ");
			x = leia.nextInt();
			
			A[i] = x;
			B[i] = x*2;
		}
		
		System.out.println("Vetor A");
		for(int i = 0; i<8; i++) {
			System.out.println(i+1 + "° valor: " + A[i]);
		}
		
		System.out.println("Vetor B");
		for(int i = 0; i<8; i++) {
			System.out.println(i+1 + "° valor: " + B[i]);	
		}
		
		
	}

}
