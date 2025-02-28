import java.util.Scanner;
public class Ej3Hoja8{
    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);
			int n,digito,i,peso,acumulador;
			
			peso=1;
			acumulador=0;
			
			
			for(i=1;i<=4;i++){
				System.out.println("Introduce un numero en binario: ");
				n=teclado.nextInt();
				
			while (n>0){
				digito=n%10;
				acumulador=acumulador+(digito*peso);
				peso=peso*2;
				n=n/10;
			}
			System.out.println("Numero binario en decimal: "+acumulador);
			}
	}
}