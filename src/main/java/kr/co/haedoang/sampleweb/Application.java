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
        return "hello \uD83D\uDE00, this mode is " + env.getProperty("mode");
    }

    @GetMapping("api/v1/port")
    public String port() {
        return "this application is running on " + env.getProperty("local.server.port") + "port";
    }

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
