package Seminars.Sem1;

import java.util.Arrays;

public class task1_3 {
    public static void main(String[] args) {
        // int[] arr = {1, 4, 5, 4, 7, 8};
        int[] arr1 = new int[]{1, 4, 5, 4, 7, 8};
        // int[] arr2 = new int[5];
        System.out.println(Arrays.toString(arr1));
        arr1[2] = 10;
        System.out.println(Arrays.toString(arr1));
        int sum = 0;
        for (int i = 0; i < arr1.length; i++){
            sum+= arr1[i];
        }
        System.out.println(sum);
    }
}
