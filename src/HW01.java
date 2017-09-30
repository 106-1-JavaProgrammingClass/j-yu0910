import java.util.Scanner;

public class HW01 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int v1 = scn.nextInt(),v2 = scn.nextInt(),v3 = scn.nextInt();
        System.out.println(v1+v2+v3);
        System.out.println((v1+v2+v3)/3);
    }
}