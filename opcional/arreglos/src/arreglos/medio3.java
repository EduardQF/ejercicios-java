
package arreglos;
import java.util.Scanner;
public class medio3 {
    public static void main(String[] args) {
        Scanner intro=new Scanner(System.in);
        int sorteo[]=new int[5];
        int contnum=0,num=0;
        for (int i = 0; i <sorteo.length; i++) {
            sorteo[i]=(int)(Math.random()*10+1);
        }
        do{
            System.out.println("ingrese numero entre el 1 y el 10");
            num=intro.nextInt();
            for (int i = 0; i <sorteo.length; i++) {
                if(num==sorteo[i])
                    System.out.println("a asertado");
            }
            contnum=contnum+1;
        }while(contnum<3);
        
    }
}
