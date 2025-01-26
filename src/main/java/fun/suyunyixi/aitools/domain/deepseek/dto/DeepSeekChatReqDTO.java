package fun.suyunyixi.aitools.domain.deepseek.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * {@code }
 *
 * @author xu.kai
 * @since 2025/1/26 15:50
 **/
@NoArgsConstructor
@Data
public class DeepSeekChatReqDTO {

    private String model;
    private List<MessagesDTO> messages;
    private Boolean stream;

    @Data
    @NoArgsConstructor
    @AllArgsConstructor
    public static class MessagesDTO {
        private String role;
        private String content;
    }

    public static DeepSeekChatReqDTO defaultSystem(String message) {
        DeepSeekChatReqDTO dto = new DeepSeekChatReqDTO();
        dto.setStream(false);
        dto.setModel("deepseek-chat");
        dto.setMessages(List.of(
                new MessagesDTO("system", "You are a helpful assistant. And kinder than most"),
                new MessagesDTO("user", message)
        ));
        return dto;
    }
}