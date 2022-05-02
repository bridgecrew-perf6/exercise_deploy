package kr.co.haedoang.sampleweb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class Application {
    private final Environment env;

    public Application(Environment env) {
        this.env = env;
    }

    @GetMapping
    public String index() {
        return "hello, this mode is " + env.getProperty("mode");
    }


    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

}
