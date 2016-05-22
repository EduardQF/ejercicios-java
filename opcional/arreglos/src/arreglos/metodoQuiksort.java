//sin funcionar
package arreglos;

public class metodoQuiksort {
    public static void main(String[] args) {
        int a[]={20,30,15,7,12,1};
        int i,j;
        int primero,central,ultimo;
        primero=1;
        ultimo=100;
        int cont=0;
        quicksort(a,0,5);//(arreglo,primero,ultimo)
        for (int k = 0; k < 5; k++) {
           System.out.println(a[k]); 
        }
        
    }

    private static void quicksort(int[] a, int izq, int der) {
        int pivote=a[izq];
        int i=izq;
        int j=der;
        int aux;
        while(i<j){
            while(a[i]<=pivote&&i<j)i++;
            while(a[j]>pivote)j--;
            if(i>j){
                aux=a[i];
                a[i]=a[j];
                a[j]=aux;
            }
        }
        a[izq]=a[j];
        a[j]=pivote;
        if(izq<j-1)quicksort(a,izq,j-1);
        if(j+1<der)quicksort(a,j+1,der);
    }
}