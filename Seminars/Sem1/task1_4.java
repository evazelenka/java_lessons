package Seminars.Sem1;

public class task1_4 {
    public static void main(String[] args) {
        String str = "Welcome to Java lesson";
        String[] arr = str.split(" ");
        StringBuilder sb = new StringBuilder();
        for (int i = arr.length - 1; i >= 0; i --){
            // System.out.printf(arr[i] + ' ');
            sb.append(arr[i]).append(" ");
        }
        System.out.println(sb);
    }
}
