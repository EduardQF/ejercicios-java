
package ejercicio;
import java.util.Scanner;
public class tresocho {
    public static void main(String[] args){
        Scanner intro= new Scanner(System.in);
        int salario=0;
        int newsalario=0;
        System.out.println("ingrese salario del trabajador");
        salario= intro.nextInt();
        newsalario=salario+(salario/10);
        intro.close();
        System.out.println("el nuevo salario es: $"+newsalario );
    }
}
