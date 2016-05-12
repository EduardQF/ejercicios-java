
package javaejercicio1;
import java.util.Scanner;
public class reservaPc {
    public static void main(String[]args){
        int recerva[] =new int[24];
        int op=0,pc=0,contr=0,contl=0;
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
                    System.out.println("ingrese el pc a reservar");
                    do{
                       pc= intro.nextInt();
                       if(pc<0||pc>24)
                            System.out.println("pc ingresado no existe");
                    }while(pc<0||pc>24);
                   
                    if(recerva[pc-1]==1){
                        System.out.println("el pc ingresado ya esta ocupado");
                    }else{
                     recerva[pc-1]=1;
                    }
                    break;
                case 2:
                    System.out.println("ingrese el pc a liberar");
                    do{
                       pc= intro.nextInt();  
                       if(pc<0||pc>24)
                       System.out.println("pc ingresado no existe"); 
                    }while(pc<0||pc>24);
                    if(recerva[pc-1]==0){
                        System.out.println("el pc ingresado ya esta liberado");
                    }else{
                     recerva[pc-1]=0;
                    }
                    break;
             }
            System.out.println("codigo\n\n1.recervados\n0.liberados");
            for (int i = 0; i <recerva.length; i++) {
              System.out.print(("|  "+recerva[i])+" |");  
              contr=contr+recerva[i];
              if(i==5||i==11||i==17||i==24)
                    System.out.println("");
            }
            System.out.println("\n");
            contl=24-contr;
            System.out.println("computadores ocupados: "+contr+"\ncomputadores libres: "+contl+"\n");
             contr=0;
        }while(op!=3);
    }
}
