package hello;

import java.math.BigDecimal;

/**
 * Created by codygulley on 8/10/16.
 */
public class Subtract {
    private final BigDecimal value1;
    private final BigDecimal value2;
    private final BigDecimal result;

    public Subtract(BigDecimal value1, BigDecimal value2) {
        this.value1 = value1;
        this.value2 = value2;
        this.result = value1.subtract(value2);
    }
//    public float getValue1() {
//        return value1;
//    }
//
//    public float getValue2() {
//        return value2;
//    }

    public BigDecimal getResult() {
        return result;
    }
}
