package ejTarea;
import java.util.Scanner;
public class menu {

	public static void main(String[] args) {
		int opcion;
		Scanner intro=new Scanner(System.in);
		menu();
		System.out.println("ingrese opcion del menu");
		opcion=intro.nextInt();
		System.out.println("la opcion seleccionada es "+ opcion);
	}
	
	public static void menu(){
		System.out.println("menu");
		System.out.println("1.suma");
		System.out.println("2.resta");
		System.out.println("3.multiplicar");
		System.out.println("4.divide");
		System.out.println("5.salir");
		
	}
}
