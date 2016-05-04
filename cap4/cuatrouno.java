
package cap4;
import static java.sql.DriverManager.println;
    import java.util.Scanner;
public class cuatrouno {

    public static void main(String[] args) {
        Scanner intro=new Scanner(System.in);
        int cont=1;
        int max=0;
        int num=0;
        while(cont<=4){
            System.out.println("ingrese numero "+cont);
            num=intro.nextInt();
            if(num>max){
                max=num;
            }      
            cont++;    
        }
        intro.close();
        System.out.println("el numero mayor es: "+max);      
    }
    
}
