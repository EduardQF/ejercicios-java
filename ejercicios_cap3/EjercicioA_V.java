
package ejercicios_java;
import java.util.Scanner;

public class EjercicioA_V {

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner intro=new Scanner(System.in);
        double alt=0;
        double rad=0;
        double area=0;
        double volumen=0;
        double pi=3.14;
        System.out.println("ingrese altura del cilindro");
        alt= intro.nextInt();
        System.out.println("ingrese radio de la base del cilindro");
        rad= intro.nextInt();
        area= (2*pi*rad*alt)+(2*pi*(rad*rad));
        volumen=(pi*(rad*rad)*alt);
        intro.close();
        System.out.println("el area del cilindro es: "+area+"cm2");
        System.out.print("el volumen del cilindro es: "+volumen+"cm3");
        
    }
    
    
}
