/*
EJERCICIO 1: Tres personas deciden invertir su dinero para fundar una empresa.
Cada una de ellas invierte una cantidad distinta. Obtener el porcentaje que cada 
quien invierte con respecto a la cantidad total invertida.
 */
package guiajava;
import java.util.Scanner;
public class medio1 {
    public static void main(String[] args) {
        Scanner intro=new Scanner(System.in);
        double array[]=new double[3];
        double porsent[]=new double [3];
        double total=0;
        for (int i = 0; i <array.length; i++) {
            System.out.println("ingrese dinero aportado por el amigo "+(i+1));
            array[i]=intro.nextInt();
            total=total+array[i];
        }
        for (int i = 0; i <array.length; i++) {
            porsent[i]=(array[i]*100)/total;
            System.out.println("el porsentaje de dinero aportado por el amigo "+(i+1)+" es "+porsent[i]+"%");
        }
        intro.close();
    }
}
