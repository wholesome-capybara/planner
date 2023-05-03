package capybara.wholesome.controller;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {

    @GetMapping(value = "/greeting",
    produces = MediaType.APPLICATION_JSON_VALUE)
    public String greeting(@RequestParam(value = "name", defaultValue = "World") String name) {
        return "{\"name\":\"cos\"}";
    }
}
