package marukohe.xmlconfig;

import asciiPanel.AsciiFont;
import asciiPanel.AsciiPanel;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.swing.*;

public class Main extends JFrame {
    private static final long serialVersionUID = 1060623638149583738L;

    AsciiPanel terminal;

    public Main() {
        super();
        ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
        terminal = new AsciiPanel(80, 24, context.getBean("asciiFont", AsciiFont.class));
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
