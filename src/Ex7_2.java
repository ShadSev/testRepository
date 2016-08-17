/**
 *
 */

public class Ex7_2 {
    public static void main(String[] args) {
        int[] input = new int[]{1, 4, 5, 7,20000, -511, 100, -201, 400};

        int i = 0;
        int antalJämna = 0;

        for (int x : input) {
            if (x%2==0)
                antalJämna++;
        }

        int[] result = new int[antalJämna];

        for(int item: input){
            if (item%2==0) {
                result[i]=item;
                i++; }

        }
        for (int x: result){
            System.out.println(x);
          }
        }
    }

