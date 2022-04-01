package Array;

import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		
		double[] A = new double[15];
		double[] B = new double[15];
		double x;
		
		Scanner leia = new Scanner(System.in);
		
		for(int i = 0; i<15; i++) {
			System.out.println("Digite um número: ");
			x = leia.nextInt();
			
			A[i] = x;
			B[i] = Math.sqrt(x);
		}
		
		System.out.println("Vetor A");
		for(int i = 0; i<15; i++) {
			System.out.println(i+1 + "° valor: " + A[i]);
		}
		
		System.out.println("Vetor B");
		for(int i = 0; i<15; i++) {
			System.out.println(i+1 + "° valor: " + B[i]);	
		}
		
		
	}

}
