package Cod;

import java.util.Scanner;

public class Ex3 {
	
	public static void main(String args[]) {
		
		Scanner ler = new Scanner(System.in);
		int idade;
		
		System.out.print("Qual a sua idade? ");
		idade = ler.nextInt();
		
		if( idade > 10 && idade <= 14) {
			
			System.out.print("Sua categoria �: Infantil ");
			
			
		}
		else if(idade > 15 && idade <= 17) {
			
			System.out.print(" Sua categoria �: Juvenil ");
		}
		
		else if(idade > 18 && idade <= 25) {
			
			System.out.print("Sua categoria �: Adulta ");
			
		}
		
		
		
	}

}
