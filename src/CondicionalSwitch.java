import java.util.Scanner;

public class CondicionalSwitch {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Ingresa el numero del mes que deseas saber el nombre");
        int mes = sc.nextInt();

        switch (mes) {
            case 1:
                System.out.println("El mes  " + mes + " es Enero");
                break;
            case 2 :
                System.out.println("El mes  " + mes + " es Febrero");
                break;
            case 3 :
                System.out.println("El mes  " + mes + " es Marzo");
                break;
            case 4:
                System.out.println("El mes  " + mes + " es Abril");
                break;
            case 5 :
                System.out.println("El mes  " + mes + " es Mayo");
                break;
            case 6 :
                System.out.println("El mes  " + mes + " es Junio");
                break;
            case 7:
                System.out.println("El mes  " + mes + " es Julio");
                break;
            case 8 :
                System.out.println("El mes  " + mes + " es Agosto");
                break;
            case 9 :
                System.out.println("El mes  " + mes + " es Septiembre");
                break;
            case 10:
                System.out.println("El mes  " + mes + " es Octubre");
                break;
            case 11 :
                System.out.println("El mes  " + mes + " es Noviembre");
                break;
            case 12 :
                System.out.println("El mes  " + mes + " es Diciembre");
                break;
            default:
                System.out.println("Numero de mes incorrecto");
                break;
        }
    }
}
