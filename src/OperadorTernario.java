import java.util.Scanner;

public class OperadorTernario {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresa tu edad ");
        int edad = sc.nextInt();
        String resultado = (edad < 18) ? "Eres menor de edad" : "Eres mayor de edad";

        System.out.println(resultado);

    }
}

