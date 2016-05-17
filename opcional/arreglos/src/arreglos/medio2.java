
package arreglos;
import java.util.Scanner;
public class medio2 {
    public static void main(String[] args) {
        
        String preguntas[]=new String[6];
        int alumno[][];
        int alum=0;
        int compativilidad=0;
        int amor=0,persona=0;
        preguntas[0]="a)¿Cuál es tu color favorito?\n1-Rojo\n2-Azul\n3-Negro\n4-Morado\n5-Blanco\n6-Celeste\n7-Café\n8-Rosado\n9-Verde claro\n10-Verde oscuro";
        preguntas[1]="b)¿Si te encuentras un paquete cerrado en la calle..?\n1-Lo abres\n2-Lo entregas a la policia\n3-Buscas al dueño tu mism@";
        preguntas[2]="c)¿Para tu cumpleaños tu prefieres..?\n1-Dinero\n2-Regalos sorpresa\n3-Regalos escogidos por ti(dentro de lo que se puede pagar";
        preguntas[3]="d)¿Te considerarías apasionad@?\n1-Mucho\n2-Un poco..\n3-Soy algo timid@";
        preguntas[4]="e)¿Crees en el romanticismo y la magia que conlleva?\n1-Si\n2-Talvéz\n3-No";
        preguntas[5]="f)Imaginese de niño.. Dentro de una bolsa existen algunos juguetes. ¿Cuál escoge usted?\n1-Autitos\n2-Legos\n3-Pelota\n4-Figuras de acción\n5-Muñecas\n6-Cubo rubix\n7-Pistolitas\n8-Juego de tasitas de té\n9-Dibujitos para colorear";
        
        Scanner intro=new Scanner(System.in);
        System.out.println("ingrese cantidad de alumnos");
        alum=intro.nextInt();
        alumno=new int[alum][6];
        for (int i=0; i<alumno.length; i++) {
            System.out.println("\n=()=()=()=()=()=()=()=()=()=()=()=()=()=\n==========\n");
            System.out.println("alumno "+(i+1));
            for (int j=0;j<preguntas.length; j++) {
                System.out.print(preguntas[j]+"\nrespuesta: ");
                do{
                alumno[i][j]=intro.nextInt();
                if(alumno[i][j]<0||alumno[i][j]>10)
                        System.out.println("alternativa invalida");
                }while(alumno[i][j]<0||alumno[i][j]>10);
                System.out.println("\n==============\n");
                
            }
        }
        //comparamos
        for (int i = 1; i <alumno.length; i++) {
            for (int j = 0; j <preguntas.length; j++) {
                if(alumno[0][j]==alumno[i][j]){
                    compativilidad=compativilidad+1;
                }
            }
            if(amor<compativilidad){
                amor=compativilidad;
                persona=i+1;
            }
            compativilidad=0;
        }
        if(persona!=0){
        System.out.println("persona "+1+" <3 persona "+persona);
        }else{
            System.out.println("no ahi compativilidad entre todos los alumnos");
        }
    }
}
