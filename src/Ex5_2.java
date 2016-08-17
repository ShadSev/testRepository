/**
 *
 */
import java.math.BigDecimal;
import java.math.RoundingMode;

public class Ex5_2 {
    public static void main (String args[]){

        BigDecimal result = new BigDecimal("0");
        BigDecimal läggTill = new BigDecimal ("0.1");
        result = result.add(läggTill);
        result = result.add(läggTill);
        result = result.add(läggTill);
        result = result.add(läggTill);
        result = result.add(läggTill);
        result = result.add(läggTill);
        result = result.add(läggTill);
        result = result.add(läggTill);
        result = result.add(läggTill);
        result = result.add(läggTill);

        System.out.println(result);

        System.out.println(result.setScale(2, RoundingMode.CEILING));
    }
}
