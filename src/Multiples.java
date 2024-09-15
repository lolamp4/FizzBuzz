public class Multiples {
    static int counter;

    public static void main(String[] args) {
        counter = 0;
        int i = 3;
        while (i < 1000) {
            i = countMultiples(i);
        }
        System.out.println(counter);
    }


    public static int countMultiples(int i) {

        // Find out which numbers divide i.
        boolean divisibleBy3 = i % 3 == 0;
        boolean divisibleBy5 = i % 5 == 0;

        if (divisibleBy3 && divisibleBy5) {
            counter++;
        }
        i++;
        return i;
    }
}

