package fun.suyunyixi.aitools.domain.deepseek.client;

import fun.suyunyixi.aitools.domain.deepseek.dto.DeepSeekChatReqDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

/**
 * {@code deep-seek.client}
 *
 * @author xu.kai
 * @since 2025/1/26 15:43
 **/
@FeignClient(name = "deep-seek.client", url = "https://api.deepseek.com", configuration = DeepSeekInterceptor.class)
public interface DeepSeekClient {
    /**
     * <h>exec 2 deep seek robot chat </h>
     *
     * @param req {@code }
     * @return {@link String}
     */
    @PostMapping("/chat/completions")
    String chat(@RequestBody DeepSeekChatReqDTO req);
}