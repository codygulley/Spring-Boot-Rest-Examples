package hello;

import java.math.BigDecimal;
import java.util.concurrent.atomic.AtomicLong;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/multiply")
public class MultiplyController {

    @RequestMapping(method=RequestMethod.GET)
    public @ResponseBody
    Multiply multiply(@RequestParam(value="value1", required=true) BigDecimal value1, @RequestParam(value="value2", required=true) BigDecimal value2) {
        if (value1 == null ) {
            throw new IllegalArgumentException("The 'value1' parameter must be included");
        }
        else if (value2 == null){
            throw new IllegalArgumentException("The 'value2' parameter must be included");
        }
        return new Multiply(value1, value2);
    }
}