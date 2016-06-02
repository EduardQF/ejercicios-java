package ejTarea;
import java.util.Scanner;
public class EJERCICIO3 {

	public static void main(String[] args) {
		int consumo[][]=new int [12][32];
		leer(consumo);
		consumoM(consumo);
		consumoAP(consumo);
		
		
	}

	private static void consumoAP(int[][] consumo) {
		int cons=0;
		int i=0;
		for (int j = 0; j < consumo[i].length; j++) {
			
			for ( i = 0; i < consumo.length; i++) {
				cons=cons+consumo[i][j];
			}
		if(div(j)){
			System.out.println("el consumo del piso "+(j+1)+" es de: "+cons+" m3");
			cons=0;}
		}
		
		
	}

	private static boolean div(int i) {
		int dive=(i+1)%4;
		if(dive==0){
			return true;
		}else{
		return false;
		}
	}

	private static void consumoM(int[][] consumo) {
		int cons=0;
		for (int i = 0; i < consumo.length; i++) {
			for (int j = 0; j < consumo.length; j++) {
				cons=cons+consumo[i][j];
			}
		}
		System.out.print("el conumo anual de el edificio fue: "+cons+" m3");
		
	}

	public static void leer(int[][] consumo) {
		Scanner intro=new Scanner(System.in);
		for(int i=0;i<consumo.length;i++){
			switch (i) {
			case 0:System.out.println("Enero\n");break;
			case 1:System.out.println("Febrero\n");break;
			case 2:System.out.println("Marzo\n");break;
			case 3:System.out.println("Abril\n");break;
			case 4:System.out.println("Mayo\n");break;
			case 5:System.out.println("Junio\n");break;
			case 6:System.out.println("Julio\n");break;
			case 7:System.out.println("Agosto\n");break;
			case 8:System.out.println("Septiembre\n");break;
			case 9:System.out.println("Octubre\n");break;
			case 10:System.out.println("Noviembre\n");break;
			case 11:System.out.println("Diciembre\n");break;
			}
			for (int j = 0; j < consumo[i].length; j++) {
				System.out.println("ingrese consumo del departamento "+(i+1));
				consumo[i][j]=intro.nextInt();				
			}

		}
	}

}
