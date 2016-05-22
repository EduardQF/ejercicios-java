
package arreglos;
import java.util.Scanner;
public class complejo1 {
    public static void main(String[] args) {
        Scanner intro=new Scanner(System.in);
        int Cpac=0;
        int j=0;
        int op=0;
        System.out.println("ingrese cantidad de pacientes");
        Cpac=intro.nextInt();
        char priori;
        String pacientes[][]=new String[Cpac][2];
        for (int i = 0; i < Cpac; i++) {
            System.out.println("ingrese nombre del paciente");
            pacientes[i][j]=intro.nextLine();
            System.out.println("codigo\ng.grave\na.ancianos\nn.niños\ningrese estado del paciente del paciente");
            pacientes[i][j+1]=intro.nextLine();
                
        }
        
        do{
            System.out.println("1.elija prioridad\n2.terminar programa");
            do{
            op=intro.nextInt();    
            }while(op<1||op>2); 
            if(op==1){
                System.out.println("ingrese prioridad\ng.grave\na.ancianos\nn.niños");
                priori=intro.next().charAt(0);
                for (int i = 0; i < pacientes.length; i++) {
                    if(pacientes[i][j+1].equals(priori))
                        System.out.println((i+1)+" "+pacientes[i][j]);
                    
                }
            }
            
        }while(op!=2);
        intro.close();
    }
}
