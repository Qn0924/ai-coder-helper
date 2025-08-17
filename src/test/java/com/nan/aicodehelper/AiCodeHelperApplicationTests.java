package com.nan.aicodehelper;

import com.nan.aicodehelper.ai.AiCodeHelper;
import dev.langchain4j.data.message.ImageContent;
import dev.langchain4j.data.message.TextContent;
import dev.langchain4j.data.message.UserMessage;
import jakarta.annotation.Resource;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class AiCodeHelperApplicationTests {

	@Resource
    private AiCodeHelper aiCodeHelper;
    @Test
    void chat() {
        aiCodeHelper.chat("你好，我是程序员秋楠");
    }



    @Test
    void chatWithMessage() {
        UserMessage userMessage = UserMessage.from(
                TextContent.from("描述图片"),
                ImageContent.from("https://ts1.tc.mm.bing.net/th/id/OIP-C.tHAIAaw4ZNlr4v2ldAkvYwHaHa?w=182&h=211&c=8&rs=1&qlt=90&o=6&dpr=1.5&pid=3.1&rm=2")
        );
        aiCodeHelper.chatWithMessage(userMessage);
    }
}
