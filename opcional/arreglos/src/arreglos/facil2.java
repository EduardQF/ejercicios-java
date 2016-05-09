
package arreglos;
import java.util.Scanner;
public class facil2 {
    public static void main(String[]args){
        Scanner intro=new Scanner(System.in);
    int numer[]=new int[5];
    int num=0,max=0,min=10;
        for (int i = 0; i <numer.length; i++) {
            numer[i]=(int) (Math.random()*5+1);
            if(numer[i]>max)
                max=numer[i];
            if(numer[i]<min)
                min=numer[i];
        }
       do{
        System.out.println("ingrese pocicion en la que cree esta el numero menor");
        num=intro.nextInt();
        intro.close();
        if(num<0||num>5)
               System.out.println("posicion ingresada invalida");
       }while(num<0||num>5);
        
        if(numer[num-1]==max){
            System.out.println("has perdido");
        }
        if(numer[num-1]==min){
            System.out.println("has ganado");
        }
        
        for (int i = 0; i <numer.length; i++) {
            System.out.println("los numero eran: "+numer[i]+" en la pocicion "+(i+1));;
        }

    }
    
}
