/**
 * program
 */
// public class program {
//     public static void main(String[] args) {
//         var i = 123;
//         // i = --i-i--; // i = 122 - 122 = 0
//         i = i-- - --i; // i = 123 - 121 = 2
//         System.out.println(i);
//     }
//     static String getType(Object o) {
//         return o.getClass().getSimpleName();
        
//     }
// }
// приоритет постфиксного инкремента ниже чем вывод,  а префиксного наоборот


// побитовые операции

/**
 * program
//  */
// public class program {

//     public static void main(String[] args) {
//         int a = 18;
//         // 10010
//         // a = a << 1;
//         System.out.println(a >> 1);
//         // 1001
//     }
// }

/**
 * program
 */
// public class program {

//     public static void main(String[] args) {
//         int a = 5;
//         int b = 2;
//         System.out.println(a | b);
//         // 101
//         // 010
//         // 111
//         System.out.println(a & b);
//         // 101
//         // 010
//         // 000
//         System.out.println(a ^ b);
//         // 101
//         // 010
//         // 111
//     }
// }

// public class program {

//     public static void main(String[] args) {
//         boolean a = true;
//         String s = "qwwe1";
//         boolean b = true;
//         // boolean c = s.length() >= 5 & s.charAt(4) == '1';
//         boolean c = s.length() >= 5 | s.charAt(4) == '1';
//         System.out.println(a | b);
//         // 1
//         // 1
//         // 1
//         System.out.println(a & b);
//         // 1
//         // 1
//         // 1
//         System.out.println(a ^ b);
//         // 1
//         // 1
//         // 0
//         System.out.println(c);
//     }
// }


// Массивы

// public class program {

//     public static void main(String[] args) {
//      int[] arr = new int[10];
//      System.out.println(arr.length);

//      arr = new int[] {1,2,3,4,5};
//      System.out.println(arr.length);
//     }
// }


// Ввод данных

import java.util.Scanner;
/**
 * program
 */
public class program {

    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        System.out.printf("name: ");
        String name = iScanner.nextLine();
        System.out.printf("hi, %s!", name);
        iScanner.close();
        lib.sayHi();

        int a = 10;
        int b = 4;

        int min = a < b ? a*a : b*2;
        System.out.println(min);
    }
}