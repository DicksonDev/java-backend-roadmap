import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        boolean doWhileActive = true;

        do {
            System.out.println("Bienvenido al programa para saber si estas en tu peso ideal");
            System.out.println("Si eres hombre presiona 1 si eres mujer presiona 2 ");
            int gender = sc.nextInt();



            if (gender == 1 ) {
                System.out.println("-- Bienvenido, eres hombre -- ");
                System.out.println("Ingresa tu estatura en cm " );
                int height = sc.nextInt();
                System.out.println("Ingresa tu peso actual : ");
                int weight = sc.nextInt();
                int idealWeightBoy = height - 110;
                System.out.println("Tu peso ideal es : " + idealWeightBoy);
                if (weight > idealWeightBoy) {
                    System.out.println("Estas sobre tu peso ideal");
                    doWhileActive = false;
                } else {
                    System.out.println("estas en tu peso ideal, felicidades");
                    doWhileActive = false;
                }
            } else if (gender == 2) {
                System.out.println("-- Bienvenido, eres mujer -- ");
                System.out.println("Ingresa tu estatura en cm " );
                int height = sc.nextInt();
                System.out.println("Ingresa tu peso actual : ");
                int weight = sc.nextInt();
                int idealWeightGirl = height - 120;
                System.out.println("Tu peso ideal es : " + idealWeightGirl);
                if (weight > idealWeightGirl) {
                    System.out.println("Estas sobre tu peso ideal");
                    doWhileActive = false;
                } else {
                    System.out.println("estas en tu peso ideal, felicidades");
                    doWhileActive = false;
                }
            } else {
                System.out.println("Numero invalido");
            }

        } while (doWhileActive);

        }
}
