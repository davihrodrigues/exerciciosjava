package exerciciosjava;

	public class Dois {
	public static void main(String[] args) {
}
	 //Fazer um programa que imprima a m�dia aritm�tica dos n�meros8,9 e 7.
	 //A m�dia dos n�meros 4, 5 e 6. A soma das duas m�dias. Am�dia das m�dias.

	double mediaa;
	double mediaa2;{
		mediaa = ((7+8+9)/3);
		mediaa2 = ((4+5+6)/3);
					
		System.out.println("A primeira m�dia aritm�tica �: " + mediaa );
		System.out.println("A segunda m�dia aritm�tica �: " + mediaa2 );
		System.out.println("A soma das m�dias �: " + (mediaa+mediaa2) );
		System.out.println("A media das medias � " + (mediaa + mediaa2)/2 );
	}
	}