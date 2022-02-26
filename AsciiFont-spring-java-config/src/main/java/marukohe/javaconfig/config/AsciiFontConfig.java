package marukohe.javaconfig.config;

import asciiPanel.AsciiFont;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AsciiFontConfig {
    @Bean
    public AsciiFont asciiFont() {
        return AsciiFont.CP437_8x8;
    }
}
