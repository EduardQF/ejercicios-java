
package cap5;
import java.util.Scanner;
public class cincoceis {
    public static void main(String[]args){
        int i=0;
        int L1=1000,L2=1000,L3=1000,L4=1000,L5=1000,L6=1000,L7=1000,L8=1000,L9=1000,L10=1000;
        int corre1=0,corre2=0,corre3=0,corre4=0,corre5=0,corre6=0,corre7=0,corre8=0,corre9=0,corre10=0;
        int hh=0,mm=0,ss=0,sst=0;
        int equipo=0,equipoA=0,equipoB=0,equipoC=0;
        int cantC=0;
        try(Scanner intro=new Scanner(System.in)){
            System.out.println("ingrese cantidad de corredores");
            cantC=intro.nextInt();
            while(i<cantC){
                System.out.println("ingrese tiempo del corredor "+(i+1)+" en hh:mm:ss");
                hh=intro.nextInt();
                mm=intro.nextInt();
                ss=intro.nextInt();
                sst=(hh*360)+(mm*60)+ss;
                if(sst<L1){
                   L1=sst; 
                    corre2=corre1;
                    corre1=i;
                }else{
                    if(sst<L2){
                        L2=sst; 
                        corre3=corre2;
                        corre2=i;
                    }else{
                        if(sst<L3){
                            L3=sst;
                            corre4=corre3;
                            corre3=i;
                        }else{
                            if(sst<L4){
                                L4=sst;
                                corre5=corre4;
                                corre4=i;
                            }else{
                                if(sst<L5){
                                    L5=sst;
                                    corre6=corre5;
                                    corre5=i;
                                }else{
                                    if(sst<L6){
                                        L5=sst;
                                        corre7=corre6;
                                        corre6=i;
                                    }else{
                                        if(sst<L7){
                                            L7=sst;
                                            corre8=corre7;
                                            corre7=i;
                                        }else{
                                            if(sst<L8){
                                                L8=sst;
                                                corre9=corre8;
                                                corre8=i;
                                            }else{
                                                if(sst<L9){
                                                    L9=sst;
                                                    corre10=corre9;
                                                    corre9=i;
                                                }else{
                                                    corre10=i;
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                            
                            
                    }
                }
                
                System.out.println("ingrese equipo del corredor "+(i+1)+" entre 1,2,3");
                equipo=intro.nextInt();
                if(equipo==1){
                    equipoA++;
                }else{
                    if(equipo==2){
                        equipoB++;
                    }else{
                        equipoC++;
                    }
                }  
                i++;
            }
           System.out.println("el primer lugar es del corredor "+corre1+" con un premio de $100000");
           System.out.println("el segundo lugar es del corredor "+corre2+" con un premio de $80000");
           System.out.println("el tercer lugar es del corredor "+corre3+" con un premio de $60000");
           System.out.println("el cuarto lugar es del corredor "+corre4+" con un premio de $40000");
           System.out.println("el quinto lugar es del corredor "+corre5+" con un premio de $40000");
           System.out.println("el sexto lugar es del corredor "+corre6+" con un premio de $40000");
           System.out.println("el septimo lugar es del corredor "+corre7+" con un premio de $20000");
           System.out.println("el octavo lugar es del corredor "+corre8+" con un premio de $20000");
           System.out.println("el noveno lugar es del corredor "+corre9+" con un premio de $20000");
           System.out.println("el decimo lugar es del corredor "+corre10+" sin ningun premio");
           System.out.println("la cantidad de corredores del equipo 1 son: "+equipoA);
           System.out.println("                                     2 son: "+equipoB);
           System.out.println("                                     3 son: "+equipoC);
        }
    }
}
