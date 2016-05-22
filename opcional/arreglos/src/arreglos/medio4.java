/*
Ejercicio 2: Cree un vector con los sueldos finales de 5 empleados,
teniendo en cuenta el pago por horas extras. 
El sueldo base es de $220000 y, sobre 40 horas de trabajo, el sueldo aumenta en
$50000. Permitir ver que posiciones tienen un sueldo alto y cuales un sueldo bajo.
Las horas trabajadas por cada empleado son ingresadas por teclado.
 */
package arreglos;
import java.util.Scanner;
public class medio4 {
    public static void main(String[] args) {
        Scanner intro=new Scanner(System.in);
        int empleados[][]=new int[5][5];
        int j=0,Sb=220000;
        int hhex=0,vhhex=0;
        for (int i = 0; i <empleados.length; i++) {
            System.out.println("ingrese horas trabajadas del empleado "+(i+1));
            do{
            hhex=intro.nextInt();    
            }while(hhex<0);           
            empleados[i][j+1]=hhex;
            if(hhex>40){
                vhhex=50000;
            }else{
                vhhex=0;
            }
            empleados[i][j]=Sb+vhhex;
            
        }
        for (int i = 0; i <empleados.length; i++) {
            System.out.println("el empleado "+(i+1)+" tiene un sueldo total de "+empleados[i][j]+" y una cantida de "+empleados[i][j+1]+" horas trabajadas");
        }
        intro.close();
    }
    
}
