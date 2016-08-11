package hello;

import java.math.BigDecimal;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/divide")
@JsonSerialize(include=JsonSerialize.Inclusion.NON_EMPTY)
public class DivideController {

    @RequestMapping(method=RequestMethod.GET)
    public @ResponseBody
    Divide divide(@RequestParam(value="value1", required=true) BigDecimal value1, @RequestParam(value="value2", required=true) BigDecimal value2) {
            return new Divide(value1, value2);
       // }
    }
}