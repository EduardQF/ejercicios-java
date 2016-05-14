/*
EJERCICIO 3: Transformar los segundos leidos a 
horas : minutos : segundos y mostrar en pantalla.
 */
package guiajava;
import java.util.Scanner;
public class medio3 {
    public static void main(String[] args) {
        Scanner intro=new Scanner(System.in);
        System.out.println("ingrese cantidad de segundos");
        int segundos=intro.nextInt();
        int hh=segundos/3600;
        int mm=(segundos-(hh*3600))/60;
        int ss=segundos-((segundos-3600*hh)+(segundos-mm*60));
        System.out.println(hh+":"+mm+":"+ss);
    }
}
