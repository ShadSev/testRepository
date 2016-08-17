/**
 *
 */
import java.util.*;

public class Ex6__2_1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("a) Svart");
        System.out.println("b) Vit");
        System.out.println("c) Röd");
        System.out.println("d) Grön");
        System.out.print("Välj en färg: ");

        char input= in.next().charAt(0);

        switch (input) {
            case 'a':
                System.out.println("Du valde svart");
                break;
            case 'b':
                System.out.println("Du valde vit");
                break;
            case 'c':
                System.out.println("Du valde röd");
                break;
            case 'd':
                System.out.println("Du valde grön");
                break;
            default:
                System.out.println("Invalid color");
                break;
        }


    }
}
