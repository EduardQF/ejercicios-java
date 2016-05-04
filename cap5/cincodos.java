
package cap5;
    import java.util.Scanner;
public class cincodos {
    public static void main(String[]args){
        int num1,num2,num3,num4,num5,num6=0;
        int lot[];
        int aciertos=0;
        try (Scanner intro= new Scanner(System.in)){
            System.out.println("ingrese numero 1 a jugar");
            num1=intro.nextInt();
            System.out.println("ingrese numero 2 a jugar");
            num2=intro.nextInt();
            System.out.println("ingrese numero 3 a jugar");
            num3=intro.nextInt();
            System.out.println("ingrese numero 4 a jugar");
            num4=intro.nextInt();
            System.out.println("ingrese numero 5 a jugar");
            num5=intro.nextInt();
            System.out.println("ingrese numero 6 a jugar");
            num6=intro.nextInt();
        }
        lot =new int[6];
        lot[0]=(int)(Math.random()*40)+1;
        lot[1]=(int)(Math.random()*40)+1;
        lot[2]=(int)(Math.random()*40)+1;
        lot[3]=(int)(Math.random()*40)+1;
        lot[4]=(int)(Math.random()*40)+1;
        lot[5]=(int)(Math.random()*40)+1;
        for(int i=0;i<6; i++){
            System.out.println("el primer numero ganador es:"+lot[i]);
            if(lot[i]==num1||lot[i]==num2||lot[i]==num3||lot[i]==num4||lot[i]==num5||lot[i]==num6){
                aciertos=aciertos+1;
            }
        }
        System.out.println("la cantidad de aciertos es de: "+aciertos);
        if(aciertos==8){
            System.out.println("a obtenido todo el dinero sorteado");
        }else{
            if(aciertos==7){
                
            }
        }
    }   
}
