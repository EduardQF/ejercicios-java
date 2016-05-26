package ejTarea;
import java.util.Scanner;
public class calculadora {

	public static void main(String[] args) {
		menu();

	}
	public static void funcSuma(int a,int b) {
		int suma;
		suma=a+b;
		mostrar(suma);
		//retorna
	}
	public static void funcResta(int a, int b) {
		int resta;
		resta=a-b;
		mostrar(resta);
	}
	public static void funcDiv(float a, float b) {
		float div;
		div=a/b;
		mostrar(div);
	}
	public static void funcMult(int a, int b) {
		int mult;
		mult=a*b;
		mostrar(mult);
	}
	public static void mostrar(float res) {
		System.out.println("el rsultado es "+res);
	}
	public static void menu() {
		Scanner intro=new Scanner(System.in);
		int opc=0;
		do{
			System.out.println("1.sumar");
			System.out.println("2.restar");
			System.out.println("3.multiplicar");
			System.out.println("4.dvidir");
			System.out.println("5.salir");
			opc=Integer.parseInt(intro.nextLine());//parsear el numero desde string
			switch (opc) {
			case 1: funcSuma(leer(),leer());break;
			case 2: funcResta(leer(),leer());break;
			case 3: funcMult(leer(),leer());break;
			case 4: funcDiv(leer(),leer());break;
			case 5:System.out.println("adios");break;
			default:break;
			}
		}while(opc!=5);
	}
	public static int leer() {
		int num;
		Scanner intro=new Scanner(System.in);
		System.out.println("ingrese numeros: ");
		num=intro.nextInt();
		return num;
	}
}
