package ejercicios_java;
import java.util.Scanner;

public class tresN_PS {
    public static void main(String[]arg){
        Scanner intro=new Scanner(System.in);
        double n1=0;
        double n2=0;
        double n3=0;
        double prom=0;
        double sum=0;
        double doble1=0;
        double triple2=0;
        double cuadrado3=0;
        System.out.println("ingrese primer numero");
        n1=intro.nextInt();
        System.out.println("ingrese segundo numero");
        n2=intro.nextInt();
        System.out.println("ingrese tercer numero");
        n3=intro.nextInt();
        prom=(n1+n2+n3)/3;
        sum=n1+n2+n3;
        doble1=2*n1;
        triple2=3*n2;
        cuadrado3=n3*n3;
        intro.close();
        System.out.println("el promedio de los tres numeros es: "+prom);
        System.out.println("la suma de los tres numeros es: "+sum);
        System.out.println("el doble del primer numero es: "+doble1);
        System.out.println("el triple del segundo numero es: "+triple2);
        System.out.println(" el cuadrado del tercer numero es: "+cuadrado3);
    }
}