package Questao5;

import java.util.Scanner;

public class InverterString {

	public static void main(String[] args) {
		
		Scanner wordInput = new Scanner(System.in);
		
		System.out.print("Por favor digite uma frase: ");
		String word = wordInput.nextLine();
		System.out.println();
		
		char[] letters = new char[word.length()];
		
		for(int i=0; i<word.length(); i++) {
			
			letters[i] = word.charAt(i);
		}
		
		for(int j=(letters.length-1); j>=0; j--) {
			
			System.out.print(letters[j]);
		}
	}

}
