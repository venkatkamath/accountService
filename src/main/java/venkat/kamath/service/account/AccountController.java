package venkat.kamath.service.account;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by venkat on 02/04/17.
 */
@RestController
public class AccountController {
    @RequestMapping(value = "/account/info", method = RequestMethod.GET)
    public String getAccountInfo() {
        return "HP India Services Ltd";
    }
}
