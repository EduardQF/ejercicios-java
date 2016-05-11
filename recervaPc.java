
package javaejercicio1;
import java.util.Scanner;
public class recervaPc {
    public static void main(String[]args){
        int recerva[] =new int[24];
        int op=0,pc=0;
        Scanner intro=new Scanner(System.in);
        
        do{
            System.out.println("1.reservar pc\n2.liberar pc\n3.Salir\ningrese opcion:");
            do{
                op=intro.nextInt();
                if(op<1||op>3)
                    System.out.println("opcion ingresada no valida");
            }while(op<1||op>3);

            switch(op){
                case 1:
                    System.out.println("ingrese el pc a reserbar");
                    pc= intro.nextInt();
                    if(recerva[pc]==1){
                        System.out.println("el pc ingresado ya esta ocupado");
                    }else{
                     recerva[pc]=1;
                    }
                    break;
                case 2:
                    System.out.println("ingrese el pc a liberar");
                    pc= intro.nextInt();
                    if(recerva[pc]==0){
                        System.out.println("el pc ingresado ya esta liberado");
                    }else{
                     recerva[pc]=0;
                    }
                    break;
             }
            System.out.println("\n");
        }while(op!=3);
    }
}
