import java.util.Scanner;

public class HW08 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int g = scn.nextInt();
        System.out.println(Math.round(g/600f*10)/10f);
    }
}
