package fun.suyunyixi.aitools.infrastructure.properties;

import cn.hutool.core.map.MapUtil;
import fun.suyunyixi.aitools.infrastructure.enums.ThirdParty;
import jakarta.annotation.PostConstruct;
import lombok.Getter;
import lombok.Setter;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

import java.util.Map;

/**
 * {@code api key path configuration}
 *
 * @author xu.kai
 * @since 2025/1/26 15:28
 **/
@Slf4j
@Getter
@Setter
@Configuration
@ConfigurationProperties(prefix = "key.path")
public class ApiKeyProperties {
    /**
     * deep seek api key path
     */
    private String deepSeek = "/home/ai-tools/keys/deep-seek.txt";

    private static final Map<ThirdParty, String> CACHE = MapUtil.newHashMap();

    @PostConstruct
    public void init() {
        CACHE.put(ThirdParty.DeepSeek, readFile(deepSeek));
    }

    public String getKey(ThirdParty type) {
        return CACHE.get(type);
    }

    private static String readFile(String path) {
        try (BufferedReader reader = new BufferedReader(new FileReader(path))) {
            String line;
            StringBuilder content = new StringBuilder();
            while ((line = reader.readLine()) != null) {
                content.append(line);
            }
            return content.toString();
        } catch (IOException e) {
            log.error("read deep seek content error", e);
        }
        return "";
    }
}