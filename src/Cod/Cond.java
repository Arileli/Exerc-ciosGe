package Cod;


//Fa�a um programa que entre com tr�s n�meros e coloque em ordem crescente.



import java.util.Scanner;

public class Cond {
		public static void main(String[] args) {
			
			Scanner ler = new Scanner(System.in);
			 int n1,n2,n3;
			 
			 System.out.print("D�gite o primeiro n�mero: ");
			 n1 = ler.nextInt();
			 
			 System.out.print("D�gite o segundo n�mero: ");
			 n2 = ler.nextInt();
			 
			 System.out.print("D�gite o terciero n�mero: ");
			 n3 = ler.nextInt();
			 
			 
			 if(n1 < n2) {
				 if(n2 < n3) {
					 System.out.print(n1+"\n"+n2+"\n"+n3);
					 
					 
				 }
				 else if(n1 < n3){
					 System.out.print(n1+"\n"+n3+"\n"+n2);
					 
					 
				 } else {
					 
					 System.out.print(n3+"\n"+n1+"\n"+n2);
				 }
			 }
			 else if(n2 < n3) {
				 if(n1 < n3) {
					 System.out.print(n2+"\n"+n1+"\n"+n3);
				 } else {
					 System.out.print(n2+"\n"+n3+"\n"+n2);
				 } 
				 
			 
			 } else {
				 
				 System.out.print(n3+"\n"+n2+"\n"+n1);
			 }
			 
			 
			
			
			
			
		}
}
