package exerciciosjava;

import java.util.Scanner;

public class Seis {
	
	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
    System.out.println("Digite uma int ");
    int seui = input.nextInt();

    System.out.println("Seu antecessor � "+ (seui +1) + " seu sucessor � "+ (seui-1) );
    
    
}
}