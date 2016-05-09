
package arreglos;
import java.util.Scanner;
public class facil5 {
    public static void main(String[]args){
        String nombres[]=new String[5];
        String busqueda=null;
        int yes=0,posicion=0;
        nombres[0]="Eduardo Queupumil";
        nombres[1]="Jorge Madrid";
        nombres[2]="Rodrigo Romero";
        nombres[3]="Mauricio Diegez";
        nombres[4]="Mauricio Nuñes";
        Scanner intro=new Scanner(System.in);
        System.out.println("ingrese nombre a buscar");
        busqueda=intro.nextLine();
        for (int i = 0; i <nombres.length; i++) {
            if(busqueda.equals(nombres[i])){
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
