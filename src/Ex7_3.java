/**
 *
 */
import java.util.*;

public class Ex7_3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("vad är första talet? ");
        int n1 = input.nextInt();
        System.out.print("Vad är andra talet? ");
        int n2 = input.nextInt();
        int sum = 0;
        String räkning = "" + n1 ;

        if (n2<n1){
            System.out.println("Error message");
        }
        else {

            for (int i = n1; i <= n2; i++) {
                sum = sum + i;
            }

            for (int x = n1 + 1; x <= n2; x++) {
                räkning = räkning + " + " + x;
            }
            System.out.println(räkning + " = " + sum);
        }
    }
}
