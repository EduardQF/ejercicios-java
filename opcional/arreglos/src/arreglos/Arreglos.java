
package arreglos;
import java.util.Scanner;    

public class Arreglos {

    public static void main(String[] args) {
        Scanner intro=new Scanner(System.in);
        String nombres[]=new String[5];
        String apellidos[]=new String[5];
        
        for (int i=0;i<5;i++) {
            System.out.println("ingrese nombre "+(i+1));
            nombres[i]=intro.nextLine();
            System.out.println("ingrese apellido"+(i+1));
            apellidos[i]=intro.nextLine();
        }
        for (int i = 0; i < 5; i++) {
            int num=(int) (Math.random()*5);
            System.out.println(nombres[i]+" "+apellidos[num]);
        }
    }
    
}
