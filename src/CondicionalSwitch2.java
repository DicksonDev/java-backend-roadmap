import java.util.Scanner;

public class CondicionalSwitch2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese su nombre");
        String nombre = sc.nextLine();
        System.out.println("Ingrese el dia ");
        String dia = sc.nextLine().toLowerCase().trim();

        String valorDia = switch (dia) {
            case "lunes" -> "Dia laborable ";
            case "martes" -> "Dia laborable";
            case "miercoles" -> "Dia laborable";
            case "jueves" -> "Dia laborable";
            case "viernes" -> "Dia Laborable";
            case "sabado" -> "Dia no laborable";
            case "domingo" -> "Dia no laboralbe";
            default -> "Dia invalido";
        };

        if (dia.equalsIgnoreCase("Domingo") || dia.equalsIgnoreCase("Sabado")) {
            System.out.println(nombre + "  el dia seleccionado es no laborable : " + valorDia.toLowerCase());
        } else {
            System.out.println(nombre + " El dia es laboral: " + valorDia);
        }
    }
}
