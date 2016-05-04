
package cap4;
    import java.util.Scanner;
;public class cuatroCinco {
    public static void main(String[]args){
        int grado=0;
        int horas=0;
        int Afp=0;
        int Isapre=0;
        int sueldoB=0;
        int descAfp=0;
        int descIsa=0;
        int horaEx=0;
        int pagoHora=0;
        int sueldoL=0;
        int Empleado=0;
        int contE=0;
        System.out.println("codigos");
        System.out.println("------------------");
        System.out.println("Isapres:");
        System.out.println("1.Colmena");
        System.out.println("2.Ban medica");
        System.out.println("3. Vida 3");
        System.out.println("4.Fonasa");
        System.out.println("");
        System.out.println("AFP");
        System.out.println("Ban Sander");
        System.out.println("Geometrica SA");
        System.out.println("Cuprum");
        System.out.println("provida");
        System.out.println("");
        Scanner intro = new Scanner(System.in);
            System.out.println("ingrese cantidad de empleados");
            Empleado=intro.nextInt();
            System.out.println("");
            System.out.println("ingrese datos del empleado "+contE+1);
            do{
                do{
                    System.out.println("ingrese horas trabajadas al mes");
                    horas=intro.nextInt();
                    if(horas<160||horas>180){
                        System.out.println("horas ingresadas invalidas");}
                }while(horas<160||horas>180);

                do{
                    System.out.println("ingrese gardo en la empresa");
                    grado= intro.nextInt();
                    if(grado<1||grado>3){
                        System.out.println("grado ingesado no valido");
                    }
                }while(grado<1||grado>3);

                do{
                    System.out.println("ingrese AFP del empleado");
                    Afp=intro.nextInt();
                    if(Afp<1||Afp>4){
                        System.out.println("codigo de AFP ingesada no valido");
                    }
                }while(Afp<1||Afp>4);

                do{
                    System.out.println("ingrese Isapre del del empleado");
                    Isapre=intro.nextInt();
                    if(Isapre<1||Isapre>4){
                        System.out.println("codigo de Isapre ingesada no valido");
                    }
                }while(Isapre<1||Isapre>4);
            //calculamos sueldo base
            if(grado==1){
                sueldoB=450000;
            }else{
                if(grado==2){
                    sueldoB=550000;
                }else{
                    sueldoB=700000;
                }
            }
            //calculamos horas extras
            horaEx=(horas-160)/4;
            if(horaEx>7){
               pagoHora=3500;
            }else{
                if(horaEx>=4&&horaEx<=7){
                    pagoHora=3000;
                }else{
                    if(horaEx>0&&horaEx<4){
                        pagoHora=2000;
                    }else{
                        pagoHora=0;
                    }
                }
            }
            //calculamos descuelto por AFP
            if(Afp==1){
                descAfp= (sueldoB*12)/100;
            }else{
                if(Afp==2){
                    descAfp= (int) ((sueldoB*13.4)/100);
                }else{
                    if(Afp==3){
                        descAfp= (int) ((sueldoB*12.3)/100);
                    }else{
                        descAfp= (int) ((sueldoB*12.9)/100);
                    }
                }
            }
            //calculamos descuento por Isapre
            if(Isapre==1){
                descIsa= (int) ((sueldoB*6.5)/100);
            }else{
                if(Isapre==2){
                    descIsa= (int) ((sueldoB*7.3)/100);
                }else{
                    if(Isapre==3){
                        descIsa= (int) ((sueldoB*7)/100);
                    }else{
                        descIsa= (int) ((sueldoB*7)/100);
                    }
                }
            }
            sueldoL=(sueldoB+descIsa+descAfp+pagoHora);
            System.out.println("el sueldo del empleado es: "+sueldoL);
            contE++;
        }while(contE<=Empleado);
        intro.close();            
    }
}
