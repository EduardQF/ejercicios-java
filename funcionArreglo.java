package ejTarea;
import java.util.Scanner;
public class funcionArreglo {
	final static int N=8;
	public static void main(String[] args) {
		int [] numeros=new int[N];
		ingresar(numeros);
		mostrar(numeros);

	}
	public static void ingresar(int[]array) {
		int i;
		Scanner intro=new Scanner(System.in);
		for ( i = 0; i < N; i++) {
			System.out.println("ingrese un numero para la celda "+i);
			array[i]=intro.nextInt();
		}
	}
	public static void mostrar(int[]array) {
		System.out.println("numeros en el arreglo");
		for (int i = 0; i < N; i++) {
			System.out.println("array["+i+"] ="+array[i]);
		}
	}
}
