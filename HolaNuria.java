import java.util.Scanner;
public class HolaNuria {

	public static void main( String args[]){
		int num1=3;
		int num2=7;
		int num3;
		Scanner mensaje = new Scanner(System.in);
		
		//Mostrar mensaje

		System.out.println("Introducce el primer valor");
		// leer lo que me introduce por teclado ponerlo en la variable num1
		num1=mensaje.nextInt();
		
		// leer lo que me introduce por teclado ponerlo en la variable num2
		System.out.println("Introducce el segundo valor");
		num2=mensaje.nextInt();

		num3= num1+num2;

		System.out.println(" El resultado es: " +num3);
}
	}