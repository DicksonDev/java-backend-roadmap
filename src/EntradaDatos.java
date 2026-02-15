import java.util.Scanner;

public class EntradaDatos {
    public static void main(String[] args) {


        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingresa tu nombre");
        String nombre_usuario = entrada.nextLine();
        System.out.println("Ingresa tu edad");
        int edad = entrada.nextInt();
        System.out.println("Tu nombre es " + nombre_usuario + " y tu edad es " + edad);
        entrada.close();
    }

}
