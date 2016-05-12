
package cap5;
    import java.util.Scanner;
public class cincodos {
    public static void main(String[]args){
        int num[]=new int[6];
        int lot[];
        int aciertos=0;
        try (Scanner intro= new Scanner(System.in)){
          
        for (int i = 0; i < num.length; i++) {
            System.out.println("ingrese numero "+(i+1)+" a jugar");  
            do{
               num[i]=intro.nextInt();
               if(num[i]<0||num[i]>41)
                    System.out.println("WARNING numero ingresado no valido");
            }while(num[i]<0||num[i]>41);
             while(cont<i||num[i]!=num[cont]){
                //for(cont=0;cont<i;cont++)
                if(num[i]==num[cont])
                    i--;
                cont++;
            }
       }
  
        }
        //obtenemos los numeros de azar
        lot =new int[6];
        for (int i = 0; i < lot.length; i++) {
            lot[i]=(int)(Math.random()*41)+1;
        }
        for(int i=0;i<6; i++){
            System.out.println("el primer numero ganador es:"+lot[i]);
            for (int j = 0; j < num.length; j++) {
            if(lot[i]==num[j]||lot[i]==num[j]||lot[i]==num[j]||lot[i]==num[j]||lot[i]==num[j]||lot[i]==num[j]){
                aciertos=aciertos+1; 
            }

            }
        }
        
        System.out.println("la cantidad de aciertos es de: "+aciertos);
        switch (aciertos) {
            case 6:
                System.out.println("a obtenido el premio mayor");
                break;
            case 5:
                System.out.println("a ganado el 2do premio");
                break;
            case 4:
                System.out.println("a ganado el 3r premio");
                break;
            case 3:
                System.out.println("le han debuelto el dinero invertido");
                break;
            default:
                System.out.println("no a ganado nada");
                break;

        }
    }   
}
