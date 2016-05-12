
package edu;
import java.util.Scanner;
public class decimal_a_binario {
    public static void main(String[]args){
        int num=0,num1=0,resto=0;
        String numb="";
        Scanner intro=new Scanner(System.in);
        num1=intro.nextInt();
        num=num1;
        while(num>0){
            resto=num%2;
            num=num/2;
            numb=numb+resto;
        }
        System.out.println("el numero "+num1+" en binario es "+numb);
    }
}
