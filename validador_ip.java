
package ejercisios;
import java.util.Scanner;
public class validador_ip {

    public static void main(String[] args) {
		String ip[]=new String[10];
		for (int i = 0; i < ip.length; i++) {
                    System.out.println("ingrese el numero ip: "+(i+1));
			ip[i]=leer();
			if(validarip(ip[i])!=true){
				System.out.println("WARNING no a ingresado un numero ip\n");
                                i--;
			}else{
                            octetos(ip[i]);
                        }
                        
		}
                

	}

	private static boolean validarip(String ip) {
		ip.matches("[0-9]{1,3}\\.{1,1}[0-9]{1,3}\\.{1,1}[0-9]{1,3}\\.{1,1}[0-9]{1,3}");
                String  cadena[]= ip.split("\\.");
                int octeto=0;
                int n=0;
                for (int i = 0; i <cadena.length; i++) {
                    octeto=Integer.valueOf(cadena[i]);
                    if(octeto>=0 && octeto <=255){
                    n=n+1;
                    }
                }
                if(n==4){return true;}
		return false;
	}

	private static String leer() {
		Scanner intro=new Scanner(System.in);
		String ip= intro.nextLine();
		return ip;
	}

    private static void octetos(String ip) {
        String[] cadena= ip.split("\\.");
        int[] octeto=new int [4];
        String oc=null;
        for (int i = 0; i < octeto.length; i++) {
            octeto[i]=Integer.valueOf(cadena[i]);
            oc=Integer.toBinaryString(octeto[i]);
            while(oc.length()<8){
                oc='0'+oc;
            }
            System.out.print(oc+'.');
        }
        System.out.println("\n");
    }

}
