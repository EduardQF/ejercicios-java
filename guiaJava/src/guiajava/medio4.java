/*
EJERCICIO 4: Para preparar 4 pizzas se coloca 1000 gr de harina en un bol, 
se agregan 200ml de agua tibia con levadura, se amasa y se deja leudar.
Luego se agrega agua hasta que la cantidad de ml de agua sea igual a 50 % de los 
gramos de harina, ¿qué cantidad de agua se debe agregar en la segunda oportunidad?.
Debe diseñar un algoritmo que responda a esta interrogante,
siendo el usuario quien ingrese la cantidad de pizzas.
 */
package guiajava;
import java.util.Scanner;
public class medio4 {
    public static void main(String[] args) {
        Scanner intro=new Scanner(System.in);
        System.out.println("ingrese cantidad de pizzas a preparar");
        int cantP=intro.nextInt();
        double harina=250*cantP;
        double agua=200*cantP;
        System.out.println("la cantidad de  a ocupar de\nharina:"+harina+"\nagua: "+agua);
        intro.close();
    }
    
}
