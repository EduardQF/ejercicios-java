
package ejercicios;

import java.util.Scanner;

public class holausuario {
    public static void main(String[]args){
       
        Scanner intro = new Scanner(System.in); //iniciamos el scanner
        String usuario =""; //inicializamos variable
        System.out.println("ingrese su nombre"); //mostramos al usuario que ingrese su nombre
        usuario = intro.nextLine(); //inicialisamos usuario con teclado
        System.out.println("hola "+usuario);
        intro.close();//serramos el scanner
    }
}