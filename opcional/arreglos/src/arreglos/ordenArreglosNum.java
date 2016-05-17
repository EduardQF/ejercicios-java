
package arreglos;
import java.util.Scanner;
public class ordenArreglosNum {
    public static void main(String[]args){
        int array[]=new int[10];
        Scanner intro=new Scanner(System.in);
        try{
            for (int i=0;i<array.length; i++) {
                System.out.println("ingrese numeros al azar "+(i+1));
                array[i]=intro.nextInt();    
            }
            for (int i = 0; i <array.length; i++) {
                for (int j =i+1 ; j <array.length; j++) {
                    if(array[i]>array[j]){
                        int auxiliar=array[i];
                        array[i]=array[j];
                        array[j]=auxiliar;
                    }
                }
            }
            System.out.println("el arreglo ordenado de menor a mayor");
            for (int i = 0; i < 10; i++) {
                System.out.println(array[i]);
            }
        } catch (Exception e) {
            System.out.println("la tecla ingresada no es numerica");

        }
    }
}
