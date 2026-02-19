import java.util.Scanner;

public class EjericicioForEach {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String [] paises = new String[8];

        for(int i= 0; i < paises.length; i++) {
            System.out.println("Ingrese un pais " );
            paises[i] = sc.nextLine();

        }
        for (String elemento: paises) System.out.println("Pais : " + elemento);
    }
}
