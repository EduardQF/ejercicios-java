package arreglos;
import java.util.Scanner;
public class busquedanota2 {
    public static void main(String[] args) {
        Scanner intro=new Scanner(System.in);
        double alternativa=0,valoralt=0,desarrollo=0,valorDesarr=0,otros=0,valorOtros=0,altB=0,desB=0,otrosB=0;
        int alum=0,Notros=0,Ndes=0,Nalt=0,prom=0,max=0,maxAlum=0;
        System.out.println("ingrese cantidad de alumnos");
        alum=intro.nextInt();
        int prueba[][]=new int[alum][4];
        System.out.println("ingrese cantidad de notas de alternativa");
        do {
            alternativa=intro.nextInt();
            if(alternativa<0){
                System.out.println("cantidad ingresada invalida");
            }
        }while(alternativa<0);
        System.out.println("ingrese valor de las alternativas");
        do{
            valoralt=intro.nextInt();
            if(valoralt<0){
            System.out.println("valor ingresada invalido");
            }
        }while(valoralt<0||valoralt>100);
        System.out.println("ingrese cantidad de notas de desarrollo");
        do{
            desarrollo=intro.nextInt();
            if(desarrollo<0){
               System.out.println("cantidad ingresada invalida"); 
            }
        }while(desarrollo<0);
        System.out.println("ingrese valor de las preguntas de desarrolllo");
        do{
            valorDesarr=intro.nextInt();
            if(valorDesarr<0||valorDesarr>100){
                System.out.println("valor ingresado invalido");
            }
        }while(valorDesarr<0||valorDesarr>100);
        
        System.out.println("ingrese cantidad de preguntas de otro tipo");
        do{
            otros=intro.nextInt();
            if(otros<0){
                System.out.println("cantidad ingresada invalida"); 
            }
        }while(otros<0);
        System.out.println("ingrese valor de las otras preguntas");
        do{
            valorOtros=intro.nextInt();
            if(valorOtros<0||valorOtros>100){
                System.out.println("valor ingresado invalido");
            }
        }while(valorOtros<0||valorOtros>100);
        
        
        //
        for (int i = 0; i <prueba.length; i++) {
            for (int j = 0; j < prueba[i].length; j++) {
                switch (j) {
                    case 0:
                        System.out.println("ingrese cantidad de preguntas de alternativa buenas del alumno "+(i+1));
                        do{
                             altB=intro.nextInt();
                             if(altB<0||altB>alternativa){
                                 System.out.println("WARNING cantiad ingresada invalida");
                             }
                        }while(altB<0||altB>alternativa);
                        
                        Nalt=(int) ((altB*70/alternativa)*(valoralt/100));
                        prueba[i][j]=Nalt;
                        break;
                    case 1:
                        System.out.println("ingrese cantidad de preguntas de desarrollo buenas del alumno");
                        do{
                            desB=intro.nextInt(); 
                            if(desB<0||desB>desarrollo){
                                System.out.println("WARNING cantiad ingresada invalida");
                            }
                        }while(desB<0||desB>desarrollo);
                        Ndes=(int) ((desB*70/desarrollo)*(valorDesarr/100));
                        prueba[i][j]=Ndes;
                        break;
                    case 2:
                        System.out.println("ingrese cantidad de preguntas buenas de otro indole del alumno");
                        do{
                            otrosB=intro.nextInt();
                            if(otrosB<0||otrosB>otros){
                                System.out.println("WARNING cantiad ingresada invalida");
                            }
                        }while(otrosB<0||otrosB>otros);
                        Notros=(int) ((otrosB*70/otros)*(valorOtros/100));
                        prueba[i][j]=Notros;
                        break;
                    default:
                        prom=Nalt+Ndes+Notros;
                        prueba[i][j]=prom;
                        if(prom>max){
                            max=prom;
                            maxAlum=i;
                        }
                        break;
                }
            }
        }
        for (int i = 0; i <prueba.length; i++) {
            System.out.println("alumno "+(1+i));
            for (int j = 0; j <prueba[i].length; j++) {
                switch (j) {
                    case 3:
                        System.out.println("la nota de la prueba es: "+prueba[i][j]);
                        break;
                }
            }
        }
        System.out.println("la mejor prueba fue la del alumno "+maxAlum);
        intro.close();
    }
}
