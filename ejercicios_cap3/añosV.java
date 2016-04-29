
package ejercicios_java;
import java.util.Scanner;

public class añosV {
    public static void main(String[] arg){
    Scanner intro=new Scanner(System.in);
    int año=0;
    int dia=0;
    int vis=0;
    System.out.println("ingrese su edad para calcular sus dias de vida");
    año =intro.nextInt();
    vis=año/4;
    dia=año*365+vis;
    System.out.println("su edad aproximado en dias es:"+dia);
    intro.close();
    }
}    
