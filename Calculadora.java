
package calculadora;
import java.util.Scanner;
public class Calculadora {
    
    public static void main(String[] args) {
        double num=0,suma=0,resta=0,multi=1,div=0,nume=0;
        int Cnum=0,cont=1,op=0;
        Scanner intro= new Scanner(System.in);
        System.out.println("1.sumar");
        System.out.println("2.restar");
        System.out.println("3.multiplicar");
        System.out.println("4.dividir");
        System.out.println("5.raiz");
        System.out.println("6.potencia");
        System.out.println("7.salir");
        System.out.println("ingrese opcion");
        op=intro.nextInt();
        
        
        switch (op){
            case 1:
                System.out.println("ingrese cantidad de numeros");
                Cnum=intro.nextInt();
                do{
                    System.out.println("ingrese numero"+cont);
                    num=intro.nextInt();
                    suma=suma+num;
                    cont++;
                }while(cont<=Cnum);
                System.out.println("la suma de los numeros es: "+suma);
                break;
            case 2:    
                System.out.println("ingrese cantidad de numeros");
                Cnum=intro.nextInt();
                do{
                    System.out.println("ingrese numero"+cont);
                    num=intro.nextInt();
                    resta=resta-num;
                    cont++;
                }while(cont<=Cnum);
                System.out.println("la resta de los numeros es: "+resta);
                break;
            case 3:
                System.out.println("ingrese cantidad de numeros");
                Cnum=intro.nextInt();
                do{
                    System.out.println("ingrese numero"+cont);
                    num=intro.nextInt();
                    multi=multi*num;
                    cont++;
                }while(cont<=Cnum);
                System.out.println("la multiplicacion de los numeros es: "+suma);
                break;
            case 4:
                try {
                    System.out.print("ingrese dividendo:");
                    nume=intro.nextInt();
                    System.out.print("ingrese divisor:");
                    div=intro.nextInt();
                } catch (Number.Formatexeption ex) {
                }
        }
    }
}
