
package ejercicio;
import java.util.Scanner;
public class tresNueve {
    public static void main(String[]args){
        Scanner intro= new Scanner(System.in);
        double lunes=0;
        double martes=0;
        double miercoles=0;
        double jueves=0;
        double viernes=0;
        double sabado=0;
        double domingo=0;
        double promedio=0;
        System.out.println("ingrese tiempo (en segundos) demorado dia lunes");
        lunes=intro.nextInt();
        System.out.println("ingrese tiempo (en segundos) demorado dia martes");
        martes=intro.nextInt();
        System.out.println("ingrese tiempo (en segundos) demorado dia miercoles");
        miercoles=intro.nextInt();
        System.out.println("ingrese tiempo (en segundos) demorado dia jueves");
        jueves=intro.nextInt();
        System.out.println("ingrese tiempo (en segundos) demorado dia viernes");
        viernes=intro.nextInt();
        System.out.println("ingrese tiempo (en segundos) demorado dia sabado");
        sabado=intro.nextInt();
        System.out.println("ingrese tiempo (en segundos) demorado dia domingo");
        domingo=intro.nextInt();
        promedio=(lunes+martes+miercoles+jueves+sabado+domingo)/7;
        System.out.println("el promedio de tiempo corrido es:"+promedio);
    }
}
