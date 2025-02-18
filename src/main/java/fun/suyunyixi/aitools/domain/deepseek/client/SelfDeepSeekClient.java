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
@FeignClient(name = "self-deep-seek.client", url = "http://10.197.7.116:8000/v1", configuration = SelfDeepSeekInterceptor.class)
public interface SelfDeepSeekClient {
    /**
     * <h>exec 2 deep seek robot chat </h>
     *
     * @param req {@code }
     * @return {@link String}
     */
    @PostMapping("/chat/completions")
    String chat(@RequestBody DeepSeekChatReqDTO req);
}