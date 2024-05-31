import java.util.Random;

public class lib {
    public static void sayHi() {
        System.out.println("hi, mark!");
    }

    private static Random rand = new Random();

    public static int getRandom(int lo, int hi) {
        return lo + rand.nextInt(hi - lo + 1);
} 
}
