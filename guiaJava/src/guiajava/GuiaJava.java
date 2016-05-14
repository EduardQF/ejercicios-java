//EJERCICIO 1: Programa capaz de transformar una distancia ingresada en millas/hora a km/h.
package guiajava;
import java.util.Scanner;
public class GuiaJava {
    public static void main(String[] args) {
        Scanner intro=new Scanner(System.in);
        System.out.println("ingrese distancia en millas a transformar a transformar");
        int millas=intro.nextInt();
        double metros=millas*1852;
        double kil=metros/1000;
        System.out.println("la distancia "+millas+" millas, es"+kil+" km ");
        intro.close();
    }
    
}