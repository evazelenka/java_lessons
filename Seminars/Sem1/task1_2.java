package Seminars.Sem1;

import java.util.InputMismatchException;
import java.util.Scanner;
public class task1_2 {
    public static void main(String[] args) {
        while(true){
            live();
        }
    }
    public static void live() {
        System.out.println("how old r u?");
        Scanner scanner = new Scanner(System.in);
        int age;
        try{
            age = scanner.nextInt();
            if(age < 10){
                char z = 3;
                System.out.printf("take this candy ");
                System.out.println(z);
            }
            else if (age < 18){
                char z = 3;
                System.out.printf("take this book ");
                System.out.println(z);
            }
            else if (age < 70){
                char z = 3;
                System.out.println(z);
            }
            else{
                System.out.println("ur life is very long");
            }
        }
        catch(InputMismatchException e){
            System.out.println("this is not a number");
            scanner.close();
            System.exit(0);
        }
        // scanner.close();
        // char x = 3;
        // System.out.println(x);
    }
}
