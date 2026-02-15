import java.util.Scanner;

public class UsoWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        boolean valid = false;
        System.out.println("Bienvenido, introduce tu contrasena");
        String contrasena = sc.nextLine();

        while (!valid) {
            System.out.println("Introduzca la contrasena de nuevo");
            String confirmarContrasena = sc.nextLine();


            if (contrasena.equalsIgnoreCase(confirmarContrasena)) {
                System.out.println("Contrasena valida");
                valid = true;
            }else {
                System.out.println("Cotrasena invalida");
            }

        }
    }
}
