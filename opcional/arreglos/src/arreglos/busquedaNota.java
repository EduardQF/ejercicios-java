package arreglos;
import java.util.Scanner;
public class busquedaNota {
    public static void main(String[] args) {
        Scanner intro=new Scanner(System.in);
        int notas=0;
        int alumn=0;
        int nota=0;
        int pnota=0;
        int prom=0;
        int max=0;
        int alumm=0;
        System.out.println("ingrese cantidad de alumnos");
        do{
            alumn=intro.nextInt();
        }while(alumn<0);
        System.out.println("ingrese cantidad de notas ");
        do{
        notas =intro.nextInt();    
        }while(notas<0);
        
        int alum[][]=new int[alumn][notas+1];
        for (int i = 0; i <alum.length; i++) {
            for (int j = 0; j <notas; j++) {
                System.out.print("ingrese nota "+(j+1)+" del alumno "+(i+1)+"\nnota");
                do{
                    nota=intro.nextInt();
                }while(nota<0||nota>70);
                pnota=nota+pnota;
                alum[i][j]=nota;
            }
            prom=pnota/(notas);
            alum[i][notas]=prom;
            if(prom>max){
                max=prom;
                alumm=i;
            }
            pnota=0;
        }
        for (int i = 0; i <alum.length; i++) {

        }
        System.out.println("\n\nel alumno con la mejor nota es el alumno: "+(alumm+1));
        for (int i = 0; i < alum.length; i++) {
            System.out.println("\n------------\nalumno: "+(i+1));
            for (int j = 0; j < notas; j++) {
                System.out.print(" nota: "+(i+1)+" : "+alum[i][j]);
            }
            System.out.print("\npromedio: "+alum[i][notas] );
        }
        intro.close();
    }
}
