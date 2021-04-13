	package exerciciosjava;
	import java.util.Scanner;
	public class Um {
		public static void main(String[] args) {

			  // Objeto scanner
			    Scanner input = new Scanner(System.in);
			    System.out.println("Digite sua idade: ");
			    int data1 = input.nextInt();
			    
 			    System.out.println("digite seu mes de nascimento ");
			    int data2 = input.nextInt();
			    
			    System.out.println("Digite seu dia de nascimento ");
			    int data3 = input.nextInt();
			    
			    System.out.println("Sua idade em dias é: " + ((data1*360) + (data2*30) + (data3)));
			    
			    input.close();
		  }
		}
