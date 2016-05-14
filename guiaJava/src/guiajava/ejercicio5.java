/*
EJERCICIO 5: Dada las horas trabajadas de una persona y el valor por hora,
calcular su salario e imprimirlo
 */
package guiajava;
import java.util.Scanner;
public class ejercicio5 {
    public static void main(String[] args) {
        Scanner intro=new Scanner(System.in); 
        System.out.println("ingrese horas trabajadas");
        int horas=intro.nextInt();
        System.out.println("ingrese valor de la hora");
        int valor=intro.nextInt();
        int valorT=horas*valor;
        System.out.println("su salario es: $"+valorT);
        
    }
}
