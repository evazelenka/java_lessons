import java.util.Scanner;
public class lection1_task1 {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        System.out.printf("input k: ");
        Integer k = iScanner.nextInt();
        // System.out.printf("input minRange: ");
        // Integer minR= iScanner.nextInt();
        System.out.printf("input maxRange: ");
        Integer maxR = iScanner.nextInt();
        int [] arr = new int [k+1];
        RandomArray(arr, maxR);
        PrintResult(arr);
        iScanner.close();

    }

    public static void RandomArray(int array[], int x) {
        
        for (int i = 0; i < array.length; i++) {
            array[i] = ((int)(Math.random() * (x+1)));
        }
    }

    public static void PrintResult(int array[]) {
        for (int i = 0; i < array.length; i++){
            System.out.println(array[i]);
        }
    }
}
