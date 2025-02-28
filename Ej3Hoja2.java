import java.io.*;
public class Ej3Hoja2{
	public static void main (String[] args) throws IOException{
			InputStreamReader flujo=new InputStreamReader(System.in);
			BufferedReader teclado=new BufferedReader(flujo);
			String cadena;
			int num1;
			int num2;
			System.out.print("Introduce un número entero: ");
			cadena=teclado.readLine();
			num1=Integer.parseInt(cadena);
			System.out.print("Introduce otro número entero: ");
			cadena=teclado.readLine();
			num2=Integer.parseInt(cadena);
			System.out.println("El cociente de la división entre los dos números enteros es: "+num1/num2);
			System.out.print("El resto de la división entre los dos números enteros es: "+num1%num2);
	}
}