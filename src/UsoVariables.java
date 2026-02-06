import org.w3c.dom.ls.LSOutput;

import java.text.DecimalFormat;

public class UsoVariables {

    public static void main(String[] args) {
        int edad = 18;
        String nombre = "Daniel";

        ///  concadenacion

        System.out.println("Mi nombre es : " + nombre + " y mi edad : " + edad);

        boolean cliente = false;
        float estatura = 1.50F;
        short par_zapatos = 2;
        DecimalFormat df = new DecimalFormat("###.00"); // establecer cantidad de decimales

        System.out.println("Mi estatura es: " + df.format(estatura)  + " es cliente?: " + cliente);
    }

}
