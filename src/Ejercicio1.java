import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int minvalue = 1;
        int maxvalue = 100;
        int tries = 0;
        int randomnumber = (int)(Math.random() * (maxvalue - minvalue + 1) + minvalue);
        boolean iscorrect = false;
        System.out.println(randomnumber);
        System.out.println("--Adivina el numero--!");
        System.out.println("Ingresa el numero");

        while(!iscorrect) {
            tries++;
            int entradaUsuario = sc.nextInt();

            if (entradaUsuario == randomnumber) {
                System.out.println("Adivinaste el numero, Felicidades");
                System.out.println("El numero de intentos fue de " + tries);
                iscorrect = true;
            } else if (entradaUsuario > randomnumber) {
                System.out.println("El numero ingresado es mayor al que tratas de adivinar");
                System.out.println("Intentalo nuevamente");

            } else {
                System.out.println("El numero ingresado es menor al que tratas de adivinar");
                System.out.println("Intentalo nuevamente");


            }
        }


    }
}
