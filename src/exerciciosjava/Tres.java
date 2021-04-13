package exerciciosjava;
import java.util.Scanner;
public class Tres {
	
		public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("Digite seu saldo bancario ");
		double data = input.nextDouble();
		
		System.out.println("Seu saldo bancario com um por cento é: " +data*1.01);
		}	
	}
	
