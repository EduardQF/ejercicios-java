
package arreglos;

import java.util.Scanner;

public class facil4 {
    public static void main(String[]args){
        Scanner intro=new Scanner(System.in);
        int datos[]=new int[10];
        int buscar=0,yes=0,posicion=0;
        for (int i=0;i <datos.length;i++) {
            System.out.println("ingrese datos a guardar");
            datos[i]=intro.nextInt();
        }
        System.out.println("ingres dato a busacar");
        buscar=intro.nextInt();
        for (int i = 0; i <datos.length; i++) {
            if(buscar==datos[i]){
                yes=yes+1;
                posicion=i+1;
            }else{
                yes=yes+0;
            }
        }
        if(yes!=0) {
            System.out.println("el dato se encuantra en la pocicion "+posicion);
        }else{
            System.out.println("el dato no se encuantra en los registros");
        }
    }
}
