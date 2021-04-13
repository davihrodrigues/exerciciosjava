package exerciciosjava;
import java.util.Scanner;
import java.text.DecimalFormat;

public class Cinco {
public static void main(String[] args) {
	
	
    Scanner input = new Scanner(System.in);
    System.out.println("Digite o valor do salario minimo no seu estado " );
    double smin = input.nextDouble();
    
    System.out.println("Digite o valor do seu salario " );
    double susu = input.nextDouble();
    
    DecimalFormat formatador = new DecimalFormat("0"); 
    if ((susu >= smin)) {
    	System.out.println("voce recebe: "+ formatador.format(susu/smin) + " s.m. " );
    	
    
    }  else {    	
    	System.out.println("você recebe menos que um salario minimo. " );
     }
        
}
}