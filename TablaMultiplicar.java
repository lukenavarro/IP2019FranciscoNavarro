package Sesion3;
import java.util.Scanner;
public class TablaMultiplicar {

	public static void main(String[] args) {
	   Scanner valorIntroducido = new Scanner(System.in);
	   System.out.println("Introduzca un numero del 1 al 10:");
	   int valorTabla = 0;
	   int valorNumero = 0;
	   int valorResultado = 0;
	   valorTabla = valorIntroducido.nextInt();
	   do {
	   if ((valorTabla >10)|| (valorTabla < 0)) {
		   System.out.println("Su valor no es correcto por favor introduzca otro valor entre 1 y 10");
		   valorTabla = valorIntroducido.nextInt();
	       }
	   
		   }while((valorTabla <0) || (valorTabla > 10));
	   System.out.printf("Tabla de multiplicar del %d", valorTabla);
	   System.out.println();
		    do {
		   valorResultado = valorTabla * valorNumero;
		   System.out.printf(" %d x %d = %d",valorTabla , valorNumero , valorResultado);
		   System.out.println();
		   valorNumero++;
		   
	        }while(valorNumero <= 10);
	   

	}

}
