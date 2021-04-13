package exerciciosjava;
import java.util.Scanner;
	public class Quatro {
	public static void main(String[] args) {
	// Objeto scanner
    Scanner input = new Scanner(System.in);
    System.out.println("Digite o valor do ipi ");
    double data1 = input.nextDouble();
 	  	    
    
    System.out.println("digite o codigo da peça 1 ");
    int cod1 = input.nextInt();
    
   
    System.out.println("digite o valor da peça 1 ");
    int val1 = input.nextInt();
    
    
    System.out.println("quantidade de peças 1 ");
    int qtde1 = input.nextInt();
    
    System.out.println("digite o codigo da peça 2 ");
    int cod2 = input.nextInt();
    
   
    System.out.println("digite o valor da peça 2 ");
    int val2 = input.nextInt();
    
    
    System.out.println("quantidade de peças 2 ");
    int qtde2 = input.nextInt();
    
    
      	
    System.out.println("A soma total é R$ " + (val1*qtde1 + val2*qtde2)*(data1/100+1));	
	
}
	}
