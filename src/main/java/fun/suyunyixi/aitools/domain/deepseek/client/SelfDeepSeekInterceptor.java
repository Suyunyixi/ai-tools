package fun.suyunyixi.aitools.domain.deepseek.client;

import feign.RequestInterceptor;
import feign.RequestTemplate;
import fun.suyunyixi.aitools.infrastructure.enums.ThirdParty;
import fun.suyunyixi.aitools.infrastructure.properties.ApiKeyProperties;
import jakarta.annotation.Resource;
import lombok.extern.slf4j.Slf4j;

/**
 * {@code deep seek feign client config }
 *
 * @author xu.kai
 * @since 2025/1/26 15:51
 **/
@Slf4j
public class SelfDeepSeekInterceptor implements RequestInterceptor {
    @Resource
    private ApiKeyProperties apiKeyProperties;

    @Override
    public void apply(RequestTemplate template) {
        template.header("Authorization", "Bearer " + apiKeyProperties.getKey(ThirdParty.SelfDeepSeek));
    }
}