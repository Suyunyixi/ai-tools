package fun.suyunyixi.aitools.infrastructure.config;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

/**
 * {@code api key path configuration}
 *
 * @author xu.kai
 * @since 2025/1/26 15:28
 **/
@Getter
@Setter
@Configuration
@ConfigurationProperties(prefix = "key.path")
public class ApiKeyConfig {
    /**
     * deep seek api key path
     */
    private String deepSeek;
}