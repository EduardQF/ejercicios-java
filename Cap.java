
package cap;

import java.util.Scanner;


public class Cap {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double matrizagua[][]=new double[12][32];
        for (int i = 0; i < matrizagua.length; i++) {
            switch (i) {
                case 0:System.out.println("-------------\nmes: Enero\n------------");break;
                case 1:System.out.println("-------------\nmes: Febrero\n------------");break;
                case 2:System.out.println("-------------\nmes: Marzo\n------------");break;
                case 3:System.out.println("-------------\nmes: Abril\n------------");break;
                case 4:System.out.println("-------------\nmes: Mayo\n------------");break;
                case 5:System.out.println("-------------\nmes: Junio\n------------");break;
                case 6:System.out.println("-------------\nmes: Julio\n------------");break;
                case 7:System.out.println("-------------\nmes: Agosto\n------------");break;
                case 8:System.out.println("-------------\nmes: Septiembre\n------------");break;
                case 9:System.out.println("-------------\nmes: Octubre\n------------");break;
                case 10:System.out.println("-------------\nmes: Noviembre\n------------");break;
                case 11:System.out.println("-------------\nmes: Diciembre\n------------");break;
    
            }
            for (int j = 0; j < matrizagua[i].length; j++) {
                System.out.println("ingrese cantidad de agua gastada por el departamento "+(j+1)+" en m3");
                matrizagua[i][j]=leer();
            }
            
        }
        //consumo anual
        consumoanual(matrizagua);
        //mes con mayor consumo;
        mesmayor(matrizagua);
        //consumo anual pizo
        consumopiso(matrizagua);
    }

    private static Double leer() {
        Scanner intro=new Scanner(System.in);
        double cannt=0;
        String cant=null;
        do
            cant=intro.nextLine();        
        while(verificar(cant));
        cannt=Double.parseDouble(cant);
        return cannt;
    }

    private static void consumoanual(double[][] matrizagua) {
        double consumoanualm3=0;
        double consumodineranual=0;
        double consumodinermensual=0;
        for (int i = 0; i < matrizagua.length; i++) {
            for (int j = 0; j < matrizagua[i].length; j++) {
                consumoanualm3=consumoanualm3+matrizagua[i][j];
                if(matrizagua[i][j]<=5){
                    consumodinermensual=matrizagua[i][j]*100;
                }else{
                    if(matrizagua[i][j]>5 && matrizagua[i][j]<12){
                        consumodinermensual=matrizagua[i][j]*100+2000;
                    }else{
                        consumodinermensual=matrizagua[i][j]*120+(matrizagua[i][j]*0.1);
                                
                    }
                }
                consumodineranual=consumodinermensual+consumodineranual;
            }
        }
        System.out.println("\n--------------\nel consumo anual en m3 del edificio es de: "+consumoanualm3);
        System.out.println("\n----------------\nel consumo anual en $ del edificion es de: "+consumodineranual);
    }

    private static void mesmayor(double[][] matrizagua) {
        double mesconsumo[]=new double[12];
        double max=0;
        int mes=0;
        for (int i = 0; i < matrizagua.length; i++) {
            for (int j = 0; j <matrizagua[i].length; j++) {
                mesconsumo[i]=matrizagua[i][j]+mesconsumo[i];
            }
            if(mesconsumo[i]>max){
                max=mesconsumo[i];
                mes=i;
            }
        }
        System.out.println("--------------------------");
        switch (mes) {
            case 0:System.out.println("el mayor consumo fue el mes de: Enero");break;
            case 1:System.out.println("el mayor consumo fue el mes de: Febrero");break;
            case 2:System.out.println("el mayor consumo fue el mes de: Marzo");break;
            case 3:System.out.println("el mayor consumo fue el mes de: Abril");break;
            case 4:System.out.println("el mayor consumo fue el mes de: Mayo");break;
            case 5:System.out.println("el mayor consumo fue el mes de: Junio");break;
            case 6:System.out.println("el mayor consumo fue el mes de: Julio");break;
            case 7:System.out.println("el mayor consumo fue el mes de: Agosto");break;
            case 8:System.out.println("el mayor consumo fue el mes de: Septiembre");break;
            case 9:System.out.println("el mayor consumo fue el mes de: Octubre");break;
            case 10:System.out.println("el mayor consumo fue el mes de: Noviembre");break;
            case 11:System.out.println("el mayor consumo fue el mes de: Diciembre");break;
            
        }
    }

    private static void consumopiso(double[][] matrizagua) {
        double conspiso[]=new double[8];
        double consumopizo=0;
        for (int i = 0; i < matrizagua.length; i++) {
            for (int j = 0; j < matrizagua[i].length; j++) {
                if(j<4){
                conspiso[0]=matrizagua[i][j]+conspiso[0];
                }else{
                    if(j<8 && j>=4){
                        conspiso[1]=matrizagua[i][j]+conspiso[1];
                    }else{
                        if(j<12&&j>=8){
                            conspiso[2]=matrizagua[i][j]+conspiso[2];
                        }else{
                            if(j<16&&j>=12){
                                conspiso[3]=matrizagua[i][j]+conspiso[3];
                            }else{
                                if(j<20&&j>=16){
                                    conspiso[4]=matrizagua[i][j]+conspiso[4];
                                }else{
                                    if(j<24&&j>=20){
                                        conspiso[5]=matrizagua[i][j]+conspiso[5];
                                    }else{
                                        if(j<28&&j>=24){
                                            conspiso[6]=matrizagua[i][j]+conspiso[6];
                                        }else{
                                            conspiso[7]=matrizagua[i][j]+conspiso[7];
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        System.out.println("consumo anual de cada piso en m3\n");
        System.out.println("piso    consumo anual");
        for (int i = 0; i < conspiso.length; i++) {
            System.out.println(i+"  "+conspiso[i]);
        }
    }

    private static boolean verificar(String cant) {
        if(cant.matches("[0-9]*")){
            return false;
        }
        return true;
    }
    
}
