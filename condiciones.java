
package ejercicios;
import java.util.Scanner;

public class condiciones {
    public static void main(String[] args){
    Scanner intro =new Scanner(System.in);
    int num=0;
    System.out.println("ingrese un numero natural para saber si es positivo o negativo");
    num=intro.nextInt();
    
    if(num==0){//abrimos la comparacion
        System.out.println("el numero es cero"); 
    }else {//elcaso en falso
        if(num>0){//abrimos el segundo caso verdadero
            System.out.println("el numero es positivo");
    }else{//el segundo caso encontra
           System.out.println("el numero es menor a cero");
        }//serramos la segunda comparacion
    }//cerramos la primera comparacion
    intro.close();
    }
}
        
