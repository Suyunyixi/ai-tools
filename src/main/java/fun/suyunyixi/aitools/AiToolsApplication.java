package fun.suyunyixi.aitools;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * @author Suyunyixi
 * @since 2025-01-26
 */
@SpringBootApplication
@ComponentScan("fun.suyunyixi.aitools.infrastructure")
public class AiToolsApplication {

    public static void main(String[] args) {
        SpringApplication.run(AiToolsApplication.class, args);
    }

}
