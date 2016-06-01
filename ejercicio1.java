package ejTarea;
import java.util.*;
public class ejercicio1 {

	public static void main(String[] args) {
		int i;
		String resp;
		float ptjes[]=new float[6];
		float matrizporc[][]=new float[10][7];
		System.out.println("el programa de simulacion:\ndebe ingresar el porcentaje de cada ambito pedido,el total del porcentaje debe ser igua a 100.\nsu puntaje debe estar entre 0 y 850 puntos.\n");
		Scanner leer=new Scanner(System.in);
		llenarmatrizporc(matrizporc,leer);
		do{
			leerptjs(ptjes);
			for (int j = 0; j < 4.; j++) {
				if(calcpond(ptjes,matrizporc,1)){
					System.out.println("pude postula a la carrera: "+(1+j));
				}
			}
			System.out.println("desea otra simulacion");
			resp=leer.next();
			System.out.println("si. nueva simulacion\nno.salir de la simulacion");
		}while(resp!="no");

	}
	private static boolean calcpond(float[] ptjes, float[][] matrizporc, int i) {
		boolean t=false; 
			float pondera=0;
			pondera=(ptjes[0]*matrizporc[i][0])+(ptjes[1]*matrizporc[i][1])+(ptjes[2]*matrizporc[i][2])+(ptjes[3]*matrizporc[i][3])+(ptjes[4]*matrizporc[i][4])+(ptjes[5]*matrizporc[i][5]);
			if(pondera>matrizporc[i][6]){t=true;}
			return t;
	}
	private static void leerptjs(float[] ptjes) {
		Scanner leer=new Scanner(System.in);
		for (int i = 0; i < ptjes.length; i++) {
			switch (i) {
			case 0:System.out.println("ingrese su puntaje nem");
				ptjes[i]=leer.nextInt();
				if(ptjes[i]>850){System.out.println("puntaje ingresado invalido");i--;}
				break;
			case 1:System.out.println("\ningrese su Puntaje Ranking");
				ptjes[i]=leer.nextInt();
				if(ptjes[i]>850){System.out.println("puntaje ingresado invalido");i--;}
				break;
			case 2:System.out.println("\ningrese su Puntaje Prueba Lenguaje y Comunicación");
				ptjes[i]=leer.nextInt();
				if(ptjes[i]>850){System.out.println("puntaje ingresado invalido");i--;}
				break;
			case 3:System.out.println("\ningrese su Puntaje Prueba Matemáticas");
				ptjes[i]=leer.nextInt();
				if(ptjes[i]>850){System.out.println("puntaje ingresado invalido");i--;}
				break;
			case 4:System.out.println("\ningrese su Puntaje Prueba Historia y Ciencias sociales");
				ptjes[i]=leer.nextInt();
				if(ptjes[i]>850){System.out.println("puntaje ingresado invalido");i--;}
				break;
			case 5:System.out.println("\ningrese su Puntaje Prueba Ciencias");
				ptjes[i]=leer.nextInt();
				if(ptjes[i]>850){System.out.println("puntaje ingresado invalido");i--;}
				break;

			}
		}
		
	}
	
	public static void llenarmatrizporc(float [][]matriz,Scanner leer) {

		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				switch (j) {
				case 0:System.out.println("\ningrese porcentaje nem carrera "+(i+1));
						matriz[i][j]=leer.nextInt();
						if(matriz[i][j]>100){System.out.println("porcentaje ingresado invalido");j--;}
					break;
				case 1:System.out.println("\ningrese porcentaje ranking carrera"+(i+1));
						matriz[i][j]=leer.nextInt();
						if(matriz[i][j]>=100 || matriz[i][j]<0){System.out.println("porcentaje ingresado invalido");j--;}
					break;
				case 2:System.out.println("\ningrese porcentaje Prueba Lenguaje y Comunicación carrera"+(i+1));
						matriz[i][j]=leer.nextInt();
						if(matriz[i][j]>=100 || matriz[i][j]<0){System.out.println("porcentaje ingresado invalido");j--;}
					break;
				case 3:System.out.println("\ningrese porcentaje Prueba Matemáticas carrera"+(i+1));
						matriz[i][j]=leer.nextInt();
						if(matriz[i][j]>=100 || matriz[i][j]<0){System.out.println("porcentaje ingresado invalido");j--;}
					break;
				case 4:System.out.println("\ningrese porcentaje Prueba Historia y Ciencias sociales carrera"+(i+1));
						matriz[i][j]=leer.nextInt();
						if(matriz[i][j]>=100 || matriz[i][j]<0){System.out.println("porcentaje ingresado invalido");j--;}
					break;
				case 5:System.out.println("\ningrese porcentaje Prueba Ciencias carrera"+(i+1));
						matriz[i][j]=leer.nextInt();
						if(matriz[i][j]>=100 || matriz[i][j]<0){System.out.println("porcentaje ingresado invalido");j--;}
					break;
				case 6:System.out.println("\ningrese puntaje Último Matriculado carrera"+(i+1));
						matriz[i][j]=leer.nextInt();
						if(matriz[i][j]>=850 || matriz[i][j]<0){System.out.println("puntaje ingresado invalido");j--;}
					break;
	
				}	
			}
			if(validaporc(matriz,i)){System.out.println("posentaje total de la carrera invalida ingrese de nuevo");i--;}
		}
	}
	private static boolean validaporc(float[][] matriz, int i) {
		float val=0;
		boolean y=false;
		for (int j = 0; j < matriz[i].length-1; j++) {
			val=val+matriz[i][j];
		}
		if(val!=100){y=true;}
		return y;
	}
}

		



