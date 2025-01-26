package fun.suyunyixi.aitools.facade.resp;

import lombok.Data;

/**
 * {@code the response of text chat}
 *
 * @author xu.kai
 * @since 2025/1/26 15:39
 **/
@Data
public class TextChatResp {
    private String text;

    public static TextChatResp of(String text) {
        TextChatResp resp = new TextChatResp();
        resp.setText(text);
        return resp;
    }
}