package arreglos;
import java.util.Scanner;
public class lab5 {
    public static void main(String[]args){
        Scanner intro= new Scanner(System.in);
        double precioVenta[]=new double[10];
        int precioNeto[]=new int[10];
        for (int i = 0; i < precioNeto.length; i++) {
            System.out.println("ingrese precio producto "+(i+1));
            try {
              precioNeto[i]=intro.nextInt();  
            } catch (Exception e) {
                System.out.println("ese no es el precio de un producto");
            }
            precioVenta[i]=precioNeto[i]+(precioNeto[i]*0.19)+(precioNeto[i]*0.3);
        }
        System.out.println("producto ||recio neto ||precio Venta");
        for (int i = 0; i < precioNeto.length; i++) {
            
            System.out.println("    "+(i+1)+"    ||"+precioNeto[i]+"        ||"+precioVenta[i]);
        }
        
    }
}
