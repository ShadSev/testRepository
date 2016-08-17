/**
 *
 */

public class Ex7_1 {
    public static void main(String[] args) {
        int[] input = new int[]{1, 4, 5, 7,20000, -511, 100, -200, 400};
        int sum = 0;
        for(int item: input){
            sum = sum+ item;
        }
        System.out.println(sum);

    }
}
