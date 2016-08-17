/**
 *
 */

public class Ex6_1 {
    public static void main(String[] args) {

        int x=42;
        System.out.println(x);
        System.out.println(x++);
        System.out.println(x);
        System.out.println(++x);
        System.out.println(x);

        x=42;
        //int y= x++ + ++x;
        int y= x;
        x++;
        ++x;
        y =y + x;
        System.out.println(y);

    }
}
