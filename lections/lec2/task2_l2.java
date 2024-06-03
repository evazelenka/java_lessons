package lections.lec2;

public class task2_l2 {
    public static void main(String[] args) {
        String[] name = { "S", "e", "r", "g", "e", "y"};
        String sk = "SERGEY KA.";
        System.out.println(sk.toLowerCase());
        System.out.println(String.join("", name));
        System.out.println(String.join("", "S", "e", "r", "g", "e", "y"));
        System.out.println(String.join("|", "S", "e", "r", "g", "e", "y"));
    }
    
}
