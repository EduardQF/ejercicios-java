package arreglos;
import java.util.Scanner;
public class metodoBurbuja {
    public static void main(String[] args) {
        int array[]=new int[20];
        for (int i = 0; i <array.length; i++) {
            array[i]=(int)(Math.random()*100+1);
            System.out.println("n "+(i+1)+" : "+array[i]);
        }
        for (int i =0; i < array.length; i++) {
            for (int j = 0; j <array.length-1; j++) {
                if(array[j]>array[j+1]){
                    int aux=array[j];
                    array[j]=array[j+1];
                    array[j+1]=aux;
                }
            }    
        }
        for (int i = 0; i <array.length; i++) {
            System.out.println(array[i]);
        }
    }
    
}
