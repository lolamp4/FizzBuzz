public class Reduce {
    static int counter;

    public static void main(String[] args) {
        int i = 100;
        counter = 0;
        while (i > 0) {
            i = reducer(i);
            counter++;
        }
        System.out.println(counter);
    }

    public static int reducer(int i) {
        // Find out if i is odd or even.
        boolean IsEven = i % 2 == 0;
        if (IsEven) {
            i /= 2;
        }
        else {
            i -= 1;
        }
        return i;
    }
}
