
package cap5;
    
import java.util.Scanner;

public class cincouno {

    public static void main(String[] args) {
     double px1,py1=0;
     double px2,py2=0; 
     double catetoA=0;
     double catetoB=0;
     double hipotenusa=0;
        try (Scanner intro= new Scanner(System.in)){
         System.out.println("ingrese cordenadas del punto 1");
         System.out.println("x:");
         px1=intro.nextInt();
         System.out.println("y:");
         py1=intro.nextInt();
         System.out.println("ingrese cordenadas del punto 2");
         System.out.println("x:");
         px2=intro.nextInt();
         System.out.println("y:");
         py2=intro.nextInt();
        }
     catetoA=px1-px2;
     catetoB=py1-py2;
     hipotenusa= Math.sqrt(Math.pow(catetoA,2)+Math.pow(catetoB,2));
     System.out.println("la distancia que separa los dos puntos es de: "+hipotenusa);
    }
       
}
