
package arreglos;

public class medio1 {
    public static void main(String[]args){
        int sorteado[]=new int[20];
        int ganados[]=new int[6];
        ganados[0]=3;
        ganados[1]=7;
        ganados[2]=2;
        ganados[3]=18;
        ganados[4]=14;
        ganados[5]=15;
        for (int i = 0; i < sorteado.length; i++) {
            sorteado[i]=(int)(Math.random()*20);
        }
        for (int i = 0; i<sorteado.length; i++) {
            for (int j = 0; j < ganados.length; j++) {
                if(sorteado[i]==ganados[j]){
                    System.out.println("el numero "+sorteado[i]+" a asertado");
                }
                
            }
        }
        
    }
    
}
