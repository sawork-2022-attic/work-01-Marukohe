package marukohe.javaconfig;

import asciiPanel.AsciiFont;
import asciiPanel.AsciiPanel;
import marukohe.javaconfig.config.AsciiFontConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import javax.swing.*;

public class Main extends JFrame {
    private static final long serialVersionUID = 1060623638149583738L;

    AsciiPanel terminal;

    public Main() {
        super();
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AsciiFontConfig.class);
        terminal = new AsciiPanel(80, 24, context.getBean(AsciiFont.class));
        terminal.write("This is not a 'Hello World'.", 1, 1);
        add(terminal);
        pack();
    }

    public static void main(String[] args) {
        Main app = new Main();
        app.setDefaultCloseOperation(EXIT_ON_CLOSE);
        app.setVisible(true);
    }
}
