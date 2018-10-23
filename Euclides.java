package Sesion3;
import java.util.Scanner;
public class Euclides {

	public static void main(String[] args) {
		Scanner valores = new Scanner(System.in);
		int valor1 = 0;
		int valor2 = 0;
		int r1 = 0;
		do {
			System.out.println("Introduzca el primer valor positivo entero");
			valor1 = valores.nextInt();
			if (valor1 < 0) {
				System.out.println("Este valor no es correcto");
			}
		}while(valor1 < 0);
		       do {
		    	   System.out.println("Introduzca el segundo valor positivo entero");
					valor2 = valores.nextInt();
		       }while(valor2 <0);
		        int a = Math.max(valor1 , valor2);
				int b = Math.min(valor1, valor2);
				while (a % b !=0) {
					r1=a;
					a=b;
					b=r1%a;
				}
	         System.out.printf("El maxmimo comun divisor de los valores es : %d",b);
	}
}

