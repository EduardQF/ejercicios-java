EJERCICIO2.1

package ejTarea;
import java.util.Scanner;
public class ejercicio2 {
	public static void main(String[] args) {
		int n=10;
		int arreglo[]=new int[n];
		int va=n;
		String op=null;
		Scanner intro=new Scanner(System.in);
		//ingresa numero
		do{
			System.out.println("ingrese valores a tener el arreglo");
			funcion1(arreglo, va);
			System.out.println("ingrese numero a buscar");
			int valor2=intro.nextInt();
			//compara
			if(funcionc(arreglo, va, valor2)){
				System.out.println("el valor si se encuentra");	
			}else{
				System.out.println("el numero ingresado no se encuentra");
			}
			System.out.println("que desea hacer ahora:\nsi.buscar otro numero\nno.salir");
			op=intro.nextLine();
		}while(op=="no");	

	}

	private static boolean funcionc(int[] arreglo, int valor,int valor2) {
		int i=0;
		while(i<valor){
			if(arreglo[i]==valor2){
			return true; }
			i++;
		}
		return false;
	}

	private static void funcion1(int[] arreglo, int va) {
		int i=0;
		Scanner objeto=new Scanner(System.in);
		while(i<va){
			arreglo[i]=objeto.nextInt();
			i++;
		}
	}

}





EJERCICO2.2

package ejTarea;

import java.util.Scanner;

public class ejerciciodos2 {

	public static void main(String[] args) {
		int n=10;
		int arreglo[]=new int[n];
		int va=n;
		String op=null;
		Scanner intro=new Scanner(System.in);
		//ingresa numero
		do{
			System.out.println("ingrese valores a tener el arreglo");
			funcion1(arreglo, va);
			mostrar(arreglo,va);
				
			System.out.println("que desea hacer ahora:\nsi.buscar otro numero\nno.salir");
			op=intro.nextLine();
		}while(op=="no");

	}

	private static void mostrar(int[] arreglo, int valor) {
		int i=0;
		while(i<valor){
			System.out.println(arreglo[i]+"-");
			i++;
		}
		
	}
	private static void funcion1(int[] arreglo, int va) {
		int i=0;
		Scanner objeto=new Scanner(System.in);
		while(i<va){
			arreglo[i]=objeto.nextInt();
			i++;
		}
		
	}

}

EJERCICIO2.3

package ejTarea;

import java.util.Scanner;

public class ejerciciodos3 {

	public static void main(String[] args) {
		int n=10;
		int arreglo[]=new int[n];
		int array[]=new int[n];
		int valor=n;
		int valor2;
		String op=null;
		Scanner intro=new Scanner(System.in);
		//ingresa numero
			System.out.println("ingrese valores a tener el arreglo 1");
			funcion1(arreglo, valor);
			System.out.println("ingrese valores a tener en el arreglo 2");
			funcion2(array,valor);
			//compara.
			for (int i = 0; i < array.length; i++) {
				valor2=array[i];
				if(mostrar(arreglo,valor,valor2)){
					System.out.println("el numero "+valor2+" se encuentra en ambos arreglos");
				}

			}
	}

	private static boolean mostrar(int[] arreglo, int valor,int valor2) {
		int i=0;
		while(i<valor){
			if(arreglo[i]==valor2){
			return true; }
			i++;
		}
		return false;
			
	}

	private static void funcion2(int[] array, int va) {
		int i=0;
		Scanner objeto=new Scanner(System.in);
		while(i<va){
			array[i]=objeto.nextInt();
			i++;
		}
		
	}

	private static void funcion1(int[] arreglo, int va) {
		int i=0;
		Scanner objeto=new Scanner(System.in);
		while(i<va){
			arreglo[i]=objeto.nextInt();
			i++;
		}
		
	}
}
