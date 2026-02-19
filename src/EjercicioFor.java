import java.util.Scanner;

public class EjercicioFor {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String email;
        boolean arroba;
        int arrobaCounter = 0;

        do {
            System.out.println("Ingresa tu email");
            email = sc.nextLine();
            arroba = false;

            for(int i = 0; i < email.length(); i++) {
                if (email.charAt(i) == '@'){
                    arroba = true;
                    arrobaCounter++;
                }
            }

            if(arroba== true && arrobaCounter == 1) {
                System.out.println("Email valido : " + email);
                break;
            } else {
                System.out.println("Email invalido");
            }
        } while (!arroba);
    }
}
