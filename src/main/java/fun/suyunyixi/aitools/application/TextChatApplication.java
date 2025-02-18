package fun.suyunyixi.aitools.application;

import fun.suyunyixi.aitools.domain.deepseek.client.DeepSeekClient;
import fun.suyunyixi.aitools.domain.deepseek.client.SelfDeepSeekClient;
import fun.suyunyixi.aitools.domain.deepseek.dto.DeepSeekChatReqDTO;
import fun.suyunyixi.aitools.infrastructure.enums.ThirdParty;
import jakarta.annotation.Resource;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

/**
 * {@code text chat to ai robot application}
 *
 * @author xu.kai
 * @since 2025/1/26 15:35
 **/
@Slf4j
@Service
public class TextChatApplication {
    @Resource
    private DeepSeekClient deepSeekClient;
    @Resource
    private SelfDeepSeekClient selfDeepSeekClient;

    public String chat(String text, String type) {
        ThirdParty thirdParty = ThirdParty.valueOf(type);
        if (ThirdParty.DeepSeek.equals(thirdParty)) {
            return deepSeekClient.chat(DeepSeekChatReqDTO.defaultSystem(text));
        }
        return selfDeepSeekClient.chat(DeepSeekChatReqDTO.defaultSystem(text));
    }
}