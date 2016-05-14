/*
EJERCICIO 2: Dados dos puntos (x0,y0) y (x1,y1) obtener ecuacion de la recta de
forma general, es decir, ax+by+c=0.
 */
package guiajava;
import java.util.Scanner;
public class medio2 {
    public static void main(String[] args) {
        Scanner intro=new Scanner(System.in);
        System.out.println("ingrese cordenadas del punto 1");
        System.out.print("x:");
        int x1=intro.nextInt();
        System.out.print("y:");
        int y1=intro.nextInt();
        System.out.println("ingrese cordenadas del punto 2");
        System.out.print("x:");
        int x2=intro.nextInt();
        System.out.print("y:");
        int y2=intro.nextInt();
        double x=x2-x1;
        double y=y2-y1;
        double dist=Math.sqrt(Math.pow(x,2)+Math.pow(y,2));
        System.out.println("la distancia entre los dos puntos es de:"+dist);
    }
}
