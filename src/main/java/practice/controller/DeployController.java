package practice.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/deploy")
public class DeployController {

    @RequestMapping(value = "/")
    public Boolean createAccount() {
        return true;
    }

}
