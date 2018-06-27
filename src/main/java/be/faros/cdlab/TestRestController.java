package be.faros.cdlab;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestRestController {

    @RequestMapping(value = "/hello", method = RequestMethod.GET, produces = "application/json")
    public String hello() {
        return "Hello 7";
    }
}
