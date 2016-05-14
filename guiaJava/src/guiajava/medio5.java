/*
EJERCICIO 5: Se le pide diseñar un algoritmo (en seudo-código y diagrama de flujo)
para calcular el área del rectángulo, de ancho a y alto b, menos el área del círculo 
de radio b que hay en su interior, siendo a y b números enteros ingresados por teclado.
Para ello será necesario que describa el problema; defina las entradas, salidas y diseñe 
el proceso del algoritmo.
 */
package guiajava;
import java.util.Scanner;
public class medio5 {
    public static void main(String[] args) {
        Scanner intro=new Scanner(System.in);
        System.out.println("ingrese medidadas del rectangulo");
        System.out.print("ancho:");
        double ancho=intro.nextInt();
        System.out.print("alto:");
        double alto=intro.nextInt();
        intro.close();
        double areaRect=alto*ancho;
        double areaCirc=(3.14*alto*alto)/2;
        double areaAchur=areaRect-areaCirc;
        System.out.println("el area achurada del rectangulo es: "+areaAchur);
    }
}
