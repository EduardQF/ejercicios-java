
package arreglos;

public class metodoShellsort {
    
 public static void main(String args[]){
 int array[]=new int[20]; //Este es el array de elementos que vamos a ordenar
     for (int i = 0; i < 20; i++) {
         array[i]=(int)(Math.random()*100+2);
         System.out.println("n "+(i+1)+" : "+array[i]);
     }
 shellSort(array); //llamada al metodo shellSort 
 }//fin del main
 
 public static void shellSort( int a[ ])
 {
 for( int gap = a.length / 2; gap > 0; gap=gap==2 ? 1 : (int) ( gap / 2.2 )){
 for( int i = gap; i < a.length; i++ )
 {
 int tmp = a[ i ];
 int j;
 for(j = i; j >= gap && tmp <  a[ j - gap ] ; j -= gap )
 {
 a[ j ] = a[ j - gap ];
 }
 a[ j ] = tmp;
 }
 }
 // imprimiendo
     System.out.println("\n");
 for ( int i=0;i < a.length;i++){ //Este bucle imprime el contenido del array
 System.out.println(a[i]+" ");
 }    
 }//class ShellSort
}
