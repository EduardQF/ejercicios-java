
package ejercicios;

public class ciclos {
   public static void main (String[]arg){
       int cont=0;
       do{//ewstructura hacer
           cont++;
           System.out.print(cont+"  ");
       }while (cont<9);
       
       System.out.println("");
       cont=0;
       
       while(cont<9){//estructura mientras
           cont++;
           System.out.print(cont+"  ");
       }
       System.out.println("");
       for (int i=1;i<=9;i++)//estructura para
           System.out.print(i+"  ");
    }  
}
