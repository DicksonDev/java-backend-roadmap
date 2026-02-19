import java.util.Scanner;

public class EjercicioFor2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un numero para saber el factorial");
        int number = sc.nextInt();
        int resultado = 1;
        for (int i = number ; i > 0; i--) {
            System.out.println(resultado + " x" + i);
            resultado = resultado*i;
        }
        System.out.println("el factorial es : " + resultado);
    }
}
