package Sesion3;
import java.util.Scanner;
public class Fibonacci {

	public static void main(String[] args) {
		System.out.println("Hasta que termino de la serie de Fibonacci quieres mostrar?");
		Scanner valorSerie = new Scanner(System.in);
		int finSerie = 10;
		int repeticiones = 0;
		int valor1 = 0;
		int valor2 = 0 ;
		int valorGuardado = 0;
		finSerie = valorSerie.nextInt();
		while(repeticiones != finSerie) {
			valorGuardado=valor1+valor2;
			 valor1=valorGuardado;
			 valor2++;
		     valorGuardado=valor1+valor2;		 
			 System.out.printf("%d ",valorGuardado);
			 repeticiones++;
		}
	}

}
