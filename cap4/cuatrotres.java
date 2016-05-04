package cap4;
import java.util.Scanner;

public class cuatrotres {
    public static void main(String[]args){
        Scanner intro = new Scanner(System.in);
        double nota=0;
        System.out.println("ingrese la nota a clasificar");
        nota= intro.nextInt();
        if(nota<=3.9&&nota>1.0){
            System.out.println("lo nota ingresada es insuficiente");
        }else{
            if(nota<=4.9&&nota>=4.0){
                System.out.println("la nota es suficiente");
            }else{
                if(nota<=5.9&&nota>=5.0){
                    System.out.println("la nota es buena");
                }else{
                    System.out.println("la nota es muy buena");                       
                    
                }
            }
        }
    }
}
