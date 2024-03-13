package Questao2;

public class ReconheceFibonacci {
	
	public ReconheceFibonacci() {	
	}
	
	public boolean testeFibonacci(int number) {
		
		int number1 = 0;
		int number2 = 1;
		int numberFibonacci = 1;
		
		while(numberFibonacci < number) {
			numberFibonacci = number1 + number2;
			number1 = number2;
			number2  = numberFibonacci;
		}
		
		if(numberFibonacci == number) {
			return true;
		}else {
			return false;
		}
	}
}
