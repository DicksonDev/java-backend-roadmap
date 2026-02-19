public class EjercicioForEach2 {
    public static void main(String[] args) {

        int [] numerosRandoms = new int[200];

        for (int i = 0; i< numerosRandoms.length; i++) {
            int randomNumber = (int)(Math.random() * 200) + 1;
            numerosRandoms[i] = randomNumber;

        }
        for(int n : numerosRandoms) System.out.println("Numero : " + n );
    }
}
