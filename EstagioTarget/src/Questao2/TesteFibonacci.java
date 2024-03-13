package Questao2;

import java.util.Scanner;

public class TesteFibonacci {

	public static void main(String[] args) {
		
		ReconheceFibonacci test = new ReconheceFibonacci();
		Scanner input = new Scanner(System.in);
		String translate;
		int numberNumeric = 0 ;
		
		System.out.print("Por favor digite um numero para o teste: ");
		String numberString = input.next();
		System.out.println();
		
		try {
			numberNumeric = Integer.parseInt(numberString);
		}
		catch (NumberFormatException e) {
			e.printStackTrace();
			System.out.println("Por favor digite um numero inteiro");
		}
		
		boolean validation = test.testeFibonacci(numberNumeric);
		
		if(validation == true) {
			translate = "faz parte";
		}else {
			translate = "não faz parte";
		}
		
		System.out.println("O numero " + translate + " de uma sequência Fibonacci");
	}

}
