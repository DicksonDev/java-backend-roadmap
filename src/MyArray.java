public class MyArray {
    public static void main(String[] args) {
        int myArray[] = new int[5];

        myArray[0] = 12;
        myArray[1] = 11;
        myArray[2] = 10;
        myArray[3] = 9;
        myArray[4] = 8;


        for(int i = 0; i < myArray.length; i++) System.out.println(myArray[i]);

        // Otra forma de inicializar un Array
        int mySecondArray[] = {12,5,6,7};

        for (int i = 0; i < mySecondArray.length; i++) System.out.println(mySecondArray[i]);
    }
}
