
package ejercicio;
import java.util.Scanner;
public class tresCiete {
    public static void main(String[]args){
        Scanner intro= new Scanner(System.in);
        int edad=0;
        int nPulsacion=0;
        System.out.println("ingrese su edad");
        edad= intro.nextInt();
        nPulsacion= (220-edad)/10;
        System.out.println("su cantid de pulsacion es de: "+nPulsacion);
    }
}
