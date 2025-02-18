package fun.suyunyixi.aitools.facade;

import fun.suyunyixi.aitools.application.TextChatApplication;
import fun.suyunyixi.aitools.facade.req.TextChatReq;
import fun.suyunyixi.aitools.facade.resp.TextChatResp;
import fun.suyunyixi.aitools.infrastructure.enums.ThirdParty;
import jakarta.annotation.Resource;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

/**
 * {@code DeepSeek api facade}
 *
 * @author xu.kai
 * @since 2025/1/26 15:34
 **/
@RestController
@RequestMapping("/api/deep-seek")
public class DeepSeekController {
    @Resource
    private TextChatApplication textChatApplication;

    /**
     * 复杂的文字兑换。
     *
     * @param req 文字对话请求体
     * @return 返回接收到的数据
     */
    @PostMapping("/chat/{type}")
    public TextChatResp chat(@RequestBody TextChatReq req, @PathVariable String type) {
        return TextChatResp.of(textChatApplication.chat(req.getText(), type));
    }
}