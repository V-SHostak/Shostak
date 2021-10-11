package decimal;

import java.math.BigDecimal;

public class Decimal {
    public static void main (String args[]){
        BigDecimal b1 = new BigDecimal("23.43");
        BigDecimal b2 = new BigDecimal("23.43");
        BigDecimal b3 = new BigDecimal("24");

        System.out.println(b1.compareTo(b2) == 0);
        System.out.println(b1.compareTo(b3) == 1);
        System.out.println(b1.equals(b2));

        System.out.println(b1.equals(new BigDecimal("23.43")));
        System.out.println(b1 == b2);

        b2 = b2.add(new BigDecimal("0.57"));
        System.out.println(b3.equals(b2));

    }
}
