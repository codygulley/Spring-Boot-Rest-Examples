package hello;

import com.sun.org.apache.xpath.internal.operations.Div;

import java.math.BigDecimal;

/**
 * Created by codygulley on 8/10/16.
 */
public class Divide {

    private final BigDecimal value1;
    private final BigDecimal value2;
    private final BigDecimal result;
    private  String error = "";

    public Divide(BigDecimal value1, BigDecimal value2) {
        this.value1 = value1;
        this.value2 = value2;
        this.result = divide(value1, value2);
    }

    public BigDecimal divide(BigDecimal v1, BigDecimal v2){
        BigDecimal answer = new BigDecimal(0);
        try {
            answer = value1.divide(value2);
        }
        catch(ArithmeticException e){
            error = e.toString();
        }
        return answer;
    }

//    public float getValue1() {
//        return value1;
//    }
//
//    public float getValue2() {
//        return value2;
//    }

    public String getError(){
        return error;
    }
    public BigDecimal getResult() {
        return result;
    }

}
