/*
EJERCICIO 6: Calcule la altura de la que es lanzado un objeto con la fórmula
de caída libre dados t segundos, los cuales son ingresados por teclado.
Fórmula: h = (g*t^2)/2
 */
package guiajava;
import java.util.Scanner;
public class ejercicio6 {
    public static void main(String[] args) {
        Scanner intro=new Scanner(System.in);
        System.out.println("ingrese segundos demorados en caer");
        double tiempo=intro.nextInt();
        double g=9.8;
        double tiemp=Math.pow(tiempo,2);
        double altura=(g*tiemp)/2;
        System.out.println("la altura a la que fue lansada el objeto fue: "+altura);
        intro.close();
    }
}
