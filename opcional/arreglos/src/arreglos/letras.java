package arreglos;

public class letras {
    public static void main(String[] args) {
        char ABC[]=new char[31];
        for (int i = 0; i <ABC.length; i++) {
            ABC[i]=(char)('a'+i);
            System.out.print(ABC[i]+" ");
        }
    }
    
}
