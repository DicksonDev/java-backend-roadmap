public class Car {

   private String marca;
   private String color;
   private int anio;
   private boolean activo;


    public Car(String marca, String color, int anio, boolean activo) {
        this.marca = marca;
        this.color = color;
        this.anio = anio;
        this.activo = activo;
    }

    public void encendido(){
        activo = true;
        System.out.println("Arrancando");
    }

    public void apagado(){
        activo = false;
        System.out.println("Apagando");
    }

    public void info(){
        System.out.println(marca + " " + color + " " + anio + " " + activo);

    }
}
