
package cap5;
import java.util.Scanner;

public class cincotres {
    public static void main(String[]args){
        int multiplos,num,fin,m2,m3,m5,m7=0;
        int i;
        long factorial=1;      
       try (Scanner intro=new Scanner(System.in)){
           System.out.println("ingrese un numero");
           num= intro.nextInt();
       }
       //factorial
       if(num>60){
           System.out.println("el numero ingresado es muy grande para sacar el factorial");
       }else{
       for( i=1;i<num;i++){
           factorial=factorial*i; 
       }
       System.out.println("el factorial del numero es: "+factorial);
       }
       //primo
       m2=num%2;
       m3=num%3;
       m5=num%5;
       m7=num%7;
       if(num==3||num==5||num==7){
           System.out.println("el numero es primo");
       }else{
           if(m2==0||m3==0||m5==0||m7==0){
               System.out.println("el numero no es primo");
           }else{
               System.out.println("el numero es primo");
           }
       }
       //multiplos
       System.out.print("los multiplos de "+num+" son: ");
       for(i=1;i<11;i++){
           multiplos=num*i;
           System.out.print(" "+multiplos);
       }
    }
}
