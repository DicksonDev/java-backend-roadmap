public class Equals {
    public static void main(String[] args) {

        Integer a = 100000000;
        Integer b = 100000000;

        System.out.println(a == b); // this is false cause is comparing two different space of memory

        System.out.println(a.equals(b)); // this one is true cause is comparing the content of variables

        }
}