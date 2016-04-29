package ejercicios_java;

import java.util.Scanner;

public class suma_mult {
    public static void main (String[] arg){
    Scanner intro=new Scanner(System.in);
    double n1=0;
    double n2=0;
    double suma=0;
    double mult=0;
    System.out.println("ingrese primer numero");
    n1= intro.nextInt();
    System.out.println("ingrese segundo numero");
    n2= intro.nextInt();
    suma=n1+n2;
    mult=n1*n2;
    intro.close();
    System.out.println("la suma de los dos numeros es:"+suma);
    System.out.println("la multiplicacion de los dos numeros es"+mult);
    }
}
