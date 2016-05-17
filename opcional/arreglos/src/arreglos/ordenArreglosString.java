
package arreglos;
import java.util.Scanner;
public class ordenArreglosString {
    public static void main(String[] args) {
        Scanner intro=new Scanner(System.in);
        String array[]=new String[10];
        for (int i=0; i < array.length; i++) {
            System.out.println("ingrese palabras a guardar "+(i+1));
            array[i]=intro.nextLine();
        }
        for (int i = 0; i <array.length; i++) {
            for (int j = i+1; j < array.length; j++) {
                if(array[i].compareTo(array[j])>0){
                    String aux=array[i];
                    array[i]=array[j];
                    array[j]=aux;
                }
            }
        }
        System.out.println("el orden de las palabras es:");
        for (int i = 0; i < 10; i++) {
            System.out.println(array[i]+"\n");
        }
    }
    
}
