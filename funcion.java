package ejTarea;
import java.util.Scanner;
public class funcion {

	public funcion() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		int num1,num2,s;
		Scanner intro=new Scanner(System.in);
		System.out.print("ingrese numero 1 para sumar ");
		 num1=intro.nextInt();
		System.out.print("ingrese numero 2 para sumar ");
		num2=intro.nextInt();
		s=suma(num1,num2);
		System.out.println("el resultado de la suma es "+s);
	}
		public static int suma(int x,int y){
			int s=x+y;
			return s;
	}
}
