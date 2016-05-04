
package cap5;
import java.util.Scanner;

public class cincocinco {
    public static void main(String[]args){
        try(Scanner intro= new Scanner(System.in)){
            int CFijo=300,total=0;
            int carne=0,Vcarne=0;
            int agre=0;
            int agregado=0,AcumAg=0,precioAg=0;
            int cod=0;            
            System.out.println("codigos");
            System.out.println("1.churrasco");
            System.out.println("2.lomo de cerdo");
            System.out.println("3.ave");
            System.out.println("4.atun");
            System.out.println("");
            System.out.println("ingrese codigo de carne a consumir");
            do{
                carne=intro.nextInt();
                if(carne<1||carne>4)
                  System.out.println("WARNING el codigo ingresado es incorrecto");
            }while(carne<1||carne>4);
            if(carne==1){
                Vcarne=400;
            }else{
                if(carne==2||carne==4){
                    Vcarne=350;
                }else{
                    if(carne==3){
                        Vcarne=250;
                    }
                }
            }
            
            System.out.println("1. con Agregado");
            System.out.println("2. Sin agregado");
            agre= intro.nextInt();
            if(agre==1){
                System.out.println("");
                System.out.println("1.lechuga");
                System.out.println("2.tomate");
                System.out.println("3.champignon");
                System.out.println("4.palta");
                System.out.println("5.palmito");
                System.out.println("6.queso");
                System.out.println("7.tocino");
                System.out.println("8.huevo frito");
                System.out.println("9.cebolla");
                System.out.println("");
                
                do{ 
                    System.out.println("ingrese codigo de agregado");
                    do{
                        agregado=intro.nextInt();
                        if(agregado<1||agregado>9)
                            System.out.println("el codigo ingresado es invalido");
                    }while(agregado<1||agregado>9);
                    System.out.println("ingrese 1 para agregar otro ingrediente");
                    System.out.println("ingrese 2 para calcular precio");
                    do{
                        cod=intro.nextInt();
                        if(cod<1||cod>2)
                            System.out.println("el codigo ingresado es invalido");
                    }while(cod<1||cod>2);
                    AcumAg++;
                }while(cod==1);
                //calculamos precio
                if(AcumAg<3){
                    precioAg=AcumAg*150;
                }else{
                    if(AcumAg>3&&AcumAg<5){
                        precioAg=AcumAg*120;
                    }else{
                     precioAg=AcumAg*100;   
                    }
                }   
            }
             total=CFijo+Vcarne+precioAg;
             System.out.println("el valor total del Sandwich es $:"+total);
        }    
    }
}
