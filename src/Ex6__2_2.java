/**
 *
 */
import java.util.*;

public class Ex6__2_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Skriv :");
        char input = sc.next().charAt(0);

        switch  (input) {
            case 'a':
                System.out.println("Black");
                break;
            case 'b':
            case 'w':
            case 'W':
            case 'v':
                System.out.println("White");
                break;
            case 'c':
                System.out.println("Red");
                break;
            case 'd':
                System.out.println("Green");
                break;
            default:
                System.out.println("Invalid color");
                break;
        }
    }
}
