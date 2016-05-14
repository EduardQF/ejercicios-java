/*
EJERCICIO 4: Una gasolinera despacha gasolina y la bomba surtidora registra la compra en galones.
El precio de la gasolina está fijado en 8.20 el litro. Construya un algoritmo que calcule y escriba cuanto se gasta en gasolina,
siendo que la cantidad de gasolina se ingresa en galones.
1 Galón = 3.785 lts.
 */
package guiajava;
import java.util.Scanner;
public class ejercicio4 {
    public static void main(String[] args) {
        Scanner intro=new Scanner(System.in);
        System.out.println("ingrese cantidad de galones de gasolina");
        double galones=intro.nextInt();
        double valor_galon=galones*3.785;
        double litro=8.20;
        double valorGasolina=valor_galon*litro;
        System.out.println("la cantidad gastada en gasolina: $"+valorGasolina);
        System.out.println("cantidad de litros "+valor_galon);
        System.out.println("valor del litro "+litro);
    }
}
