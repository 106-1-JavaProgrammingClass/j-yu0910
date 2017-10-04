import java.util.Scanner;

public class HW07 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int v1 = scn.nextInt();
        System.out.println(Math.round(v1*0.26418f*10)/10f);
    }
}