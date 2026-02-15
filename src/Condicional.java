import java.util.Scanner;

public class Condicional {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        System.out.println("Ingresa tu nombre" );
        String nombre= sc.nextLine();
        System.out.println("Ingresa tu edad " );
        int edad = sc.nextInt();
        System.out.println("Tu nombre es " + nombre + " tu edad es " + edad);

        if (edad <= 17) {
            System.out.println("Eres menor de edad");
        } else {
            System.out.println("Eres mayor de edad");
        }


    }


}
