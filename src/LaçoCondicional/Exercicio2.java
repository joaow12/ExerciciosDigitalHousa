package La�oCondicional;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		
		int codigo, horas, excesso;
		float salario, salarioE;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digtie o seu c�digo");
		codigo = leia.nextInt();
		
		System.out.println("Digite a quantidade de horas trabalhadas");
		horas = leia.nextInt();
		
		if(horas>50) {
			salario = 10*50;
			salarioE = (horas-50)*20;
			salario += salarioE;
			
		}else {
			salario = horas*10;
			salarioE = 0;
		}
		
		System.out.println("C�digo do funcionario: " + codigo + "\nSal�rio Total: " + salario + "\nSal�rio Excedente: " + salarioE);
		

	}

}
