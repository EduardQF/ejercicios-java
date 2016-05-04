
package cap5;
import java.util.Scanner;

public class cincocuatro {
    public static void main(String[]args){
        int Cnota=0,Capro=0,nota=0,Crepro=0,cont=1;
        double min=70,promedio=0,prom=0,max=0;
        try(Scanner intro=new Scanner(System.in)){
            System.out.println("ingrese cantidad de notas");
            Cnota=intro.nextInt();
            do{
                System.out.println("ingrese nota "+cont);
                nota= intro.nextInt();
                //promedio
                promedio=promedio+nota;
                //nota aprobadas y reprobadas
                if(nota<4.0){
                    Crepro=Crepro+1;
                }else{
                    Capro=Capro+1;
                }
                //max y min
                if(max<nota)
                    max=nota;
                if(min>nota)
                    min=nota;
                                
              cont++;  
            }while(cont<=Cnota);
        }
        prom=promedio/Cnota;
        if(Capro>Crepro&&prom>40){
            System.out.println("el alumno a aprobado");
        }else{
            System.out.println("el alumno a reprovado");
        }
        System.out.println("el promedio es: "+prom/10);
        System.out.println("la mejor nota fue: "+max/10);
        System.out.println("la peor nota fue: "+min/10);
        System.out.println("la cantidad de notas aprobadas fueron: "+Capro);
        System.out.println("la cantidad de notas reprobadas fueron: "+Crepro);
    }
}
