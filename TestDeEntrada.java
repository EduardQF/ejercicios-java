package te3st.de.entrada;

import java.util.Scanner;

public class TestDeEntrada {
    public static void main(String[] args) {
        int pedidos=0,contP=1;
        int x1,y1=0;
        double hipote=0;
        double acumDist=0;
        double litros=0;
        try (Scanner intro = new Scanner(System.in)) {
            System.out.println("ingrese cantidad de pedidos del día");
            do{
            pedidos=intro.nextInt();
            if(pedidos<0){
            System.out.println("Warning pedidos ingresados no validos");
            }
            }while(pedidos<0);
            
            do{
                System.out.println("ingrese la cordenada de la tienda: "+contP);
                do{
                      System.out.print("x:");
                   x1=intro.nextInt();
                   if(x1<0){
                       System.out.println("WARNING cordenada ingresada invalida");
                   }
                }while(x1<0);             
                do{
                     System.out.print("y:");
                 y1=intro.nextInt();  
                 
                 if(y1<0){
                     System.out.println("WARNING cordenada ingresada invalida");
                 }
                }while(y1<0);
                hipote=Math.sqrt(Math.pow(x1,2)+Math.pow(y1,2));
                acumDist=acumDist+hipote;
                contP++;
            }while(contP<=pedidos);
            litros=acumDist/15;
            System.out.println("distancia total a recorrer: "+acumDist+" km");
            System.out.println("la cantidad de litros a ocupar es: "+litros+" litros de combustible");
        }
    }
}
