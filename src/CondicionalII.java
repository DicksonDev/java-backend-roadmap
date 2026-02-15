import java.util.Scanner;

public class CondicionalII {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Ingresa tu nombre");
        String nombre = sc.nextLine();
        System.out.println("Ingresa tu edad");
        int edad = sc.nextInt();

        if (edad <=17) {
            System.out.println("Eres menor de edad " + nombre + " " + edad);
        } else if (edad <=32) {
            System.out.println("Eres un adulto joven " + nombre + " " + edad);
        } else if (edad <=100) {
            System.out.println("Eres de la tercera edad " + nombre + " " + edad);
        } else{
            System.out.println("No eres humano " + nombre + " " + edad);
        }

    }
}
