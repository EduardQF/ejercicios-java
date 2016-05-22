

package arreglos;
import java.util.Scanner;
public class batallaNaval {
      public static void main(String[] args) {
        Scanner intro= new Scanner(System.in);
        int pc[][]=new int[5][5];
        int usuario[][]=new int[5][5];
        int colum=0, fila=0;
        int barcospc=5,barcosusuario=5;
        for (int i = 0; i <4; i++) {
            for (int j = 0; j < 4; j++) {
                pc[i][j]=0;
                usuario[i][j]=0;
            }
        }
          System.out.println("BATALLA NAVAL\n------------\nel juego consiste en ubicar sus barcos para prepararlos\ncontra la tropa enemiga, para ganar debe undir los 5 barcos\nde su oponente sin que undan todos los suyos\n\n");
          System.out.println("ingrese ");
        //UBICACION DE LOS BARCOS ENEMIGOS
        for (int i = 0; i < 5; i++) {
            fila=(int) (Math.random()*5+1);
            colum=(int) (Math.random()*5+1);
            while(pc[fila-1][colum-1]==1){
                i--;
                break;
            }
            pc[fila-1][colum-1]=1;
            
        }
        //UBICACION DE LOS BARCOS USUARIO
        for (int i = 0; i <5; i++) {
            System.out.println("ingrese pocicion del barco "+(i+1));
            System.out.print("fila: ");
            do{
               fila=intro.nextInt(); 
               if(fila<0||fila>5)System.out.println("WARNING fila no registrada");;
            }while(fila<0||fila>5);
            System.out.print("columna: ");
            do{
                colum=intro.nextInt();
                if(colum<0||colum>5)System.out.println("WARNING columna ingrsada no valida");;
            }while(colum<0||colum>5);
            while(usuario[fila-1][colum-1]==1){
                System.out.println("WARNING ya tiene un barco ahi");
                i--;
                break;
            }
            usuario[fila-1][colum-1]=1;
        }
        
        //inicia el combate naval
        System.out.println("EL COMBATE COMIENZA\nGO");
        do{
            //turno usuario
            System.out.println("\nTU TURNO\nelija pocicion a disparar");
            System.out.print("fila: ");

            do{
                do{
                    fila=intro.nextInt(); 
                    if(fila<0||fila>5)System.out.println("WARNING fila no registrada");;
                }while(fila<0||fila>5);
                System.out.print("columna: ");
                do{
                    colum=intro.nextInt();
                    if(colum<0||colum>5)System.out.println("WARNING columna ingrsada no valida");;
                }while(colum<0||colum>5);
                if(pc[fila-1][colum-1]==2){
                    System.out.println("warning ya disparo ahi");
                }
            }while(pc[fila-1][colum-1]==2);
            if(pc[fila-1][colum-1]==1){
                System.out.println("\nbarco enemigo undido");
                barcospc--;
            }else{
                System.out.println("\nCUACK CUACK fallaste");
            }
            pc[fila-1][colum-1]=2;
            
            //turno pc
            System.out.println("TURNO DEL PC");
            do{
                fila=(int) (Math.random()*5+1);
                colum=(int) (Math.random()*5+1);
                break;
            }while(usuario[fila-1][colum-1]==2);
               
            
            if(usuario[fila-1][colum-1]==1){
                System.out.println("barco jugador undido");
                barcosusuario--;
                System.out.println("\n\nbarcos enemigo "+barcospc+"barcos jugador "+barcosusuario);
            }else{
                System.out.println("te has salvado\n\nbarcos enemigo "+barcospc);
                System.out.println("barcos jugador "+barcosusuario);
            }
            usuario[fila-1][colum-1]=2;
            //comprobacion
                 System.out.println("\n\nsus barcos capitan");
            for (int i = 0; i < 5; i++) {
                 System.out.println("  ");
            for (int j = 0; j < 5; j++) {
                System.out.print(usuario[i][j]+"\t");
            }
        }
        }while(barcospc>0&&barcosusuario>0);
        
        if(barcosusuario>barcospc){
            System.out.println("felicidades Capitan a Ganado el combate naval");
        }else{
            System.out.println("a perdido el combate contra el pc");
        }
    }
}

