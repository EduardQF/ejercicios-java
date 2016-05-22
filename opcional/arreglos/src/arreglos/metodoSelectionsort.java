
package arreglos;

public class metodoSelectionsort {
    public static void main(String[] args) {
        int array[]=new int[20];
        for (int i = 0; i < array.length; i++) {
            array[i]=(int)(Math.random()*100+1);
            System.out.println("n"+(i+1)+" : "+array[i]);
        }
        for (int i = 0; i <array.length-1; i++) {
            int k=i;
            for (int j =i+1; j < array.length; j++) {
                if(array[j]<array[k]){
                    k=j;
                }
            }
            int aux=array[i];
            array[i]=array[k];
            array[k]=aux;
            
        }
        System.out.println("\n\n");
        for (int i = 0; i <array.length; i++) {
            System.out.println("n"+(i+1)+" : "+array[i]);
        }
    }
 
}
