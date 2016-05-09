
package arreglos;
import java.util.Scanner;
public class facil3 {
    public static void main(String[]args){
        double array []=new double[5];
        int max=0;
        Scanner intro= new Scanner(System.in);
        for (int i = 0; i < array.length; i++) {
            System.out.println("ingrese numero "+(i+1));
            array[i]=intro.nextInt();
        }
        for (int i = 0; i < array.length; i++) {
            if(array[i]>max){
                max= (int) array[i];
            }
        }
        System.out.println("el numero mayor es "+max);
    }
}
