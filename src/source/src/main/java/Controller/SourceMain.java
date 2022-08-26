package Controller;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SourceMain {
    public static void main(String[] args) {

        System.out.println("main 시작");
        SpringApplication.run(SourceMain.class, args);
    }
}
