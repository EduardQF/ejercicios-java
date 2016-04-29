
package ejercicio;

import java.util.Scanner;

public class sueldo {
    
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner intro= new Scanner(System.in);
        double base=0;
        double hex=0;
        double Vhex=0;
        double desc=0;
        double total =0;
        System.out.println("ingrese su sueldo base");
        base = intro.nextInt();
        System.out.println("ingrese horas extras trabajadas");
        hex = intro.nextInt();
        intro.close();
        Vhex= hex*3600;
        desc= (base*20)/100;
        total=base-desc+Vhex;
        System.out.println("el descuento de su  sueldo fue de: $"+desc);
        System.out.println("el sueldo por sus horas extras es: $"+Vhex);
        System.out.println("su sueldo final es de: $"+total);
    }
    
}
