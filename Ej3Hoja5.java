import java.util.Scanner;
public class Ej3Hoja5{
	public static void main(String[] args){
		Scanner teclado=new Scanner(System.in);
		int a,b;
		String salida;
		
			System.out.println("Introduce un valor para a:");
			a=teclado.nextInt();
			System.out.println("Introduce un valor para b:");
			b=teclado.nextInt();
			
		if (a==0 && b==0) {
				salida=("La ecuación tiene infinitas soluciones");
		}
		else {
			if (a==0) {
			salida=("La ecuación no tiene solucion");
			}
		else {
			salida=String.format("La ecuación tiene una solucion y es: %f\n",(float)-b/a);
		}
		System.out.println(salida);
	}
}
}