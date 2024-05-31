package Seminars.Sem1;

import java.time.LocalDateTime;
import java.util.Scanner;

public class task1_1 {
    public static void main(String[] args) {
        System.out.println(LocalDateTime.now());
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        System.out.println("hi, " + name + '!');
        scanner.close();
    }

}
