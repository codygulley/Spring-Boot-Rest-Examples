package hello;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.math.BigDecimal;

/**
 * Created by codygulley on 8/10/16.
 */
@Controller
@RequestMapping("/subtract")
public class SubtractController {

    @RequestMapping(method= RequestMethod.GET)
    public @ResponseBody
    Subtract subtract(@RequestParam(value="value1", required=true) BigDecimal value1, @RequestParam(value="value2", required=true) BigDecimal value2) {
        if (value1 == null ) {
            throw new IllegalArgumentException("The 'value1' parameter must be included");
        }
        else if (value2 == null){
            throw new IllegalArgumentException("The 'value2' parameter must be included");
        }
        return new Subtract(value1, value2);
    }
}
