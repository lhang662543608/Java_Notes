package sylu.task;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.annotation.EnableScheduling;

@EnableScheduling  //开启定时任务功能
@EnableAsync  //开启异步注解功能
@SpringBootApplication
public class Springboot10TaskApplication {

    public static void main(String[] args) {
        SpringApplication.run(Springboot10TaskApplication.class, args);
    }

}